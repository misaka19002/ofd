package io.onee.ofd.other;

import io.onee.ofd.definition.CTPageBlock;
import io.onee.ofd.definition.CTText;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * Created by admin on 2020/5/19 17:28:15.
 */
public class TextContent extends SimpleContent<CTPageBlock.TextObject> {
    String value = null;
    double width = -1;
    double height = -1;
    List<Double> deltaX = new ArrayList<>();
    
    TextContent(AtomicInteger elementId) {
        super(elementId);
        this.graphicUnit = new CTPageBlock.TextObject();
        this.graphicUnit.setID(elementId.getAndIncrement());
        this.graphicUnit.setFont(SimpleRes.minFontId);
    }
    
    public void setFontId(int fontId) {
        this.graphicUnit.setFont(fontId);
    }
    
    public void setValue(String value) {
        /**
         *  <ofd:TextObject ID="302" Boundary="68.5 7 80 6.35" Font="28" Size="6.61">
         *      <ofd:FillColor Value="156 82 35" />
         *      <ofd:TextCode X="0" Y="5.683674" DeltaX="g 10 6.61">北京增值税电子普通发票</ofd:TextCode>
         *  </ofd:TextObject>
         */
        this.value = value;
        //todo 调整 boundary
        this.graphicUnit.setBoundary(String.format("15.1 25.4 %s %s", this.getWidth(), this.getHeight()));
        this.graphicUnit.setSize(5);
        
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue(value);
        //todo 调整 x,y 坐标
        textCode.setX(0d);
        textCode.setY(this.getAscent());
        textCode.setDeltaX(deltaX.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        
        this.graphicUnit.getCGTransformAndTextCode().clear();
        this.graphicUnit.getCGTransformAndTextCode().add(textCode);
    }
    
    public double getAscent() {
        return this.ascent * rate;
    }
    
    public double getHeight() {
        return this.height < 0 ? (fontSize * rate) : this.height;
    }
    
    public double getWidth() {
        if (this.width < 0) {
            if (StringUtil.isEmpty(this.value)) {
                return 0;
            } else {
                char[] values = this.value.toCharArray();
                double d = 1;
                for (char c : values) {
                    d = (c >= 32 && c <= 126) ? 0.5 : 1;
                    double mm = new BigDecimal(fontSize * rate * d).setScale(3, ROUND_HALF_UP).doubleValue();
                    deltaX.add(mm);
                    this.width = this.width + mm;
                }
                return this.width;
            }
        } else {
            return this.width;
        }
    }
}

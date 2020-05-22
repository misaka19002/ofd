package io.onee.ofd.other;

import io.onee.ofd.definition.CTPageBlock;
import io.onee.ofd.definition.CTText;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
    
    public TextContent() {
        this.graphicUnit = new CTPageBlock.TextObject();
    }
    
    public void setValue(String value) {
        /**
         *  <ofd:TextObject ID="302" Boundary="68.5 7 80 6.35" Font="28" Size="6.61">
         *      <ofd:FillColor Value="156 82 35" />
         *      <ofd:TextCode X="0" Y="5.683674" DeltaX="g 10 6.61">北京增值税电子普通发票</ofd:TextCode>
         *  </ofd:TextObject>
         */
        this.value = value;
        this.graphicUnit.setBoundary(String.format("30 50 %s %s", this.getWidth(), this.getHeight()));
        this.graphicUnit.setFont(1);
        this.graphicUnit.setSize(this.fontSize);
        
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue(value);
        textCode.setX(0d);
        textCode.setY(0d);
        textCode.setDeltaX(deltaX.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        
        this.graphicUnit.getCGTransformAndTextCode().clear();
        this.graphicUnit.getCGTransformAndTextCode().add(textCode);
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

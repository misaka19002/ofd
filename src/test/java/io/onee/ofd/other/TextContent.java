package io.onee.ofd.other;

import io.onee.ofd.definition.CTPageBlock;
import io.onee.ofd.definition.CTText;
import io.onee.ofd.test.Tuple2;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by admin on 2020/5/19 17:28:15.
 */
public class TextContent extends SimpleContent<CTPageBlock.TextObject> {
    String value = null;
    
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
        //调整 boundary
        Tuple2<Double, List<Double>> t = this.font.stringWidthTuple(value);
        this.graphicUnit.setBoundary(String.format("15.1 25.4 %s %s", t.f1, this.font.height()));
        this.graphicUnit.setSize(5);
        
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue(value);
        //调整 x,y 坐标
        textCode.setX(0d);
        textCode.setY(this.font.baselineHeight());
        textCode.setDeltaX(t.f2.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        
        this.graphicUnit.getCGTransformAndTextCode().clear();
        this.graphicUnit.getCGTransformAndTextCode().add(textCode);
    }
}

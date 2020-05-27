package io.onee.ofd.other;

import io.onee.ofd.definition.CTGraphicUnit;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by admin on 2020/5/19 17:27:52.
 */
public class SimpleContent<T extends CTGraphicUnit> {
    
    AtomicInteger elementId;
    
    T graphicUnit;
    double fontSize = 14;
    double ascent = 11.2;
    double descent = 2.8;
    //长度单位 point(字号) 转 mm 的比率
    double rate = 0.352778d;
    
    public SimpleContent(AtomicInteger elementId) {
        this.elementId = elementId;
    }
}

package io.onee.ofd.other;

import io.onee.ofd.definition.CTGraphicUnit;

/**
 * Created by admin on 2020/5/19 17:27:52.
 */
public class SimpleContent<T extends CTGraphicUnit> {
    
    T graphicUnit;
    double fontSize = 14;
    //长度单位 point(字号) 转 mm 的比率
    double rate = 0.352778d;
    
}

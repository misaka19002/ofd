package io.onee.ofd.other;

import io.onee.ofd.definition.CTGraphicUnit;
import io.onee.ofd.project.font.Font;
import io.onee.ofd.project.font.FontFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by admin on 2020/5/19 17:27:52.
 */
public class SimpleContent<T extends CTGraphicUnit> {
    
    AtomicInteger elementId;
    
    T graphicUnit;
    Font font = FontFactory.defaultFont();
    
    public SimpleContent(AtomicInteger elementId) {
        this.elementId = elementId;
    }
    
}

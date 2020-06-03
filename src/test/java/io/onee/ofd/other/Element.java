package io.onee.ofd.other;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by admin on 2020/6/3 17:42:06.
 */
public abstract class Element {
    protected AtomicInteger elementId;
    protected int objectId;
    protected Element parent;
    
    public AtomicInteger getElementId() {
        return this.elementId;
    }
    
    public Element addElement(Element element) {
        element.parent = this;
        element.elementId = this.elementId;
        return this;
    }
    
    //todo
    public void resetObjectId() {
    
    }
}


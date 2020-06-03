package io.onee.ofd.other;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by admin on 2020/6/3 17:42:06.
 * E parentClass
 * T subClass
 */
public abstract class Element<E extends Element, T extends Element> {
    protected AtomicInteger elementId;
    protected int objectId;
    protected E parent;
    protected List<T> child;
    
    public AtomicInteger getElementId() {
        return this.elementId;
    }
    
    public E addElement(T element) {
        element.parent = this;
        element.elementId = this.elementId;
        this.child.add(element);
        return (E) this;
    }
    
    //todo
    public void resetObjectId() {
    
    }
}


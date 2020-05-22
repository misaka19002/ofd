package io.onee.ofd.other;

/**
 * Created by admin on 2020/5/21 16:38:35.
 */
public class MethodNotImplementException extends RuntimeException{
    
    
    public MethodNotImplementException() {
        super();
    }
    
    public MethodNotImplementException(String message) {
        super(message);
    }
    
    public MethodNotImplementException(String message, Throwable e) {
        super(message, e);
    }
    
}

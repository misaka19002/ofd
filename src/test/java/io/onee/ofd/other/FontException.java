package io.onee.ofd.other;

/**
 * Created by admin on 2020/5/21 16:38:35.
 */
public class FontException extends RuntimeException{
    
    
    public FontException() {
        super();
    }
    
    public FontException(String message) {
        super(message);
    }
    
    public FontException(String message, Throwable e) {
        super(message, e);
    }
    
}

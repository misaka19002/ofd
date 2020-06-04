package io.onee.ofd.other;

/**
 * Created by admin on 2020/5/21 16:38:35.
 */
public class PrinterException extends RuntimeException{
    
    
    public PrinterException() {
        super();
    }
    
    public PrinterException(String message) {
        super(message);
    }
    
    public PrinterException(String message, Throwable e) {
        super(message, e);
    }
    
}

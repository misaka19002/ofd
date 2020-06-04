package io.onee.ofd.project;

import io.onee.ofd.other.PrinterRegistry;
import io.onee.ofd.other.SimpleOFD;
import org.junit.jupiter.api.Test;

public class PrinterTest {
    
    
    @Test
    public void loadTest() throws Exception{
        //只加载此类，并不会
        ClassLoader.getSystemClassLoader().loadClass(PrinterRegistry.class.getCanonicalName());
        //会进行初始化类
        Class.forName(PrinterRegistry.class.getCanonicalName());
    
        String aa = PrinterRegistry.getPrinter(SimpleOFD.class).print(new SimpleOFD());
        System.out.println(aa);
        String a = PrinterRegistry.directPrint(new SimpleOFD());
        System.out.println(a);
    }
}

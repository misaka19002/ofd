package io.onee.ofd.other;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrinterRegistry {
    
    private static Logger logger = Logger.getLogger(PrinterRegistry.class.getName());
    
    private static Map<Class, Printer> printers = new ConcurrentHashMap<>();
    
    static {
        genericType(OFDPrinter.class);
    }
    
    public static <T extends Printer> void registerPrinter(Class<T> printerClazz) {
        genericType(printerClazz);
    }
    
    public static Printer getPrinter(Class clazz) {
        return printers.get(clazz);
    }
    
    public static String directPrint(Element element) {
        return printers.get(element.getClass()).print(element);
    }
    
    
    private static <T extends Printer> void genericType(Class<T> t) {
        Type[] types = t.getGenericInterfaces();
        Optional<Type> optional = Arrays.stream(types).filter(type -> {
            if (type instanceof ParameterizedType) {
                return ((ParameterizedType) type).getRawType() == Printer.class;
            } else {
                return false;
            }
        }).findFirst();
        try {
            Type[] generics = ((ParameterizedType) optional.get()).getActualTypeArguments();
            if (generics.length == 0) {
                logger.warning("wrong printer class, doesn't find generic Type. " + t);
            } else {
                printers.put((Class) generics[0], t.newInstance());
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, t + " new instance error ", e);
        }
    }
}

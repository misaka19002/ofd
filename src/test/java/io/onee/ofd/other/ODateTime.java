package io.onee.ofd.other;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;

/**
 * Created by admin on 2020/5/14 20:02:43.
 */
public class ODateTime {

    public static XMLGregorianCalendar now() {
        return XMLGregorianCalendarImpl.parse(LocalDateTime.now().toString());
    }
}

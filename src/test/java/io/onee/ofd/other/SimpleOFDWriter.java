package io.onee.ofd.other;

import com.ctc.wstx.stax.WstxOutputFactory;
import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;
import io.onee.ofd.definition.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringWriter;

/**
 * Created by admin on 2020/5/15 16:01:41.
 */
public class SimpleOFDWriter {
    //com.ctc.wstx.stax.WstxOutputFactory
    private static XMLOutputFactory factory = null;
    private static JAXBContext      jc      = null;
    private static Marshaller       m       = null;
    
    static {
        try {
            factory = WstxOutputFactory.newFactory();
            jc = JAXBContext.newInstance(ObjectFactory.class);
            m = jc.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
    public static String toXmlString(Object obj, boolean pretty) {
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new StringWriter());
            if (pretty) {
                writer = new IndentingXMLStreamWriter(writer);
            }
            m.marshal(obj, writer);
            return writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static String toXmlString(Object obj) {
        return toXmlString(obj, false);
    }
}

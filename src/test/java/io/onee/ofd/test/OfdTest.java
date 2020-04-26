package io.onee.ofd.test;

import com.ctc.wstx.stax.WstxOutputFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.sun.xml.internal.bind.v2.ContextFactory;
import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;
import io.onee.ofd.definition.CTDocInfo;
import io.onee.ofd.definition.OFD;
import io.onee.ofd.definition.ObjectFactory;
import org.junit.Test;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.UUID;

/**
 * Created by admin on 2020/4/16 18:14:20.
 */
public class OfdTest {

    @Test
    public void blankOfd() {
        OFD ofd = new OFD();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        //生成方式1
        JAXB.marshal(ofd, os);
        /**
         <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         <ofd:OFD xmlns:ofd="http://www.ofdspec.org/2016" DocType="OFD" Version="1.0"/>
         */
        System.out.println(os.toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        
        
        try {
            //生成方式2
            Class[] clazz = new Class[]{ObjectFactory.class};
            Marshaller m1 = ContextFactory.createContext( clazz, Collections.emptyMap()).createMarshaller();
            
            StringWriter stringWriter11 = new StringWriter();
            XMLStreamWriter writer11 = XMLOutputFactory.newFactory().createXMLStreamWriter(stringWriter11);
            XMLStreamWriter writer22 = new IndentingXMLStreamWriter(writer11);
    
            m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            m1.marshal(ofd,writer22);
            /**
             <?xml version='1.0' encoding='UTF-8'?>
             <ofd:OFD xmlns:ofd="http://www.ofdspec.org/2016" DocType="OFD" Version="1.0"/>
             */
            System.out.println(stringWriter11.toString());
            
            
            /**
             <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
             <ofd:OFD xmlns:ofd="http://www.ofdspec.org/2016" DocType="OFD" Version="1.0"/>
             */
            m1.marshal(ofd, System.out);
            System.out.println("--------------------------------------------------------------------------------------------");
            
            //生成方式3
            JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            StringWriter stringWriter = new StringWriter();
            XMLStreamWriter writer1 = XMLOutputFactory.newFactory().createXMLStreamWriter(stringWriter);
            XMLStreamWriter writer2 = new IndentingXMLStreamWriter(writer1);
            
            m.marshal(ofd, writer2);
    
            /**
             <?xml version='1.0' encoding='UTF-8'?>
             <ofd:OFD xmlns:ofd="http://www.ofdspec.org/2016" DocType="OFD" Version="1.0"/>
             */
            System.out.println(stringWriter.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    @Test
    public void blankOfdJackson() throws JsonProcessingException {
        OFD ofd = new OFD();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
    
        JaxbAnnotationModule module = new JaxbAnnotationModule();
        XmlMapper objectMapper = XmlMapper.xmlBuilder().build();
        objectMapper.registerModule(module);
    
        String jacksonResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ofd);
        System.out.println(jacksonResult);
        System.out.println("---------------------------------------------------------------------------");
        
        JAXB.marshal(ofd, os);
        System.out.println(os.toString());
    }
    
    /**
     * <pre>
     *     OFD.xml
     * </pre>
     * @throws IOException
     */
    @Test
    public void simpleOfd() throws IOException {
        OFD ofd = new OFD();
        
        
        //docBody
        OFD.DocBody docBody = new OFD.DocBody();
        
        //docBody - docRoot
        docBody.setDocRoot("Doc_1/Document.xml");
        //docBody - signatures
        docBody.setSignatures("Doc_0/Signs/Signatures.xml");
        //docBody - docInfo
        CTDocInfo docInfo = new CTDocInfo();
        docInfo.setDocID(UUID.randomUUID().toString());
        
        //docBody - docInfo - customDatas
        CTDocInfo.CustomDatas customDatas = new CTDocInfo.CustomDatas();
        CTDocInfo.CustomDatas.CustomData data = new CTDocInfo.CustomDatas.CustomData();
        data.setName("CustomDataName");
        data.setValue("customDataValue");
        customDatas.getCustomData().add(data);
        docInfo.setCustomDatas(customDatas);
        
        //docBody - docInfo
        docBody.setDocInfo(docInfo);
        
        //ofd - addDocBody
        ofd.getDocBody().add(docBody);
        
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        JAXB.marshal(ofd, os);
        System.out.println(os.toString());
        System.out.println("------------------------------------------------------------------");
    
        StringWriter stringWriter = new StringWriter();
        //com.ctc.wstx.stax.WstxOutputFactory
        XMLOutputFactory factory = WstxOutputFactory.newFactory();
        try {
            XMLStreamWriter writer1 = factory.createXMLStreamWriter(stringWriter);
            XMLStreamWriter writer2 = new IndentingXMLStreamWriter(writer1);
        
            //xmlOutputFactory.createXMLStreamWriter(System.out);
            //ByteArrayOutputStream bos = new ByteArrayOutputStream();
            //xmlOutputFactory.createXMLStreamWriter(bos);
            JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller m = jc.createMarshaller();
//            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
            m.marshal(ofd, writer2);
            stringWriter.flush();
            // output pretty printed
        
            System.out.println(stringWriter.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        /**
         <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         <ofd:OFD xmlns:ofd="http://www.ofdspec.org/2016" DocType="OFD" Version="1.0">
         <ofd:DocBody>
         <ofd:DocInfo>
         <ofd:DocID>c1d0e977-5250-42cf-af97-26de8148488b</ofd:DocID>
         <ofd:CustomDatas>
         <ofd:CustomData Name="CustomDataName">customDataValue</ofd:CustomData>
         </ofd:CustomDatas>
         </ofd:DocInfo>
         <ofd:DocRoot>Doc_1/Document.xml</ofd:DocRoot>
         <ofd:Signatures>Doc_0/Signs/Signatures.xml</ofd:Signatures>
         </ofd:DocBody>
         </ofd:OFD>
         */
    }
    
    /*
    @Test
    public void dsfsdf() {
        List<String> a = Arrays.asList("201901.txt", "201902.txt", "201903.txt", "201904.txt", "201905.txt", "201906.txt", "201907.txt", "201908.txt", "201909.txt", "201910.txt", "201911.txt", "201912.txt", "202001.txt", "202002.txt", "202003.txt", "202004.txt");
//        String template = "cat %s.txt | awk '{print $2,$3}'| sort -n| uniq  > ../sortorder/%s.txt";
//        String template = "sort %s.txt >./sort2/%s.sort.txt";
        String template = "comm -2 -3 --check-order /data/file/rsyncfile/sg/sortorder/sort2/%s.sort.txt /data/billorder/sortorder/sort2/%s.sort.txt > %s.diff.txt";
        System.out.println(a.size());
        for (String s : a) {
            String aa = s.split("\\.")[0];
            System.out.println(String.format(template, aa, aa, aa));
        }
    }*/
}

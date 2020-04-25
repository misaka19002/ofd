package io.onee.ofd.test.page;

import com.ctc.wstx.stax.WstxOutputFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;
import io.onee.ofd.definition.*;
import org.junit.Test;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

/**
 * Created by admin on 2020/4/24 11:27:56.
 * <pre>
 *     conclusion:
 *      woodstox 效率优于 pure Jaxb
 * </pre>
 */
public class PageWoodstoxTest {
    
    @Test
    public void simplePage() throws JsonProcessingException {
        //pageArea
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
        //template
        Page.Template template = new Page.Template();
        template.setTemplateID(187);
        template.setZOrder("Background");
        
        //content
        //TextObject、PathObject、ImageObject、CompositeObjec、PageBlock
        CTPageBlock.TextObject textObject = new CTPageBlock.TextObject();
        textObject.setID(25);
        textObject.setFont(25);
        textObject.setSize(6.61);//??这个是什么的size
        textObject.setBoundary("68.5 7 80 6.35");
        //textObject - fillColor
        CTColor color = new CTColor();
        color.setValue("156 82 35");
        textObject.setFillColor(color);
        //textObject - textCode
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue("hahaha上了飞机数量的就法律手段看积分老师的课");
        textObject.getCGTransformAndTextCode().add(textCode);
        
        CTText.TextCode textCode2 = new CTText.TextCode();
        textCode2.setValue("杀了对方家里是基辅罗斯大家说的克己复礼圣诞节法律手段看就分类达康数据法律上看到士大夫士大夫大师傅");
        textObject.getCGTransformAndTextCode().add(textCode2);
        
        //pathObject - strokeColor
        CTPageBlock.PathObject pathObject = new CTPageBlock.PathObject();
        pathObject.setID(154);
        pathObject.setBoundary("68.5 18 73 0.25");
        pathObject.setLineWidth(0.25);
        CTColor color2 = new CTColor();
        color2.setValue("156 82 35");
    
        pathObject.setStrokeColor(color2);
        pathObject.setAbbreviatedData("M 0 0 L 73 0");
        
        
        //组装
        Page.Content.Layer layer1 = new Page.Content.Layer();
        layer1.setID(123);
        layer1.getTextObjectOrPathObjectOrImageObject().add(textObject);
        layer1.getTextObjectOrPathObjectOrImageObject().add(pathObject);
        
        Page.Content content = new Page.Content();
        content.getLayer().add(layer1);
        
        Page page = new Page();
        page.setArea(pageArea);
        page.setContent(content);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        JAXB.marshal(page,bos);
        System.out.println(bos.toString());
        
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
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            m.marshal(page, writer2);
            stringWriter.flush();
            // output pretty printed
            
            System.out.println(stringWriter.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        System.out.println("------------------------------------------------------------------");
    
    }
    
    @Test
    public void simplePage2() throws JsonProcessingException {
        //pageArea
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
        //template
        Page.Template template = new Page.Template();
        template.setTemplateID(187);
        template.setZOrder("Background");
        
        //content
        //TextObject、PathObject、ImageObject、CompositeObjec、PageBlock
        CTPageBlock.TextObject textObject = new CTPageBlock.TextObject();
        textObject.setID(25);
        textObject.setFont(25);
        textObject.setSize(6.61);//??这个是什么的size
        textObject.setBoundary("68.5 7 80 6.35");
        //textObject - fillColor
        CTColor color = new CTColor();
        color.setValue("156 82 35");
        textObject.setFillColor(color);
        //textObject - textCode
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue("hahaha上了飞机数量的就法律手段看积分老师的课");
        textObject.getCGTransformAndTextCode().add(textCode);
        
        CTText.TextCode textCode2 = new CTText.TextCode();
        textCode2.setValue("杀了对方家里是基辅罗斯大家说的克己复礼圣诞节法律手段看就分类达康数据法律上看到士大夫士大夫大师傅");
        textObject.getCGTransformAndTextCode().add(textCode2);
        
        //pathObject - strokeColor
        CTPageBlock.PathObject pathObject = new CTPageBlock.PathObject();
        pathObject.setID(154);
        pathObject.setBoundary("68.5 18 73 0.25");
        pathObject.setLineWidth(0.25);
        CTColor color2 = new CTColor();
        color2.setValue("156 82 35");
        
        pathObject.setStrokeColor(color2);
        pathObject.setAbbreviatedData("M 0 0 L 73 0");
        
        
        //组装
        Page.Content.Layer layer1 = new Page.Content.Layer();
        layer1.setID(123);
        layer1.getTextObjectOrPathObjectOrImageObject().add(textObject);
        layer1.getTextObjectOrPathObjectOrImageObject().add(pathObject);
        
        Page.Content content = new Page.Content();
        content.getLayer().add(layer1);
        
        Page page = new Page();
        page.setArea(pageArea);
        page.setContent(content);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        JAXB.marshal(page,bos);
        System.out.println(bos.toString());
        
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

            m.marshal(page, writer2);
            stringWriter.flush();
            // output pretty printed
            
            System.out.println(stringWriter.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("------------------------------------------------------------------");
        
    }
    
    @Test
    public void pureJAXBperformanceTest() {
    
        //pageArea
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
        //template
        Page.Template template = new Page.Template();
        template.setTemplateID(187);
        template.setZOrder("Background");
    
        //content
        //TextObject、PathObject、ImageObject、CompositeObjec、PageBlock
        CTPageBlock.TextObject textObject = new CTPageBlock.TextObject();
        textObject.setID(25);
        textObject.setFont(25);
        textObject.setSize(6.61);//??这个是什么的size
        textObject.setBoundary("68.5 7 80 6.35");
        //textObject - fillColor
        CTColor color = new CTColor();
        color.setValue("156 82 35");
        textObject.setFillColor(color);
        //textObject - textCode
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue("hahaha上了飞机数量的就法律手段看积分老师的课");
        textObject.getCGTransformAndTextCode().add(textCode);
    
        CTText.TextCode textCode2 = new CTText.TextCode();
        textCode2.setValue("杀了对方家里是基辅罗斯大家说的克己复礼圣诞节法律手段看就分类达康数据法律上看到士大夫士大夫大师傅");
        textObject.getCGTransformAndTextCode().add(textCode2);
    
        //pathObject - strokeColor
        CTPageBlock.PathObject pathObject = new CTPageBlock.PathObject();
        pathObject.setID(154);
        pathObject.setBoundary("68.5 18 73 0.25");
        pathObject.setLineWidth(0.25);
        CTColor color2 = new CTColor();
        color2.setValue("156 82 35");
    
        pathObject.setStrokeColor(color2);
        pathObject.setAbbreviatedData("M 0 0 L 73 0");
    
    
        //组装
        Page.Content.Layer layer1 = new Page.Content.Layer();
        layer1.setID(123);
        layer1.getTextObjectOrPathObjectOrImageObject().add(textObject);
        layer1.getTextObjectOrPathObjectOrImageObject().add(pathObject);
    
        Page.Content content = new Page.Content();
        content.getLayer().add(layer1);
    
        Page page = new Page();
        page.setArea(pageArea);
        page.setContent(content);
        
        // 1w = 1214 ms   1213 ms
        // 10w = 3852 ms  3941 ms
        // 20w = 9257 ms  7197 ms  7289 ms
        // 30w = 10729 ms 13240 ms 7369 ms 12923 ms
        // 100w = 35550 ms  38841 ms 21444 ms
        // 200w = 72271 ms  60624 ms
        // 1000w = 347995 ms  325589 ms
        int max = 10_000_00;
        long start = System.currentTimeMillis();
        System.out.println();
        for (int i = 0; i < max; i++) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            JAXB.marshal(page,bos);
            //System.out.println(bos.toString());
        }
        long end = System.currentTimeMillis();
        System.out.println("pure jaxb time used: " + (end - start) +" ms");
        
    }
    
    @Test
    public void JAXB_Woodstox_performanceTest() {
        //pageArea
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
        //template
        Page.Template template = new Page.Template();
        template.setTemplateID(187);
        template.setZOrder("Background");
    
        //content
        //TextObject、PathObject、ImageObject、CompositeObjec、PageBlock
        CTPageBlock.TextObject textObject = new CTPageBlock.TextObject();
        textObject.setID(25);
        textObject.setFont(25);
        textObject.setSize(6.61);//??这个是什么的size
        textObject.setBoundary("68.5 7 80 6.35");
        //textObject - fillColor
        CTColor color = new CTColor();
        color.setValue("156 82 35");
        textObject.setFillColor(color);
        //textObject - textCode
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue("hahaha上了飞机数量的就法律手段看积分老师的课");
        textObject.getCGTransformAndTextCode().add(textCode);
    
        CTText.TextCode textCode2 = new CTText.TextCode();
        textCode2.setValue("杀了对方家里是基辅罗斯大家说的克己复礼圣诞节法律手段看就分类达康数据法律上看到士大夫士大夫大师傅");
        textObject.getCGTransformAndTextCode().add(textCode2);
    
        //pathObject - strokeColor
        CTPageBlock.PathObject pathObject = new CTPageBlock.PathObject();
        pathObject.setID(154);
        pathObject.setBoundary("68.5 18 73 0.25");
        pathObject.setLineWidth(0.25);
        CTColor color2 = new CTColor();
        color2.setValue("156 82 35");
    
        pathObject.setStrokeColor(color2);
        pathObject.setAbbreviatedData("M 0 0 L 73 0");
    
    
        //组装
        Page.Content.Layer layer1 = new Page.Content.Layer();
        layer1.setID(123);
        layer1.getTextObjectOrPathObjectOrImageObject().add(textObject);
        layer1.getTextObjectOrPathObjectOrImageObject().add(pathObject);
    
        Page.Content content = new Page.Content();
        content.getLayer().add(layer1);
    
        Page page = new Page();
        page.setArea(pageArea);
        page.setContent(content);
    
        // 1w = 1032 ms   1064 ms
        // 10w = 2205 ms  2221 ms
        // 20w = 3280 ms  3222 ms  3283 ms 3386 ms
        // 30w = 4174 ms 4377 ms 4223 ms 4354 ms
        // 100w = 10851 ms  10772 ms 12268 ms 10710 ms
        // 200w = 23597 ms  20640 ms 20018 ms
        // 700w = 69158 ms
        // 1000w = 107126 ms  107384 ms
        //com.ctc.wstx.stax.WstxOutputFactory
        XMLOutputFactory factory = WstxOutputFactory.newFactory();
        int max = 10_000_000;
        long start = System.currentTimeMillis();
        Marshaller m = null;
        try {
            JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
            m = jc.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < max; i++) {
            try {
        
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                XMLStreamWriter writer1 = factory.createXMLStreamWriter(bos);
                XMLStreamWriter writer2 = new IndentingXMLStreamWriter(writer1);
        
                m.marshal(page, writer2);
                //bos.flush();
                
                //System.out.println(bos.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
        long end = System.currentTimeMillis();
        System.out.println("jaxb with woodstox time used: " + (end - start) +" ms");
    }
    
    
}

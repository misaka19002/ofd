package io.onee.ofd.test;

import io.onee.ofd.other.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipOutputStream;

/**
 * Created by admin on 2020/5/26 14:25:35.
 */
public class SimpleOFDTest {

    @Test
    public void simpleDocumentTest() {
        SimpleOFD ofd = new SimpleOFD();
        SimpleDocument document = new SimpleDocument();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(baos);
        ofd.addElement(document);
        document.toXml(zipOutputStream);
        System.out.println("aa");
    }
    @Test
    public void simpleofdTest() {
        //ofd
        SimpleOFD ofd = new SimpleOFD();
        ofd.setAuthor("wyd-hahaha hahage");
        //ofd.getSimpleDocument().addRes(SimpleRes);
        
        //document & page
        SimplePage page1 = ofd.getSimpleDocument().newPage();
        page1.setArea(PageArea.A4.setMargin(PageArea.Margin.Middle));
        
        //content
        TextContent text1 = page1.createTextContent();
        text1.setValue("你好1234596787643246865三案");
        
        //add
        page1.addContent(text1);
    
        ByteArrayOutputStream bos = ofd.toOfd();
    
        Path file = Paths.get("/srv/simpleOfd.ofd");
    
        try {
            Files.write(file, bos.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package io.onee.ofd.test;

import io.onee.ofd.other.SimpleDocument;
import io.onee.ofd.other.SimpleOFD;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
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
    
    }
}

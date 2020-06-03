package io.onee.ofd.other;

import io.onee.ofd.definition.CTDocInfo;
import io.onee.ofd.definition.OFD;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.definition.OFD.DocBody;

/**
 * Created by admin on 2020/5/14 19:19:13.
 */
public class SimpleOFD extends Element<SimpleOFD, SimpleDocument> implements Writable  {
    
    static boolean PRETTY_OUTPUT = true;
    private static final String OFD_XML = "OFD.XML";
    
    public static int DOCID = 50;
    private static String DEFAULT_CREATOR         = "ONEE_OFD";
    private static String DEFAULT_CREATOR_VERSION = "0.0.1";
    
    //init 1024*50 kb
    private ByteArrayOutputStream bos = new ByteArrayOutputStream(51200);
    private ZipOutputStream zos = new ZipOutputStream(bos);
    
    private OFD  ofd = new OFD();
    
    public SimpleOFD() {
        this.elementId = new AtomicInteger();
        this.child = new ArrayList<>();
    }
    
    public List<SimpleDocument> getSimpleDocument() {
        return this.child;
    }
    
    @Override
    public SimpleOFD addElement(SimpleDocument document) {
        super.addElement(document);
        //docInfo
        CTDocInfo docInfo = new CTDocInfo();
        docInfo.setDocID(UUID.randomUUID().toString());
        docInfo.setCreator(DEFAULT_CREATOR);
        docInfo.setCreatorVersion(DEFAULT_CREATOR_VERSION);
        docInfo.setCreationDate(ODateTime.now());
        //docBody
        DocBody docBody = new DocBody();
        docBody.setDocInfo(docInfo);
        docBody.setDocRoot(document.getPath());
        //DocBody.Versions versions = new DocBody.Versions();
        //versions.getVersion().add(new DocBody.Versions.Version());
    
        //add docBody
        this.ofd.getDocBody().add(docBody);
        return this;
    }
    
    /**
     * 作者名称
     *
     * @param author
     * @return
     */
    public SimpleOFD setAuthor(String author) {
        this.ofd.getDocBody().get(0).getDocInfo().setAuthor(author);
        return this;
    }
    
    public void setPrettyOutput(boolean prettyOutput) {
        PRETTY_OUTPUT = prettyOutput;
    }
    
    @Override
    public void toXml(ZipOutputStream zipOutputStream) {
        
        try {
            //本元素生成
            //write ofd.xml
            writeZipEntry(OFD_XML, SimpleOFDWriter.toXmlString(ofd, PRETTY_OUTPUT), zipOutputStream);
            //子元素生成
            //write doc
            this.child.forEach(x -> x.toXml(zipOutputStream));
            zos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * zip all files
     */
    public ByteArrayOutputStream toOfd() {
        this.toXml(zos);
        return bos;
    }
    
    
}

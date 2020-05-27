package io.onee.ofd.other;

import io.onee.ofd.definition.CTDocInfo;
import io.onee.ofd.definition.OFD;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.definition.OFD.DocBody;

/**
 * Created by admin on 2020/5/14 19:19:13.
 */
public class SimpleOFD implements Writable {
    
    static boolean PRETTY_OUTPUT = true;
    
    public static int DOCID = 50;
    private static String DEFAULT_CREATOR         = "ONEE_OFD";
    private static String DEFAULT_CREATOR_VERSION = "0.0.1";
    
    //init 1024*50 kb
    private ByteArrayOutputStream bos = new ByteArrayOutputStream(51200);
    private ZipOutputStream zos = new ZipOutputStream(bos);
    
    private OFD ofd = new OFD();
    private SimpleDocument document = new SimpleDocument();
    
    public SimpleOFD() {
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
    }
    
    public SimpleDocument getSimpleDocument() {
        return this.document;
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
            writeZipEntry("OFD.xml", SimpleOFDWriter.toXmlString(ofd, PRETTY_OUTPUT), zipOutputStream);
            //子元素生成
            //write doc
            document.toXml(zipOutputStream);
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

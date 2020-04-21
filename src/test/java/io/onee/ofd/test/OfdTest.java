package io.onee.ofd.test;

import io.onee.ofd.definition.CTAction;
import io.onee.ofd.definition.CTDocInfo;
import io.onee.ofd.definition.CTPermission;
import io.onee.ofd.definition.OFD;
import org.junit.Test;

import javax.xml.bind.JAXB;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by admin on 2020/4/16 18:14:20.
 */
public class OfdTest {

    @Test
    public void blankOfd() {
        OFD ofd = new OFD();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        JAXB.marshal(ofd, os);
        System.out.println(os.toString());
    }
    
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
        data.setName("customDataName");
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
    
    
        CTAction action = new CTAction();
        JAXB.marshal(action, System.out);
    
        
        CTPermission ctPermission = new CTPermission();
        JAXB.marshal(ctPermission, System.out);
    }
}

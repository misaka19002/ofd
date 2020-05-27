package io.onee.ofd.other;

import io.onee.ofd.definition.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.definition.Document.CommonData;
import static io.onee.ofd.definition.Document.Pages;
import static io.onee.ofd.other.SimpleOFD.*;

/**
 * Created by admin on 2020/5/15 9:35:37.
 */
public class SimpleDocument implements Writable {
    private AtomicInteger elementId = new AtomicInteger(50);
    
    private Document document;
    
    private List<SimplePage> simplePages = new ArrayList<>();
    
    public SimpleDocument() {
        CommonData commonData = new CommonData();
        commonData.setPageArea(PageArea.A4.toCTPageArea());
        commonData.getPublicRes().add(getPublicRes().name);
        commonData.getDocumentRes().add(getDocumentRes().name);
        this.document = new Document();
        this.document.setCommonData(commonData);
        this.document.setPages(new Pages());
    }
    
    public String getPath() {
        return String.format("Doc_%s/Document.xml", DOCID);
    }
    
    public SimplePage newPage() {
        SimplePage simplePage = new SimplePage(elementId);
        this.simplePages.add(simplePage);
        document.getPages().getPage().add(simplePage.getPagesPage());
        return simplePage;
    }
    
    /**
     * removePage by index ,start from 0.
     * @param pageIndex pageList index
     */
    public void removePage(int pageIndex) {
        //todo set simplePage params
        SimplePage simplePage = this.simplePages.remove(pageIndex);
        document.getPages().getPage().remove(simplePage.getPagesPage());
        
    }
    
    public SimpleRes getPublicRes() {
        return SimpleRes.PublicRes;
    }
    
    public SimpleRes getDocumentRes() {
        return SimpleRes.DocumentRes;
    }
    
    @Override
    public void toXml(ZipOutputStream zipOutputStream) {
        try {
            document.getCommonData().setMaxUnitID(elementId.get());
            writeZipEntry(getPath(), SimpleOFDWriter.toXmlString(document, PRETTY_OUTPUT), zipOutputStream);
            this.getPublicRes().toXml(zipOutputStream);
            this.getDocumentRes().toXml(zipOutputStream);
            simplePages.forEach(simplePage -> simplePage.toXml(zipOutputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

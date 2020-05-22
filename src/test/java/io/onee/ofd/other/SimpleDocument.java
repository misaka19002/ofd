package io.onee.ofd.other;

import io.onee.ofd.definition.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.definition.Document.CommonData;
import static io.onee.ofd.definition.Document.Pages;
import static io.onee.ofd.other.SimpleOFD.PRETTY_OUTPUT;

/**
 * Created by admin on 2020/5/15 9:35:37.
 */
public class SimpleDocument implements Writable {
    private AtomicInteger elementId = new AtomicInteger(10);
    
    private int      documentId;
    private Document document;
    private String   path;
    
    private List<SimplePage> simplePages = new ArrayList<>();
    
    public SimpleDocument() {
        CommonData commonData = new CommonData();
        commonData.setPageArea(PageArea.A4.toCTPageArea());
        this.documentId = elementId.getAndIncrement();
        this.path = String.format("Doc_%s/Document.xml", documentId);
        this.document = new Document();
        this.document.setCommonData(commonData);
        this.document.setPages(new Pages());
    }
    
    public String getPath() {
        return path;
    }
    
    public SimplePage newPage() {
        SimplePage simplePage = new SimplePage(elementId, String.format("Pages/Page_%s/Content.xml"));
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
    
    @Override
    public void toXml(ZipOutputStream zipOutputStream) {
        try {
            document.getCommonData().setMaxUnitID(elementId.get());
            
            writeZipEntry(path, SimpleOFDWriter.toXmlString(document, PRETTY_OUTPUT), zipOutputStream);
            simplePages.forEach(simplePage -> simplePage.toXml(zipOutputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
}

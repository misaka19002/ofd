package io.onee.ofd.other;

import io.onee.ofd.definition.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.definition.Document.CommonData;
import static io.onee.ofd.definition.Document.Pages;

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
        Pages pages = new Pages();
        this.documentId = elementId.getAndIncrement();
        this.path = String.format("Doc_%s/Document.xml", documentId);
        this.document = new Document();
        this.document.setCommonData(commonData);
        this.document.setPages(pages);
    }
    
    public String getPath() {
        return path;
    }
    
    public SimplePage newPage() {
        SimplePage simplePage = new SimplePage();
        this.simplePages.add(simplePage);
        return simplePage;
    }
    
    /**
     * removePage by index ,start from 0.
     * @param pageIndex pageList index
     */
    public void removePage(int pageIndex) {
        this.simplePages.remove(pageIndex);
    }
    
    @Override
    public void toXml(ZipOutputStream zipOutputStream) {
        try {
            writeZipEntry(path, SimpleOFDWriter.toXmlString(document, true), zipOutputStream);
            simplePages.forEach(simplePage -> simplePage.toXml(zipOutputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
}

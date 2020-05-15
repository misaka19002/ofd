package io.onee.ofd.other;

import io.onee.ofd.definition.Page;

import java.io.IOException;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.definition.Document.Pages;

/**
 * Created by admin on 2020/5/15 10:36:34.
 */
public class SimplePage implements Writable {
    //content area
    Page       page      = new Page();
    //id location
    Pages.Page pagesPage = new Pages.Page();
    
    Page getPage() {
        return page;
    }
    
    Pages.Page getPagesPage() {
        return pagesPage;
    }
    
    @Override
    public void toXml(ZipOutputStream zipOutputStream) {
        try {
            //todo 最新进度
            writeZipEntry("", SimpleOFDWriter.toXmlString(null, true), zipOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

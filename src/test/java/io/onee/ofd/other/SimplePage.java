package io.onee.ofd.other;

import io.onee.ofd.definition.CTPageArea;
import io.onee.ofd.definition.Page;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.definition.Document.Pages;
import static io.onee.ofd.other.SimpleOFD.PRETTY_OUTPUT;

/**
 * Created by admin on 2020/5/15 10:36:34.
 */
public class SimplePage implements Writable {
    //content area
    Page       page      = new Page();
    //id location
    Pages.Page pagesPage = new Pages.Page();
    
    //layer
    Page.Content.Layer defaultLayer;
    
    private AtomicInteger elementId;
    
    public SimplePage(AtomicInteger elementId, String path) {
        Page.Content content = new Page.Content();
        Page.Content.Layer layer = new Page.Content.Layer();
        layer.setID(elementId.getAndIncrement());
        content.getLayer().add(layer);
        
        this.elementId = elementId;
        this.pagesPage.setBaseLoc(path);
        this.pagesPage.setID(elementId.getAndIncrement());
        this.page.setArea(PageArea.A4.toCTPageArea());
        this.page.setContent(content);
        this.defaultLayer = layer;
    }
    
    Page getPage() {
        return page;
    }
    
    Pages.Page getPagesPage() {
        return pagesPage;
    }
    
    @Override
    public void toXml(ZipOutputStream zipOutputStream) {
        try {
            writeZipEntry(pagesPage.getBaseLoc(), SimpleOFDWriter.toXmlString(page, PRETTY_OUTPUT), zipOutputStream);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public SimplePage setArea(CTPageArea ctPageArea) {
        this.page.setArea(ctPageArea);
        return this;
    }
    
    public SimplePage addContent(SimpleContent content) {
        //CTPageBlock.TextObject;
        //CTPageBlock.PathObject;
        /**
         *  <ofd:TextObject ID="302" Boundary="68.5 7 80 6.35" Font="28" Size="6.61">
         *      <ofd:FillColor Value="156 82 35" />
         *      <ofd:TextCode X="0" Y="5.683674" DeltaX="g 10 6.61">北京增值税电子普通发票</ofd:TextCode>
         *  </ofd:TextObject>
         *  <ofd:PathObject ID="304" Boundary="68.5 18 73 0.25" LineWidth="0.25">
         *      <ofd:StrokeColor Value="156 82 35" />
         *      <ofd:AbbreviatedData>M 0 0 L 73 0</ofd:AbbreviatedData>
         *  </ofd:PathObject>
         */
        //draw layer
        defaultLayer.getTextObjectOrPathObjectOrImageObject().add(content);
        return this;
    }
    
}

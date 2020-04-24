package io.onee.ofd.test.document;

import io.onee.ofd.definition.Res;
import org.junit.Test;

import javax.xml.bind.JAXB;

/**
 * Created by admin on 2020/4/22 10:29:21.
 */
public class DocumentResTest {

    @Test
    public void blankDocumentRes() {
    
    }
    
    @Test
    public void simpleDocumentRes() {
        //colorSpaces
        Res.ColorSpaces.ColorSpace colorSpace = new Res.ColorSpaces.ColorSpace();
        colorSpace.setID(10);
        colorSpace.setType("RGB");
        colorSpace.setBitsPerComponent(8);
        Res.ColorSpaces colorSpaces = new Res.ColorSpaces();
        colorSpaces.getColorSpace().add(colorSpace);
    
        //fonts
        Res.Fonts.Font font = new Res.Fonts.Font();
        font.setID(25);
        font.setFontName("宋体");
        font.setFamilyName("宋体");
        font.setBold(true);
    
        Res.Fonts fonts = new Res.Fonts();
        fonts.getFont().add(font);
    
        //multiMedias
        Res.MultiMedias.MultiMedia multiMedia = new Res.MultiMedias.MultiMedia();
        multiMedia.setID(1);
        multiMedia.setType("Image");
        multiMedia.setMediaFile("image_0.png");
        Res.MultiMedias multiMedias = new Res.MultiMedias();
        multiMedias.getMultiMedia().add(multiMedia);
        
        //drawParams delay
        //CompositeGraphicUnits delay
    
        //组装
        Res documentRes = new Res();
        //docRes
        documentRes.setBaseLoc("Res");
        documentRes.getColorSpacesOrDrawParamsOrFonts().add(colorSpaces);
        documentRes.getColorSpacesOrDrawParamsOrFonts().add(fonts);
        documentRes.getColorSpacesOrDrawParamsOrFonts().add(multiMedias);
        
        JAXB.marshal(documentRes,System.out);
    }
}

package io.onee.ofd.other;

import io.onee.ofd.definition.Res;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipOutputStream;

import static io.onee.ofd.other.SimpleOFD.DOCID;
import static io.onee.ofd.other.SimpleOFD.PRETTY_OUTPUT;

/**
 * Created by admin on 2020/5/26 15:30:10.
 */
public class SimpleRes implements Writable{
    public static int minFontId = 20;
    public static int minColorSpaceId = 10;
    private long maxFontId = 30;
    private long maxColorSpaceId = 20;
    public static AtomicInteger DefaultColorSpaceId = new AtomicInteger(minColorSpaceId);
    public static AtomicInteger DefaultFontId = new AtomicInteger(minFontId);
    public static String DefaultResLoc = "Res";
    public static SimpleRes PublicRes = initPublicRes();
    public static SimpleRes DocumentRes = initDocumentRes();
    
    String name;
    Res res = new Res();
    
    private static SimpleRes initPublicRes() {
        SimpleRes simpleRes = new SimpleRes("PublicRes");
        simpleRes.res.setBaseLoc(DefaultResLoc);
        
        /**
         *     <ofd:ColorSpaces>
         *         <ofd:ColorSpace ID="10" BitsPerComponent="8" Type="RGB"/>
         *     </ofd:ColorSpaces>
         */
        Res.ColorSpaces.ColorSpace colorSpace = new Res.ColorSpaces.ColorSpace();
        colorSpace.setID(DefaultColorSpaceId.getAndIncrement());
        colorSpace.setBitsPerComponent(8);
        colorSpace.setType("RGB");
        Res.ColorSpaces colorSpaces = new Res.ColorSpaces();
        colorSpaces.getColorSpace().add(colorSpace);
    
        /**
         *     <ofd:Fonts>
         *         <ofd:Font ID="25" Bold="true" Charset="unicode" FamilyName="宋体" FixedWidth="false" FontName="宋体" Italic="false" Serif="false"/>
         *     </ofd:Fonts>
         *
         */
        //宋体
        Res.Fonts.Font simsun = newFont("宋体");
        //楷体
        Res.Fonts.Font simkai = newFont("楷体");
        //黑体
        Res.Fonts.Font simhei = newFont("黑体");
        Res.Fonts fonts = new Res.Fonts();
        fonts.getFont().add(simsun);
        fonts.getFont().add(simkai);
        fonts.getFont().add(simhei);
    
        simpleRes.res.getColorSpacesOrDrawParamsOrFonts().add(colorSpaces);
        simpleRes.res.getColorSpacesOrDrawParamsOrFonts().add(fonts);
        return simpleRes;
    }
    
    private static SimpleRes initDocumentRes() {
        SimpleRes simpleRes = new SimpleRes("DocumentRes");
        simpleRes.res.setBaseLoc(DefaultResLoc);
        return simpleRes;
    }
    
    private static Res.Fonts.Font newFont(String fontName) {
        return newFont(fontName, fontName);
    }
    
    private static Res.Fonts.Font newFont(String fontName, String familyName) {
        Res.Fonts.Font font = new Res.Fonts.Font();
        font.setID(DefaultFontId.getAndIncrement());
        font.setFontName(fontName);
        font.setFamilyName(familyName);
        return font;
    }
    
    SimpleRes(String name) {
        this.name = name + ".xml";
    }
    
    public SimpleRes createFont(File fontFile) {
        Font awtFont = null;
        try {
            awtFont = Font.createFont(Font.TRUETYPE_FONT, fontFile);
        } catch (FontFormatException | IOException e) {
            throw new FontException("font parse exception", e);
        }
        Res.Fonts.Font font = new Res.Fonts.Font();
        font.setID(DefaultFontId.getAndIncrement());
        font.setBold(awtFont.isBold());
        font.setItalic(awtFont.isItalic());
        font.setFontName(awtFont.getFontName());
        font.setFamilyName(awtFont.getFamily());
        //todo 设置
        font.setFontFile(null);
        if (font.getID() > maxFontId) {
            throw new FontException("maxFontId: " + maxFontId);
        } else {
            this.res.getColorSpacesOrDrawParamsOrFonts().add(font);
        }
        return this;
    }
    
    public SimpleRes createFont() {
        Res.Fonts.Font font = new Res.Fonts.Font();
        font.setID(DefaultFontId.getAndIncrement());
        if (font.getID() > maxFontId) {
            throw new FontException("maxFontId: " + maxFontId + ", now: " + font.getID());
        } else {
            this.res.getColorSpacesOrDrawParamsOrFonts().add(font);
        }
        return this;
    }
    
    @Override
    public void toXml(ZipOutputStream zipOutputStream) {
        try {
            writeZipEntry(String.format("Doc_%s/%s", DOCID, name), SimpleOFDWriter.toXmlString(res, PRETTY_OUTPUT), zipOutputStream);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

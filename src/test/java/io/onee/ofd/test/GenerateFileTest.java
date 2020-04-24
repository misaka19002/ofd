package io.onee.ofd.test;

import io.onee.ofd.definition.*;
import org.junit.Test;

import javax.xml.bind.JAXB;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by admin on 2020/4/16 18:14:20.
 */
public class GenerateFileTest {

    
   
    @Test
    public void generateOfdFile() throws IOException, InterruptedException {
    
        String ofdXml = simpleOFD();
        String documentXml = simpleDocument();
        String documentResXml = simpleDocumentRes();
        String pageXml = simplePage();
    
        ByteArrayOutputStream zipByte = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(zipByte);
        
        ZipEntry ofdEntry = new ZipEntry("OFD.xml");
        zos.putNextEntry(ofdEntry);
        zos.write(ofdXml.getBytes());
        zos.flush();
        zos.closeEntry();
    
        ZipEntry documentEntry = new ZipEntry("Doc_0/Document.xml");
        zos.putNextEntry(documentEntry);
        zos.write(documentXml.getBytes());
        zos.flush();
        zos.closeEntry();
    
        ZipEntry documentResEntry = new ZipEntry("Doc_0/DocumentRes.xml");
        zos.putNextEntry(documentResEntry);
        zos.write(documentResXml.getBytes());
        zos.flush();
        zos.closeEntry();
    
        ZipEntry pageEntry = new ZipEntry("Doc_0/Pages/Page_0/Content.xml");
        zos.putNextEntry(pageEntry);
        zos.write(pageXml.getBytes());
        zos.flush();
        zos.closeEntry();
        
        ZipEntry pageEntry1 = new ZipEntry("Doc_0/Pages/Page_1/Content.xml");
        zos.putNextEntry(pageEntry1);
        zos.write(pageXml.getBytes());
        zos.flush();
        zos.closeEntry();
        
        zos.flush();
        zos.close();
        
        Path ofd = Paths.get("d:/srv/myofd.ofd");
        Files.write(ofd, zipByte.toByteArray());
        
        System.out.println("generate success");
        Thread.currentThread().sleep(500);
        
    }
    
    String simpleOFD() {
        OFD ofd = new OFD();
        //docBody
        OFD.DocBody docBody = new OFD.DocBody();
    
        //docBody - docRoot
        docBody.setDocRoot("Doc_0/Document.xml");
        //docBody - signatures
        docBody.setSignatures("Doc_0/Signs/Signatures.xml");
        //docBody - docInfo
        CTDocInfo docInfo = new CTDocInfo();
        docInfo.setDocID(UUID.randomUUID().toString());
    
        //docBody - docInfo - customDatas
        CTDocInfo.CustomDatas customDatas = new CTDocInfo.CustomDatas();
        CTDocInfo.CustomDatas.CustomData data = new CTDocInfo.CustomDatas.CustomData();
        data.setName("CustomDataName");
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
        return os.toString();
    }
    
    String simpleDocument() {
        //commonData - pageArea
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
        //pageArea.setApplicationBox("0 0 210 297");
        //pageArea.setContentBox("0 0 210 297");
    
        //commonData - TemplatePage
        Document.CommonData.TemplatePage templatePage = new Document.CommonData.TemplatePage();
        templatePage.setID(1);
        templatePage.setName("templateName");
        templatePage.setZOrder("Background");
//        templatePage.setBaseLoc("TPLS/TPL_1/Content.xml");
        //commonData
        Document.CommonData commonData = new Document.CommonData();
        commonData.setMaxUnitID(1);
        commonData.setPageArea(pageArea);
        commonData.getPublicRes().add("PublicRes.xml");
        commonData.getDocumentRes().add("DocumentRes.xml");
//        commonData.getTemplatePage().add(templatePage);
    
        //pages
        Document.Pages.Page page = new Document.Pages.Page();
        page.setID(1);
        page.setBaseLoc("Pages/Page_0/Content.xml");
    
        
        Document.Pages.Page page1 = new Document.Pages.Page();
        page1.setID(2);
        page1.setBaseLoc("Pages/Page_1/Content.xml");
    
        Document.Pages pages = new Document.Pages();
        pages.getPage().add(page);
        pages.getPage().add(page1);
    
        //annotations delay
        //attachments delay
        //customTags delay
    
    
        //组装
        Document document = new Document();
        document.setCommonData(commonData);
        document.setPages(pages);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        JAXB.marshal(document, os);
        return os.toString();
    }
    
    String simpleDocumentRes() {
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
        ByteArrayOutputStream os = new ByteArrayOutputStream();
    
        JAXB.marshal(documentRes, os);
        return os.toString();
    }
    
    String simplePage() {
        //pageArea
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
        //template
        Page.Template template = new Page.Template();
        template.setTemplateID(187);
        template.setZOrder("Background");
    
        //content
        //TextObject、PathObject、ImageObject、CompositeObjec、PageBlock
        CTPageBlock.TextObject textObject = new CTPageBlock.TextObject();
        textObject.setID(25);
        textObject.setFont(25);
        textObject.setSize(6.61);//??这个是什么的size
        textObject.setBoundary("44 14 122.1144 7.0732");
        //textObject - fillColor
        CTColor color = new CTColor();
        color.setValue("0 0 0");
        color.setColorSpace(10L);
        
        textObject.setFillColor(color);
        //textObject - textCode
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue("hahaha上了飞机数量的就法律手段看积分老师的课");
        textObject.getCGTransformAndTextCode().add(textCode);
    
//        CTText.TextCode textCode2 = new CTText.TextCode();
//        textCode2.setValue("杀了对方家里是基辅罗斯大家说的克己复礼圣诞节法律手段看就分类达康数据法律上看到士大夫士大夫大师傅");
//        textObject.getCGTransformAndTextCode().add(textCode2);
    
        //pathObject - strokeColor
        CTPageBlock.PathObject pathObject = new CTPageBlock.PathObject();
        pathObject.setID(154);
        pathObject.setBoundary("68.5 18 73 0.25");
        pathObject.setLineWidth(0.25);
        CTColor color2 = new CTColor();
        color2.setValue("156 82 35");
    
        pathObject.setStrokeColor(color2);
        pathObject.setAbbreviatedData("M 0 0 L 73 0");
    
    
        //组装
        Page.Content.Layer layer1 = new Page.Content.Layer();
        layer1.setID(123);
        layer1.getTextObjectOrPathObjectOrImageObject().add(textObject);
        layer1.getTextObjectOrPathObjectOrImageObject().add(pathObject);
    
        Page.Content content = new Page.Content();
        content.getLayer().add(layer1);
    
        Page page = new Page();
        page.setArea(pageArea);
        page.setContent(content);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        JAXB.marshal(page, os);
        return os.toString();
    }
}

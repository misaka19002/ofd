package io.onee.ofd.test.page;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.onee.ofd.definition.*;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXB;

/**
 * Created by admin on 2020/4/24 11:27:56.
 * <p>
 * protected List<Template> template;
 * protected List<String>   pageRes;
 * protected CTPageArea area;
 * protected Content content;
 * protected Actions actions;
 */
public class PageTest {
    
    @Test
    public void simplePage() throws JsonProcessingException {
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
        textObject.setBoundary("68.5 7 80 6.35");
        //textObject - fillColor
        CTColor color = new CTColor();
        color.setValue("156 82 35");
        textObject.setFillColor(color);
        //textObject - textCode
        CTText.TextCode textCode = new CTText.TextCode();
        textCode.setValue("hahaha上了飞机数量的就法律手段看积分老师的课");
        textObject.getCGTransformAndTextCode().add(textCode);
        
        CTText.TextCode textCode2 = new CTText.TextCode();
        textCode2.setValue("杀了对方家里是基辅罗斯大家说的克己复礼圣诞节法律手段看就分类达康数据法律上看到士大夫士大夫大师傅");
        textObject.getCGTransformAndTextCode().add(textCode2);
        
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
        
        JAXB.marshal(page,System.out);
    }
}

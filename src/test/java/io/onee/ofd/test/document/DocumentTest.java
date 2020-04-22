package io.onee.ofd.test.document;

import io.onee.ofd.definition.CTPageArea;
import io.onee.ofd.definition.Document;
import org.junit.Test;

import javax.xml.bind.JAXB;

/**
 * Created by admin on 2020/4/22 10:29:21.
 */
public class DocumentTest {
    
    /**
     * <pre>
     *     CommonData √ 文档公共数据，定义页面区域、公共资源等数据
     *      - MaxUnitID 当前文档所有对象使用标识的最大值
     *      - PageArea 指定该文档页面区域的默认大小和位置
     *       - PhysicalBox 页面物理区域
     *       - ApplicationBox 显示区域
     *       - ContentBox 版心区域(正文区域)
     *       - BleedBox 出血区域
     *      - PublicRes
     *      - DocumentRes
     *      - TemplatePage
     *      - DefaultCS
     *     Pages √
     *      - Page √
     *       - Page √
     *     Permissions x
     *     Actions x
     *     VPreferences x
     *     Bookmarks x
     *     Annotations x
     *     CustomTags x
     *     Attachments x
     *     Extensions x
     * </pre>
     */
    @Test
    public void blankDocument() {
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
//        pageArea.setApplicationBox("0 0 210 297");
//        pageArea.setContentBox("0 0 210 297");
        
        Document.CommonData commonData = new Document.CommonData();
        commonData.setMaxUnitID(1);
        commonData.setPageArea(pageArea);
        
        Document document = new Document();
        document.setCommonData(commonData);
    
        JAXB.marshal(document, System.out);
    
    }
    
    @Test
    public void simpleDocument() {
    
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox("0 0 210 297");
//        pageArea.setApplicationBox("0 0 210 297");
//        pageArea.setContentBox("0 0 210 297");
        
        //commonData
        Document.CommonData commonData = new Document.CommonData();
        commonData.setMaxUnitID(1);
        commonData.setPageArea(pageArea);
    
        
        //pages
        Document.Pages.Page page = new Document.Pages.Page();
        page.setID(1);
        page.setBaseLoc("Pages/Page_0/Content.xml");
        
        Document.Pages pages = new Document.Pages();
        pages.getPage().add(page);
        
        //组装
        Document document = new Document();
        document.setCommonData(commonData);
        document.setPages(pages);
        
        JAXB.marshal(document, System.out);
    
    }
}

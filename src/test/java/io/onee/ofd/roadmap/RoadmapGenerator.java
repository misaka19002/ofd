package io.onee.ofd.roadmap;

import org.junit.Test;

/**
 * Created by admin on 2020/5/14 17:57:17.
 */
public class RoadmapGenerator {
    
    @Test
    public void generate() {
        Node node = new Node("file.ofd");
        
        Node doc = node.addFolder("Doc_0");
        doc.addChild("Document.xml").addChild("DocumentRes.xml");
        
        Node pages = doc.addFolder("Pages");
        pages.addFolder("Page_0").addChild("Content.xml");
        pages.addFolder("Page_1").addChild("Content.xml");
        
        Node tpls = doc.addFolder("TPLS");
        tpls.addFolder("TPLS_0").addChild("Content.xml");
        tpls.addFolder("TPLS_1").addChild("Content.xml");
        
        Node res = doc.addFolder("Res");
        res.addFolder("img").addChild("aa.png");
        res.addFolder("font").addChild("font_0.otf").addChild("font_1.ttf");
        
        node.addChild("OFD.xml");
    
        System.out.println(node.toString("", ""));
    }
}

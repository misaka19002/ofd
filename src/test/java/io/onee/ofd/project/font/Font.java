package io.onee.ofd.project.font;

import org.apache.fontbox.ttf.TrueTypeFont;

/**
 * Created by admin on 2020/5/27 14:53:05.
 */
public class Font {
    
    private final String fontName;
    //trueType or openType
    private final TrueTypeFont ttf;
    
    public Font(String fontName, TrueTypeFont ttf) {
        this.fontName = fontName;
        this.ttf = ttf;
    }
    
    /**
     * <ofd:Font ID="20" Bold="false" Charset="unicode" FamilyName="宋体" FixedWidth="false" FontName="宋体" Italic="false" Serif="false"/>
     * <ofd:Font ID="21" Bold="false" Charset="unicode" FamilyName="楷体" FixedWidth="false" FontName="楷体" Italic="false" Serif="false"/>
     * <ofd:Font ID="22" Bold="false" Charset="unicode" FamilyName="黑体" FixedWidth="false" FontName="黑体" Italic="false" Serif="false"/>
     * @return
     */
    
    
    /**
     * true:有对应的字体文件 false:没有字体文件
     * @return
1     */
    boolean isPhysicFont() {
        return ttf != null;
    }
    
}

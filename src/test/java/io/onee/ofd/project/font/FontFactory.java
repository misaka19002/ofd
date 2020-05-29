package io.onee.ofd.project.font;

import io.onee.ofd.other.FontException;
import org.apache.fontbox.ttf.TrueTypeFont;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Created by admin on 2020/5/27 14:53:28.
 */
public final class FontFactory {
    
    
    private FontFactory() {}
    
    private static FontFactoryImpl fontImpl = new FontFactoryImpl();
    
    public static void register(String path) {
        fontImpl.register(path);
    }
    
    /**
     * <ofd:Font ID="20" Bold="false" Charset="unicode" FamilyName="宋体" FixedWidth="false" FontName="宋体" Italic="false" Serif="false"/>
     * <ofd:Font ID="21" Bold="false" Charset="unicode" FamilyName="楷体" FixedWidth="false" FontName="楷体" Italic="false" Serif="false"/>
     * <ofd:Font ID="22" Bold="false" Charset="unicode" FamilyName="黑体" FixedWidth="false" FontName="黑体" Italic="false" Serif="false"/>
     * @return
     */
    public static Font getFont(String fontName) {
        Optional<TrueTypeFont> optFont = fontImpl.getOpenTypeFont(fontName);
        if (optFont == null) {
            throw new FontException(String.format("font: [%s]  doesn't exist. please register first!", fontName));
        } else {
            Font font = new Font(fontName,optFont.orElse(null));
            return font;
        }
    }
    
    public static Set<String> registeredFontNames() {
        return fontImpl.getFontNames();
    }
    
    public static Map<String, List<String>> registeredFontFamilies() {
        return fontImpl.getFontFamilies();
    }
    
}

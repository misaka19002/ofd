package io.onee.ofd.project.font;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by admin on 2020/5/27 14:53:21.
 */
public class FontFactoryImplTest {
    @Test
    public void registerFont() {
        FontFactoryImpl fontFactory = new FontFactoryImpl();
    
        fontFactory.register("d:/data/HYKaiTiJ.ttf");
        fontFactory.register("d:/data/HYKaiTiJ.ttf");
        System.out.println(fontFactory.getFontNames());
        System.out.println(fontFactory.getFontFamilies());
    }
    
    @Test
    public void fFactory_getFont() {
        FontFactory.register("d:/data/HYKaiTiJ.ttf");
        Font font = FontFactory.getFont("HYKaiTiJ");
        Assertions.assertNotNull(font);
    }
    @Test
    public void fFactory_getFont_style() throws Exception{
        FontFactory.register("d:/data/simsun.ttc");
//        FontFactory.register("d:/data/timesbd.ttf");
//        FontFactory.register("d:/data/timesbi.ttf");
//        FontFactory.register("d:/data/timesbi.ttf");
        System.out.println(FontFactory.registeredFontNames());
        System.out.println(FontFactory.registeredFontFamilies());
        Font font = FontFactory.getFont("SimSun");
        Assertions.assertNotNull(font);
    }
}

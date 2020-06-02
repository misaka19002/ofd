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
        //819 204
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
        
        String test = "sflsdjfljsdlfj但是龙卷风螺丝钉解放螺丝钉家里附近都是螺丝钉解放拉开圣诞节理发师大家路附近上的垃圾分类收集的发丝的付款了交互上浪费机会扣税的fkskfj lskdjflksjdflkjlskdjf111316546462165";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            font.stringWidth(test);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start)+" ms");
    
    }
    @Test
    public void fFactory_getFont_SimSun() throws Exception{
        FontFactory.register("d:/data/simsun.ttc");
        System.out.println(FontFactory.registeredFontNames());
        System.out.println(FontFactory.registeredFontFamilies());
        Font font = FontFactory.getFont("SimSun");
        
        Assertions.assertNotNull(font);
        Assertions.assertFalse(font.isPhysicFont());
    
        String test = "sflsdjfljsdlfj但是龙卷风螺丝钉解放螺丝钉家里附近都是螺丝钉解放拉开圣诞节理发师大家路附近上的垃圾分类收集的发丝的付款了交互上浪费机会扣税的fkskfj lskdjflksjdflkjlskdjf111316546462165";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            font.stringWidth(test);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start)+" ms");
    }
}

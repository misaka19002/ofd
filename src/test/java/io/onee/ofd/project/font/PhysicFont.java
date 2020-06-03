package io.onee.ofd.project.font;

import org.apache.fontbox.ttf.TrueTypeFont;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * Created by admin on 2020/5/27 14:53:05.
 */
public class PhysicFont extends Font{
    Logger logger = Logger.getLogger(PhysicFont.class.getName());
    
    private double maxWidth;
    
    public PhysicFont(String fontName, TrueTypeFont ttf) {
        super(fontName, ttf);
    
        //xMaxExtent = max(lsb + (xMax-xMin))
        try {
            maxWidth = ttf.getHorizontalHeader().getAdvanceWidthMax();
            ascent = ttf.getHorizontalHeader().getAscender() / maxWidth;
            descent = ttf.getHorizontalHeader().getDescender() / maxWidth;
        } catch (Exception e) {
            logger.log(Level.WARNING, "", e);
        }
    }
    
    @Override
    boolean isPhysicFont() {
        return true;
    }
    
    /**
     * 获取字符串宽度，默认实现
     */
    @Override
    public double charWidth(int ch) {
        try {
            int gid = ttf.getUnicodeCmapLookup().getGlyphId(ch);
            int width = ttf.getHorizontalMetrics().getAdvanceWidth(gid);
            //formula size * rate * advanceWidth
            return new BigDecimal(size * width * rate / maxWidth).setScale(3, ROUND_HALF_UP).doubleValue();
        } catch (Exception e) {
            logger.info(String.format("char: %s, getWidth error! program will call super.charWidth()!  %s", (char) ch, e.getMessage()));
        }
        return super.charWidth(ch);
    }
   
}

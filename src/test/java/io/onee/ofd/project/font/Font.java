package io.onee.ofd.project.font;

import io.onee.ofd.other.StringUtil;
import org.apache.fontbox.ttf.TrueTypeFont;

import java.math.BigDecimal;
import java.util.logging.Logger;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * Created by admin on 2020/5/27 14:53:05.
 */
public class Font {
    Logger logger = Logger.getLogger(Font.class.getName());
    //字号(磅-point) 转 毫米(mm)
    protected final double rate = 0.352778;
    //默认14号字(14 point)
    protected double size = 14.0;
    //ascent descent (单位point)
    protected double ascent = 11.197266;
    protected double descent = 2.7890625;
    
    //trueType or openType
    protected final TrueTypeFont ttf;
    
    private final String fontName;
    
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
    
    public String getFontName() {
        return fontName;
    }
    
    public double getSize() {
        return size;
    }
    
    public void setSize(double size) {
        this.size = size;
    }
    
    /**
     * 获取字符串宽度，默认实现
     */
    public double charWidth(int ch) {
        double advanceWidth = (ch >= 32 && ch <= 126) ? 0.5 : 1;
        return new BigDecimal(size * rate * advanceWidth).setScale(3, ROUND_HALF_UP).doubleValue();
    }
    
    /**
     * 获取字符串宽度，默认实现
     */
    public double stringWidth(String str) {
        if (StringUtil.isNotEmpty(str)) {
            return str.chars().mapToDouble(this::charWidth).sum();
        }
        return 0;
    }
    
    public boolean isBold() {
        //italic bold seri monospaced
        if (getFontName().toLowerCase().contains("bold") || getFontName().contains("Bold")) {
            return true;
        }
        return false;
    }
}

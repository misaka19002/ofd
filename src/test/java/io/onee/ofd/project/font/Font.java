package io.onee.ofd.project.font;

import io.onee.ofd.other.StringUtil;
import io.onee.ofd.project.Color;
import io.onee.ofd.test.Tuple2;
import org.apache.fontbox.ttf.TrueTypeFont;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * Created by admin on 2020/5/27 14:53:05.
 */
public class Font {
    Logger logger = Logger.getLogger(Font.class.getName());
    //字号(磅-point) 转 毫米(mm)
    protected final double rate    = 0.352778;
    //默认14号字(14 point)
    protected       double size    = 14.0;
    protected       Color  color   = Color.BLACK;
    //ascent descent (单位point)
    protected       double ascent  = 11.197266;
    protected       double descent = 2.7890625;
    
    //trueType or openType
    protected final TrueTypeFont ttf;
    
    private final String fontName;
    
    
    public Font(String fontName, TrueTypeFont ttf) {
        this.fontName = fontName;
        this.ttf = ttf;
    }
    
    public Font(String fontName, TrueTypeFont ttf, double size) {
        this(fontName, ttf);
        this.size = size;
    }
    
    public Font(String fontName, TrueTypeFont ttf, Color color) {
        this(fontName, ttf);
        this.color = color;
    }
    
    public Font(String fontName, TrueTypeFont ttf, double size, Color color) {
        this(fontName, ttf, size);
        this.color = color;
    }
    
    public Font newFont(Color color) {
        return new Font(this.fontName, this.ttf, color);
    }
    
    public Font newFont(double size) {
        return new Font(this.fontName, this.ttf, size);
    }
    
    public Font newFont(double size, Color color) {
        return new Font(this.fontName, this.ttf, size, color);
    }
    
    /**
     * <ofd:Font ID="20" Bold="false" Charset="unicode" FamilyName="宋体" FixedWidth="false" FontName="宋体" Italic="false" Serif="false"/>
     * <ofd:Font ID="21" Bold="false" Charset="unicode" FamilyName="楷体" FixedWidth="false" FontName="楷体" Italic="false" Serif="false"/>
     * <ofd:Font ID="22" Bold="false" Charset="unicode" FamilyName="黑体" FixedWidth="false" FontName="黑体" Italic="false" Serif="false"/>
     * @return
     */
    
    
    /**
     * true:有对应的字体文件 false:没有字体文件
     *
     * @return 1
     */
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
    
    public double baselineHeight() {
        return ascent * rate;
    }
    
    public double height() {
        return size * rate;
    }
    
    public double charWidth(char ch) {
        return this.charWidth((int) ch);
    }
    
    public double charWidth(int ch) {
        double advanceWidth = (ch >= 32 && ch <= 126) ? 0.5 : 1;
        return new BigDecimal(size * rate * advanceWidth).setScale(3, ROUND_HALF_UP).doubleValue();
    }
    
    public double stringWidth(String str) {
        if (StringUtil.isNotEmpty(str)) {
            return str.chars().mapToDouble(this::charWidth).sum();
        }
        return 0;
    }
    
    public List<Double> stringWidths(String str) {
        if (StringUtil.isNotEmpty(str)) {
            return str.chars().mapToDouble(this::charWidth).boxed().collect(Collectors.toList());
        }
        return new ArrayList<>(0);
    }
    
    public Tuple2<Double, List<Double>> stringWidthTuple(String str) {
        
        if (StringUtil.isNotEmpty(str)) {
            Tuple2<Double, List<Double>> tuple2 = new Tuple2();
            tuple2.f2 = str.chars().mapToDouble(this::charWidth).boxed().collect(Collectors.toList());
            tuple2.f1 = tuple2.f2.stream().reduce(0d, Double::sum);
            return tuple2;
        }
        return new Tuple2<>(0d, Arrays.asList(0d));
    }
    
    public boolean isBold() {
        //italic bold seri monospaced
        if (getFontName().toLowerCase().contains("bold") || getFontName().contains("Bold")) {
            return true;
        }
        return false;
    }
}

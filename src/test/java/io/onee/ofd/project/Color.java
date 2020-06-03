package io.onee.ofd.project;

import java.io.Serializable;

/**
 * Created by admin on 2020/6/3 14:48:42.
 */
public class Color implements Serializable {
    private float r, g, b, a;
    
    public Color(float r, float g, float b, float a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }
    
    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = 255;
    }
    
    /**
     * @param nm eg:#FF000000 red
     * @return
     */
    public Color decode(String nm) {
        Integer intval = Integer.decode(nm);
        int i = intval.intValue();
        return new Color((i >> 16) & 0xFF, (i >> 8) & 0xFF, i & 0xFF);
    }
    
    public final static Color RED        = new Color(255, 0, 0);
    public final static Color BLACK      = new Color(255, 255, 255);
    public final static Color WHITE      = new Color(255, 255, 255);
    public final static Color LIGHT_GRAY = new Color(192, 192, 192);
    public final static Color GRAY       = new Color(128, 128, 128);
    public final static Color DARK_GRAY  = new Color(64, 64, 64);
    public final static Color PINK       = new Color(255, 175, 175);
    public final static Color ORANGE     = new Color(255, 200, 0);
    public final static Color YELLOW     = new Color(255, 255, 0);
    public final static Color GREEN      = new Color(0, 255, 0);
    public final static Color MAGENTA    = new Color(255, 0, 255);
    public final static Color CYAN       = new Color(0, 255, 255);
    public final static Color BLUE       = new Color(0, 0, 255);
    
}

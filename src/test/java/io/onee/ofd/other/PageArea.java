package io.onee.ofd.other;

import io.onee.ofd.definition.CTPageArea;

/**
 * Created by admin on 2020/5/18 13:47:24.
 */
public class PageArea extends Rectangle{
    public static PageArea A0      = new PageArea(0d, 0d, 841d, 1189d);
    public static PageArea A1      = new PageArea(0d, 0d, 594d, 841d);
    public static PageArea A2      = new PageArea(0d, 0d, 420d, 594d);
    public static PageArea A3      = new PageArea(0d, 0d, 297d, 420d);
    public static PageArea A4      = new PageArea(0d, 0d, 210d, 297d);
    public static PageArea A5      = new PageArea(0d, 0d, 148d, 210d);
    public static PageArea A6      = new PageArea(0d, 0d, 105d, 148d);
    public static PageArea A7      = new PageArea(0d, 0d, 74d, 105d);
    public static PageArea A8      = new PageArea(0d, 0d, 52d, 74d);
    public static PageArea A9      = new PageArea(0d, 0d, 37d, 52d);
    public static PageArea A10     = new PageArea(0d, 0d, 26d, 37d);
    public static PageArea Default = new PageArea(0d, 0d, 0d, 0d);
    
    Margin      margin      = Margin.Default;
    Orientation orientation = Orientation.Portrait;
    
    public PageArea() {
    }
    
    public PageArea(double topLeftX, double topLeftY, double width, double height) {
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        this.width = width;
        this.height = height;
    }
    
    public Margin getMargin() {
        return margin;
    }
    
    public PageArea setMargin(Margin margin) {
        this.margin = margin;
        return this;
    }
    
    public Orientation getOrientation() {
        return orientation;
    }
    
    public PageArea setOrientation(Orientation orientation) {
        this.orientation = orientation;
        return this;
    }
    
    public static class Margin {
        //portrait orientation/landscape orientation
        //normal margins/wide margins/narrow/middle
        public static Margin Normal  = new Margin(25.4d, 25.4d, 31.8d, 31.8d);
        public static Margin Narrow  = new Margin(12.7d, 12.7d, 12.7d, 12.7d);
        public static Margin Middle  = new Margin(25.4d, 25.4d, 19.1d, 19.1d);
        public static Margin Wide    = new Margin(25.4d, 25.4d, 50.8d, 50.8d);
        public static Margin Default = new Margin(0d, 0d, 0d, 0d);
        double top;
        double bottom;
        double left;
        double right;
        
        Margin(double top, double bottom, double left, double right) {
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }
    }
    
    public enum Orientation {
        //竖向
        Portrait, //横向
        Landscape;
    }
    
    @Override
    public String toString() {
        if (margin == Margin.Default) {
            return topLeftX + " " + topLeftY + " " + width + " " + height;
        } else if (orientation == Orientation.Landscape) {
            return (topLeftX + margin.top) + " " + (topLeftY + margin.right) + " " + (height - (margin.top + margin.bottom)) + " " + (width - (margin.left + margin.right));
        } else {
            return (topLeftX + margin.left) + " " + (topLeftY + margin.top) + " " + (width - (margin.left + margin.right)) + " " + (height - (margin.top + margin.bottom));
        }
    }
    
    @Override
    public CTPageArea toCTPageArea() {
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox(super.toString());
        pageArea.setApplicationBox(super.toString());
        pageArea.setContentBox(this.toString());
        return pageArea;
    }
}

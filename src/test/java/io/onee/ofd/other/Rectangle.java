package io.onee.ofd.other;

import io.onee.ofd.definition.CTPageArea;

/**
 * Created by admin on 2020/5/18 14:06:08.
 */
public class Rectangle {
    
    double topLeftX;
    double topLeftY;
    double width;
    double height;
    
    public Rectangle() {
    }
    
    public Rectangle(double topLeftX, double topLeftY, double width, double height) {
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
        this.width = width;
        this.height = height;
    }
    
    public double getTopLeftX() {
        return topLeftX;
    }
    
    public void setTopLeftX(double topLeftX) {
        this.topLeftX = topLeftX;
    }
    
    public double getTopLeftY() {
        return topLeftY;
    }
    
    public void setTopLeftY(double topLeftY) {
        this.topLeftY = topLeftY;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        return topLeftX + " " + topLeftY + " " + width + " " + height;
    }
    
    public CTPageArea toCTPageArea() {
        CTPageArea pageArea = new CTPageArea();
        pageArea.setPhysicalBox(this.toString());
        pageArea.setApplicationBox(this.toString());
        pageArea.setContentBox(this.toString());
        return pageArea;
    }
}

package io.onee.ofd.other;

import io.onee.ofd.definition.CTPageBlock;

/**
 * Created by admin on 2020/5/19 17:28:07.
 */
public class LineContent extends SimpleContent<CTPageBlock.PathObject> {
    
    
    public static double LINE_WIDTH_NARROW = 0.15d;
    public static double LINE_WIDTH_MIDDLE = 0.3d;
    public static double LINE_WIDTH_WIDE = 0.6d;
    
    public LineContent() {
        this.graphicUnit = new CTPageBlock.PathObject();
    }
    
    /**
     *  <ofd:PathObject ID="304" Boundary="68.5 18 73 0.25" LineWidth="0.25">
     *      <ofd:StrokeColor Value="156 82 35" />
     *      <ofd:AbbreviatedData>M 0 0 L 73 0</ofd:AbbreviatedData>
     *  </ofd:PathObject>
     *
     *  <ofd:PathObject ID="1835" Boundary="27.285578 252.660873 155.450745 0.346375" LineWidth="0.173176" MiterLimit="3.527" Stroke="true">
     *      <ofd:FillColor ColorSpace="15" Value="0" />
     *      <ofd:StrokeColor ColorSpace="4" Value="0 0 0 255" />
     *      <ofd:AbbreviatedData>M 0.173173 0.173192 L 155.278 0.173192</ofd:AbbreviatedData>
     *   </ofd:PathObject>
     *
     *   S 定义子绘制图形边线的起始点坐标( x , y )
     *   M 将当前点移动到指定点( x , y )
     *   L 从当前点连接一条到指定点( x , y ) 的线段, 并将当前点移动到指定点
     *   C SubPath 自动闭合,表示将当前点和 SubPath 的起始点用线段直接连接
     *
     */
    public void addValue() {
        this.graphicUnit.setAbbreviatedData();
    
    }
}

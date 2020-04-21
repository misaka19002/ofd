//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST 
//


package io.onee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_Dest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CT_Dest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="XYZ"/&gt;
 *             &lt;enumeration value="Fit"/&gt;
 *             &lt;enumeration value="FitH"/&gt;
 *             &lt;enumeration value="FitV"/&gt;
 *             &lt;enumeration value="FitR"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PageID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *       &lt;attribute name="Left" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Top" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Right" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Bottom" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Zoom" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Dest")
public class CTDest {

    protected String type;
    protected long pageID;
    protected Double left;
    protected Double top;
    protected Double right;
    protected Double bottom;
    protected Double zoom;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlAttribute(name = "Type", required = true)
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取pageID属性的值。
     * 
     */
    @XmlAttribute(name = "PageID", required = true)
    public long getPageID() {
        return pageID;
    }

    /**
     * 设置pageID属性的值。
     * 
     */
    public void setPageID(long value) {
        this.pageID = value;
    }

    /**
     * 获取left属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @XmlAttribute(name = "Left")
    public Double getLeft() {
        return left;
    }

    /**
     * 设置left属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLeft(Double value) {
        this.left = value;
    }

    /**
     * 获取top属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @XmlAttribute(name = "Top")
    public Double getTop() {
        return top;
    }

    /**
     * 设置top属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTop(Double value) {
        this.top = value;
    }

    /**
     * 获取right属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @XmlAttribute(name = "Right")
    public Double getRight() {
        return right;
    }

    /**
     * 设置right属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRight(Double value) {
        this.right = value;
    }

    /**
     * 获取bottom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @XmlAttribute(name = "Bottom")
    public Double getBottom() {
        return bottom;
    }

    /**
     * 设置bottom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBottom(Double value) {
        this.bottom = value;
    }

    /**
     * 获取zoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @XmlAttribute(name = "Zoom")
    public Double getZoom() {
        return zoom;
    }

    /**
     * 设置zoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZoom(Double value) {
        this.zoom = value;
    }

}

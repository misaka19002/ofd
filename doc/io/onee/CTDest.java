//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST 
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
 * &lt;complexType name="CT_Dest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="XYZ"/>
 *             &lt;enumeration value="Fit"/>
 *             &lt;enumeration value="FitH"/>
 *             &lt;enumeration value="FitV"/>
 *             &lt;enumeration value="FitR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PageID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *       &lt;attribute name="Left" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Top" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Right" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Bottom" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Zoom" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Dest")
public class CTDest {

    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "PageID", required = true)
    protected long pageID;
    @XmlAttribute(name = "Left")
    protected Double left;
    @XmlAttribute(name = "Top")
    protected Double top;
    @XmlAttribute(name = "Right")
    protected Double right;
    @XmlAttribute(name = "Bottom")
    protected Double bottom;
    @XmlAttribute(name = "Zoom")
    protected Double zoom;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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

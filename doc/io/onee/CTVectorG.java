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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_VectorG complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CT_VectorG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Thumbnail" type="{http://www.ofdspec.org/2016}ST_RefID" minOccurs="0"/>
 *         &lt;element name="Substitution" type="{http://www.ofdspec.org/2016}ST_RefID" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.ofdspec.org/2016}CT_PageBlock"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_VectorG", propOrder = {
    "thumbnail",
    "substitution",
    "content"
})
@XmlSeeAlso({
    io.onee.Res.CompositeGraphicUnits.CompositeGraphicUnit.class
})
public class CTVectorG {

    @XmlElement(name = "Thumbnail")
    @XmlSchemaType(name = "unsignedInt")
    protected Long thumbnail;
    @XmlElement(name = "Substitution")
    @XmlSchemaType(name = "unsignedInt")
    protected Long substitution;
    @XmlElement(name = "Content", required = true)
    protected CTPageBlock content;
    @XmlAttribute(name = "Width", required = true)
    protected double width;
    @XmlAttribute(name = "Height", required = true)
    protected double height;

    /**
     * 获取thumbnail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThumbnail() {
        return thumbnail;
    }

    /**
     * 设置thumbnail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThumbnail(Long value) {
        this.thumbnail = value;
    }

    /**
     * 获取substitution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubstitution() {
        return substitution;
    }

    /**
     * 设置substitution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubstitution(Long value) {
        this.substitution = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTPageBlock }
     *     
     */
    public CTPageBlock getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTPageBlock }
     *     
     */
    public void setContent(CTPageBlock value) {
        this.content = value;
    }

    /**
     * 获取width属性的值。
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

}

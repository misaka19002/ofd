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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_CGTransform complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CT_CGTransform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Glyphs" type="{http://www.ofdspec.org/2016}ST_Array" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CodePosition" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CodeCount" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="GlyphCount" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_CGTransform", propOrder = {
    "glyphs"
})
public class CTCGTransform {

    @XmlElement(name = "Glyphs")
    protected String glyphs;
    @XmlAttribute(name = "CodePosition", required = true)
    protected int codePosition;
    @XmlAttribute(name = "CodeCount")
    protected Integer codeCount;
    @XmlAttribute(name = "GlyphCount")
    protected Integer glyphCount;

    /**
     * 获取glyphs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlyphs() {
        return glyphs;
    }

    /**
     * 设置glyphs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlyphs(String value) {
        this.glyphs = value;
    }

    /**
     * 获取codePosition属性的值。
     * 
     */
    public int getCodePosition() {
        return codePosition;
    }

    /**
     * 设置codePosition属性的值。
     * 
     */
    public void setCodePosition(int value) {
        this.codePosition = value;
    }

    /**
     * 获取codeCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCodeCount() {
        if (codeCount == null) {
            return  1;
        } else {
            return codeCount;
        }
    }

    /**
     * 设置codeCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodeCount(Integer value) {
        this.codeCount = value;
    }

    /**
     * 获取glyphCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getGlyphCount() {
        if (glyphCount == null) {
            return  1;
        } else {
            return glyphCount;
        }
    }

    /**
     * 设置glyphCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlyphCount(Integer value) {
        this.glyphCount = value;
    }

}

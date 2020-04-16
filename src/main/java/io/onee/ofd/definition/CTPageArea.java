//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_PageArea complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_PageArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalBox" type="{http://www.ofdspec.org/2016}ST_Box"/>
 *         &lt;element name="ApplicationBox" type="{http://www.ofdspec.org/2016}ST_Box" minOccurs="0"/>
 *         &lt;element name="ContentBox" type="{http://www.ofdspec.org/2016}ST_Box" minOccurs="0"/>
 *         &lt;element name="BleedBox" type="{http://www.ofdspec.org/2016}ST_Box" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PageArea", propOrder = {
    "physicalBox",
    "applicationBox",
    "contentBox",
    "bleedBox"
})
public class CTPageArea {

    @XmlElement(name = "PhysicalBox", required = true)
    protected String physicalBox;
    @XmlElement(name = "ApplicationBox")
    protected String applicationBox;
    @XmlElement(name = "ContentBox")
    protected String contentBox;
    @XmlElement(name = "BleedBox")
    protected String bleedBox;

    /**
     * 获取physicalBox属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhysicalBox() {
        return physicalBox;
    }

    /**
     * 设置physicalBox属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhysicalBox(String value) {
        this.physicalBox = value;
    }

    /**
     * 获取applicationBox属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplicationBox() {
        return applicationBox;
    }

    /**
     * 设置applicationBox属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplicationBox(String value) {
        this.applicationBox = value;
    }

    /**
     * 获取contentBox属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentBox() {
        return contentBox;
    }

    /**
     * 设置contentBox属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentBox(String value) {
        this.contentBox = value;
    }

    /**
     * 获取bleedBox属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBleedBox() {
        return bleedBox;
    }

    /**
     * 设置bleedBox属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBleedBox(String value) {
        this.bleedBox = value;
    }

}

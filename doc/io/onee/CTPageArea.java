//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST 
//


package io.onee;

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
 * &lt;complexType name="CT_PageArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhysicalBox" type="{http://www.ofdspec.org/2016}ST_Box"/&gt;
 *         &lt;element name="ApplicationBox" type="{http://www.ofdspec.org/2016}ST_Box" minOccurs="0"/&gt;
 *         &lt;element name="ContentBox" type="{http://www.ofdspec.org/2016}ST_Box" minOccurs="0"/&gt;
 *         &lt;element name="BleedBox" type="{http://www.ofdspec.org/2016}ST_Box" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_PageArea", propOrder = {
    "physicalBox",
    "applicationBox",
    "contentBox",
    "bleedBox"
})
public class CTPageArea {

    protected String physicalBox;
    protected String applicationBox;
    protected String contentBox;
    protected String bleedBox;

    /**
     * 获取physicalBox属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name = "PhysicalBox", required = true)
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
    @XmlElement(name = "ApplicationBox")
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
    @XmlElement(name = "ContentBox")
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
    @XmlElement(name = "BleedBox")
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

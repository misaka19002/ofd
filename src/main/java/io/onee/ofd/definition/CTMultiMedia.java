//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_MultiMedia complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_MultiMedia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaFile" type="{http://www.ofdspec.org/2016}ST_Loc"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Image"/>
 *             &lt;enumeration value="Audio"/>
 *             &lt;enumeration value="Video"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_MultiMedia", propOrder = {
    "mediaFile"
})
@XmlSeeAlso({
    Res.MultiMedias.MultiMedia.class
})
public class CTMultiMedia {

    @XmlElement(name = "MediaFile", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String mediaFile;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Format")
    protected String format;

    /**
     * 获取mediaFile属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMediaFile() {
        return mediaFile;
    }

    /**
     * 设置mediaFile属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMediaFile(String value) {
        this.mediaFile = value;
    }

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
     * 获取format属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormat(String value) {
        this.format = value;
    }

}

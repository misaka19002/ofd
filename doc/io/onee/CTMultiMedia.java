//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

/**
 * <p>CT_MultiMedia complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_MultiMedia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MediaFile" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Image"/&gt;
 *             &lt;enumeration value="Audio"/&gt;
 *             &lt;enumeration value="Video"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_MultiMedia", propOrder = {
    "mediaFile"
})
@XmlSeeAlso({
    io.onee.Res.MultiMedias.MultiMedia.class
})
public class CTMultiMedia {

    protected String mediaFile;
    protected String type;
    protected String format;

    /**
     * 获取mediaFile属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "MediaFile", required = true)
    @XmlSchemaType(name = "anyURI")
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
     * 获取format属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Format")
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

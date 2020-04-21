//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

/**
 * <p>CT_CGTransform complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_CGTransform"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Glyphs" type="{http://www.ofdspec.org/2016}ST_Array" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CodePosition" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="CodeCount" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
 *       &lt;attribute name="GlyphCount" type="{http://www.w3.org/2001/XMLSchema}int" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_CGTransform", propOrder = {
    "glyphs"
})
public class CTCGTransform {

    protected String glyphs;
    protected int codePosition;
    protected Integer codeCount;
    protected Integer glyphCount;

    /**
     * 获取glyphs属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "Glyphs")
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
    @XmlAttribute(name = "CodePosition", required = true)
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
    @XmlAttribute(name = "CodeCount")
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
    @XmlAttribute(name = "GlyphCount")
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

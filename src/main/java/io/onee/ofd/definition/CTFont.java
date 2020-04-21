//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:53:53 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_Font complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Font"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FontFile" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FontName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Charset" default="unicode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="symbol"/&gt;
 *             &lt;enumeration value="prc"/&gt;
 *             &lt;enumeration value="big5"/&gt;
 *             &lt;enumeration value="shift-jis"/&gt;
 *             &lt;enumeration value="wansung"/&gt;
 *             &lt;enumeration value="johab"/&gt;
 *             &lt;enumeration value="unicode"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Bold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Serif" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="FixedWidth" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Font", propOrder = {
    "fontFile"
})
@XmlSeeAlso({
    Res.Fonts.Font.class
})
public class CTFont {

    protected String fontFile;
    protected String fontName;
    protected String familyName;
    protected String charset;
    protected Boolean italic;
    protected Boolean bold;
    protected Boolean serif;
    protected Boolean fixedWidth;

    /**
     * 获取fontFile属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "FontFile")
    @XmlSchemaType(name = "anyURI")
    public String getFontFile() {
        return fontFile;
    }

    /**
     * 设置fontFile属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontFile(String value) {
        this.fontFile = value;
    }

    /**
     * 获取fontName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "FontName", required = true)
    public String getFontName() {
        return fontName;
    }

    /**
     * 设置fontName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * 获取familyName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "FamilyName")
    public String getFamilyName() {
        return familyName;
    }

    /**
     * 设置familyName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * 获取charset属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Charset")
    public String getCharset() {
        if (charset == null) {
            return "unicode";
        } else {
            return charset;
        }
    }

    /**
     * 设置charset属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCharset(String value) {
        this.charset = value;
    }

    /**
     * 获取italic属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlAttribute(name = "Italic")
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**
     * 设置italic属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * 获取bold属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlAttribute(name = "Bold")
    public boolean isBold() {
        if (bold == null) {
            return false;
        } else {
            return bold;
        }
    }

    /**
     * 设置bold属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * 获取serif属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlAttribute(name = "Serif")
    public boolean isSerif() {
        if (serif == null) {
            return false;
        } else {
            return serif;
        }
    }

    /**
     * 设置serif属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSerif(Boolean value) {
        this.serif = value;
    }

    /**
     * 获取fixedWidth属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlAttribute(name = "FixedWidth")
    public boolean isFixedWidth() {
        if (fixedWidth == null) {
            return false;
        } else {
            return fixedWidth;
        }
    }

    /**
     * 设置fixedWidth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFixedWidth(Boolean value) {
        this.fixedWidth = value;
    }

}

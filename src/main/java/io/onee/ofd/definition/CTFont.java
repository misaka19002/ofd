//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Font complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Font">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FontFile" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FontName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Charset" default="unicode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="symbol"/>
 *             &lt;enumeration value="prc"/>
 *             &lt;enumeration value="big5"/>
 *             &lt;enumeration value="shift-jis"/>
 *             &lt;enumeration value="wansung"/>
 *             &lt;enumeration value="johab"/>
 *             &lt;enumeration value="unicode"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Bold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Serif" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FixedWidth" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Font", propOrder = {
    "fontFile"
})
@XmlSeeAlso({
    Res.Fonts.Font.class
})
public class CTFont {

    @XmlElement(name = "FontFile")
    @XmlSchemaType(name = "anyURI")
    protected String fontFile;
    @XmlAttribute(name = "FontName", required = true)
    protected String fontName;
    @XmlAttribute(name = "FamilyName")
    protected String familyName;
    @XmlAttribute(name = "Charset")
    protected String charset;
    @XmlAttribute(name = "Italic")
    protected Boolean italic;
    @XmlAttribute(name = "Bold")
    protected Boolean bold;
    @XmlAttribute(name = "Serif")
    protected Boolean serif;
    @XmlAttribute(name = "FixedWidth")
    protected Boolean fixedWidth;

    /**
     * 获取fontFile属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
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

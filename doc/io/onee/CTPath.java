//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Path complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Path">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit">
 *       &lt;sequence>
 *         &lt;element name="StrokeColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
 *         &lt;element name="FillColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
 *         &lt;element name="AbbreviatedData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Stroke" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="Fill" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Rule" default="NonZero">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="NonZero"/>
 *             &lt;enumeration value="Even-Odd"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Path", propOrder = {
    "strokeColor",
    "fillColor",
    "abbreviatedData"
})
@XmlSeeAlso({
    io.onee.CTPageBlock.PathObject.class
})
public class CTPath
    extends CTGraphicUnit
{

    @XmlElement(name = "StrokeColor")
    protected CTColor strokeColor;
    @XmlElement(name = "FillColor")
    protected CTColor fillColor;
    @XmlElement(name = "AbbreviatedData", required = true)
    protected String abbreviatedData;
    @XmlAttribute(name = "Stroke")
    protected Boolean stroke;
    @XmlAttribute(name = "Fill")
    protected Boolean fill;
    @XmlAttribute(name = "Rule")
    protected String rule;

    /**
     * 获取strokeColor属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTColor }
     *
     */
    public CTColor getStrokeColor() {
        return strokeColor;
    }

    /**
     * 设置strokeColor属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTColor }
     *
     */
    public void setStrokeColor(CTColor value) {
        this.strokeColor = value;
    }

    /**
     * 获取fillColor属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTColor }
     *
     */
    public CTColor getFillColor() {
        return fillColor;
    }

    /**
     * 设置fillColor属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTColor }
     *
     */
    public void setFillColor(CTColor value) {
        this.fillColor = value;
    }

    /**
     * 获取abbreviatedData属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAbbreviatedData() {
        return abbreviatedData;
    }

    /**
     * 设置abbreviatedData属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAbbreviatedData(String value) {
        this.abbreviatedData = value;
    }

    /**
     * 获取stroke属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isStroke() {
        if (stroke == null) {
            return true;
        } else {
            return stroke;
        }
    }

    /**
     * 设置stroke属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setStroke(Boolean value) {
        this.stroke = value;
    }

    /**
     * 获取fill属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isFill() {
        if (fill == null) {
            return false;
        } else {
            return fill;
        }
    }

    /**
     * 设置fill属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFill(Boolean value) {
        this.fill = value;
    }

    /**
     * 获取rule属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRule() {
        if (rule == null) {
            return "NonZero";
        } else {
            return rule;
        }
    }

    /**
     * 设置rule属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRule(String value) {
        this.rule = value;
    }

}

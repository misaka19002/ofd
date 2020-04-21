//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

/**
 * <p>CT_Path complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Path"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StrokeColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *         &lt;element name="FillColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *         &lt;element name="AbbreviatedData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Stroke" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="Fill" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Rule" default="NonZero"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="NonZero"/&gt;
 *             &lt;enumeration value="Even-Odd"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
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

    protected CTColor strokeColor;
    protected CTColor fillColor;
    protected String abbreviatedData;
    protected Boolean stroke;
    protected Boolean fill;
    protected String rule;

    /**
     * 获取strokeColor属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTColor }
     *
     */
    @XmlElement(name = "StrokeColor")
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
    @XmlElement(name = "FillColor")
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
    @XmlElement(name = "AbbreviatedData", required = true)
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
    @XmlAttribute(name = "Stroke")
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
    @XmlAttribute(name = "Fill")
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
    @XmlAttribute(name = "Rule")
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

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_DrawParam complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_DrawParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FillColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *         &lt;element name="StrokeColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Relative" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}double" default="0.353" /&gt;
 *       &lt;attribute name="Join" type="{http://www.w3.org/2001/XMLSchema}string" default="Miter" /&gt;
 *       &lt;attribute name="Cap" type="{http://www.w3.org/2001/XMLSchema}string" default="Butt" /&gt;
 *       &lt;attribute name="DashOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *       &lt;attribute name="DashPattern" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *       &lt;attribute name="MiterLimit" type="{http://www.w3.org/2001/XMLSchema}double" default="4.234" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_DrawParam", propOrder = {
    "fillColor",
    "strokeColor"
})
@XmlSeeAlso({
    io.onee.Res.DrawParams.DrawParam.class
})
public class CTDrawParam {

    protected CTColor fillColor;
    protected CTColor strokeColor;
    protected Long relative;
    protected Double lineWidth;
    protected String join;
    protected String cap;
    protected Double dashOffset;
    protected String dashPattern;
    protected Double miterLimit;

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
     * 获取relative属性的值。
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    @XmlAttribute(name = "Relative")
    public Long getRelative() {
        return relative;
    }

    /**
     * 设置relative属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRelative(Long value) {
        this.relative = value;
    }

    /**
     * 获取lineWidth属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "LineWidth")
    public double getLineWidth() {
        if (lineWidth == null) {
            return  0.353D;
        } else {
            return lineWidth;
        }
    }

    /**
     * 设置lineWidth属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setLineWidth(Double value) {
        this.lineWidth = value;
    }

    /**
     * 获取join属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Join")
    public String getJoin() {
        if (join == null) {
            return "Miter";
        } else {
            return join;
        }
    }

    /**
     * 设置join属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJoin(String value) {
        this.join = value;
    }

    /**
     * 获取cap属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Cap")
    public String getCap() {
        if (cap == null) {
            return "Butt";
        } else {
            return cap;
        }
    }

    /**
     * 设置cap属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCap(String value) {
        this.cap = value;
    }

    /**
     * 获取dashOffset属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "DashOffset")
    public double getDashOffset() {
        if (dashOffset == null) {
            return  0.0D;
        } else {
            return dashOffset;
        }
    }

    /**
     * 设置dashOffset属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setDashOffset(Double value) {
        this.dashOffset = value;
    }

    /**
     * 获取dashPattern属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "DashPattern")
    public String getDashPattern() {
        return dashPattern;
    }

    /**
     * 设置dashPattern属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDashPattern(String value) {
        this.dashPattern = value;
    }

    /**
     * 获取miterLimit属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "MiterLimit")
    public double getMiterLimit() {
        if (miterLimit == null) {
            return  4.234D;
        } else {
            return miterLimit;
        }
    }

    /**
     * 设置miterLimit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setMiterLimit(Double value) {
        this.miterLimit = value;
    }

}

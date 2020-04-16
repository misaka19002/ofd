//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST 
//


package io.onee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_DrawParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CT_DrawParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FillColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
 *         &lt;element name="StrokeColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Relative" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}double" default="0.353" />
 *       &lt;attribute name="Join" type="{http://www.w3.org/2001/XMLSchema}string" default="Miter" />
 *       &lt;attribute name="Cap" type="{http://www.w3.org/2001/XMLSchema}string" default="Butt" />
 *       &lt;attribute name="DashOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="DashPattern" type="{http://www.ofdspec.org/2016}ST_Array" />
 *       &lt;attribute name="MiterLimit" type="{http://www.w3.org/2001/XMLSchema}double" default="4.234" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_DrawParam", propOrder = {
    "fillColor",
    "strokeColor"
})
@XmlSeeAlso({
    io.onee.Res.DrawParams.DrawParam.class
})
public class CTDrawParam {

    @XmlElement(name = "FillColor")
    protected CTColor fillColor;
    @XmlElement(name = "StrokeColor")
    protected CTColor strokeColor;
    @XmlAttribute(name = "Relative")
    protected Long relative;
    @XmlAttribute(name = "LineWidth")
    protected Double lineWidth;
    @XmlAttribute(name = "Join")
    protected String join;
    @XmlAttribute(name = "Cap")
    protected String cap;
    @XmlAttribute(name = "DashOffset")
    protected Double dashOffset;
    @XmlAttribute(name = "DashPattern")
    protected String dashPattern;
    @XmlAttribute(name = "MiterLimit")
    protected Double miterLimit;

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
     * 获取relative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
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

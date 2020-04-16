//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Color complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Color">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Pattern" type="{http://www.ofdspec.org/2016}CT_Pattern"/>
 *         &lt;element name="AxialShd" type="{http://www.ofdspec.org/2016}CT_AxialShd"/>
 *         &lt;element name="RadialShd" type="{http://www.ofdspec.org/2016}CT_RadialShd"/>
 *         &lt;element name="GouraudShd" type="{http://www.ofdspec.org/2016}CT_GouraudShd"/>
 *         &lt;element name="LaGourandShd" type="{http://www.ofdspec.org/2016}CT_LaGouraudShd"/>
 *       &lt;/choice>
 *       &lt;attribute name="Value" type="{http://www.ofdspec.org/2016}ST_Array" />
 *       &lt;attribute name="Index" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ColorSpace" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *       &lt;attribute name="Alpha" type="{http://www.w3.org/2001/XMLSchema}int" default="255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Color", propOrder = {
    "pattern",
    "axialShd",
    "radialShd",
    "gouraudShd",
    "laGourandShd"
})
public class CTColor {

    @XmlElement(name = "Pattern")
    protected CTPattern pattern;
    @XmlElement(name = "AxialShd")
    protected CTAxialShd axialShd;
    @XmlElement(name = "RadialShd")
    protected CTRadialShd radialShd;
    @XmlElement(name = "GouraudShd")
    protected CTGouraudShd gouraudShd;
    @XmlElement(name = "LaGourandShd")
    protected CTLaGouraudShd laGourandShd;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "Index")
    protected Integer index;
    @XmlAttribute(name = "ColorSpace")
    protected Long colorSpace;
    @XmlAttribute(name = "Alpha")
    protected Integer alpha;

    /**
     * 获取pattern属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTPattern }
     *
     */
    public CTPattern getPattern() {
        return pattern;
    }

    /**
     * 设置pattern属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTPattern }
     *
     */
    public void setPattern(CTPattern value) {
        this.pattern = value;
    }

    /**
     * 获取axialShd属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTAxialShd }
     *
     */
    public CTAxialShd getAxialShd() {
        return axialShd;
    }

    /**
     * 设置axialShd属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTAxialShd }
     *
     */
    public void setAxialShd(CTAxialShd value) {
        this.axialShd = value;
    }

    /**
     * 获取radialShd属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTRadialShd }
     *
     */
    public CTRadialShd getRadialShd() {
        return radialShd;
    }

    /**
     * 设置radialShd属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTRadialShd }
     *
     */
    public void setRadialShd(CTRadialShd value) {
        this.radialShd = value;
    }

    /**
     * 获取gouraudShd属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTGouraudShd }
     *
     */
    public CTGouraudShd getGouraudShd() {
        return gouraudShd;
    }

    /**
     * 设置gouraudShd属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTGouraudShd }
     *
     */
    public void setGouraudShd(CTGouraudShd value) {
        this.gouraudShd = value;
    }

    /**
     * 获取laGourandShd属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTLaGouraudShd }
     *
     */
    public CTLaGouraudShd getLaGourandShd() {
        return laGourandShd;
    }

    /**
     * 设置laGourandShd属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTLaGouraudShd }
     *
     */
    public void setLaGourandShd(CTLaGouraudShd value) {
        this.laGourandShd = value;
    }

    /**
     * 获取value属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取index属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * 设置index属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * 获取colorSpace属性的值。
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getColorSpace() {
        return colorSpace;
    }

    /**
     * 设置colorSpace属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setColorSpace(Long value) {
        this.colorSpace = value;
    }

    /**
     * 获取alpha属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getAlpha() {
        if (alpha == null) {
            return  255;
        } else {
            return alpha;
        }
    }

    /**
     * 设置alpha属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setAlpha(Integer value) {
        this.alpha = value;
    }

}

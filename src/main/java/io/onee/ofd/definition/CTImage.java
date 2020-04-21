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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_Image complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Border" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BorderColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}double" default="0.353" /&gt;
 *                 &lt;attribute name="HorizonalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *                 &lt;attribute name="VerticalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *                 &lt;attribute name="DashOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *                 &lt;attribute name="DashPattern" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *       &lt;attribute name="Substitution" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *       &lt;attribute name="ImageMask" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Image", propOrder = {
    "border"
})
@XmlSeeAlso({
    CTPageBlock.ImageObject.class
})
public class CTImage
    extends CTGraphicUnit
{

    protected Border border;
    protected long resourceID;
    protected Long substitution;
    protected Long imageMask;

    /**
     * 获取border属性的值。
     *
     * @return
     *     possible object is
     *     {@link Border }
     *
     */
    @XmlElement(name = "Border")
    public Border getBorder() {
        return border;
    }

    /**
     * 设置border属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Border }
     *
     */
    public void setBorder(Border value) {
        this.border = value;
    }

    /**
     * 获取resourceID属性的值。
     *
     */
    @XmlAttribute(name = "ResourceID", required = true)
    public long getResourceID() {
        return resourceID;
    }

    /**
     * 设置resourceID属性的值。
     *
     */
    public void setResourceID(long value) {
        this.resourceID = value;
    }

    /**
     * 获取substitution属性的值。
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    @XmlAttribute(name = "Substitution")
    public Long getSubstitution() {
        return substitution;
    }

    /**
     * 设置substitution属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSubstitution(Long value) {
        this.substitution = value;
    }

    /**
     * 获取imageMask属性的值。
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    @XmlAttribute(name = "ImageMask")
    public Long getImageMask() {
        return imageMask;
    }

    /**
     * 设置imageMask属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setImageMask(Long value) {
        this.imageMask = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BorderColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}double" default="0.353" /&gt;
     *       &lt;attribute name="HorizonalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
     *       &lt;attribute name="VerticalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
     *       &lt;attribute name="DashOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
     *       &lt;attribute name="DashPattern" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "borderColor"
    })
    public static class Border {

        protected CTColor borderColor;
        protected Double lineWidth;
        protected Double horizonalCornerRadius;
        protected Double verticalCornerRadius;
        protected Double dashOffset;
        protected String dashPattern;

        /**
         * 获取borderColor属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTColor }
         *
         */
        @XmlElement(name = "BorderColor")
        public CTColor getBorderColor() {
            return borderColor;
        }

        /**
         * 设置borderColor属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link CTColor }
         *
         */
        public void setBorderColor(CTColor value) {
            this.borderColor = value;
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
         * 获取horizonalCornerRadius属性的值。
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
        @XmlAttribute(name = "HorizonalCornerRadius")
        public double getHorizonalCornerRadius() {
            if (horizonalCornerRadius == null) {
                return  0.0D;
            } else {
                return horizonalCornerRadius;
            }
        }

        /**
         * 设置horizonalCornerRadius属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Double }
         *
         */
        public void setHorizonalCornerRadius(Double value) {
            this.horizonalCornerRadius = value;
        }

        /**
         * 获取verticalCornerRadius属性的值。
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
        @XmlAttribute(name = "VerticalCornerRadius")
        public double getVerticalCornerRadius() {
            if (verticalCornerRadius == null) {
                return  0.0D;
            } else {
                return verticalCornerRadius;
            }
        }

        /**
         * 设置verticalCornerRadius属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Double }
         *
         */
        public void setVerticalCornerRadius(Double value) {
            this.verticalCornerRadius = value;
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

    }

}

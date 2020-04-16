//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Image complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Image">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit">
 *       &lt;sequence>
 *         &lt;element name="Border" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BorderColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}double" default="0.353" />
 *                 &lt;attribute name="HorizonalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *                 &lt;attribute name="VerticalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *                 &lt;attribute name="DashOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *                 &lt;attribute name="DashPattern" type="{http://www.ofdspec.org/2016}ST_Array" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *       &lt;attribute name="Substitution" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *       &lt;attribute name="ImageMask" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Image", propOrder = {
    "border"
})
@XmlSeeAlso({
    io.onee.CTPageBlock.ImageObject.class
})
public class CTImage
    extends CTGraphicUnit
{

    @XmlElement(name = "Border")
    protected CTImage.Border border;
    @XmlAttribute(name = "ResourceID", required = true)
    protected long resourceID;
    @XmlAttribute(name = "Substitution")
    protected Long substitution;
    @XmlAttribute(name = "ImageMask")
    protected Long imageMask;

    /**
     * 获取border属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTImage.Border }
     *
     */
    public CTImage.Border getBorder() {
        return border;
    }

    /**
     * 设置border属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTImage.Border }
     *
     */
    public void setBorder(CTImage.Border value) {
        this.border = value;
    }

    /**
     * 获取resourceID属性的值。
     *
     */
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BorderColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="LineWidth" type="{http://www.w3.org/2001/XMLSchema}double" default="0.353" />
     *       &lt;attribute name="HorizonalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
     *       &lt;attribute name="VerticalCornerRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
     *       &lt;attribute name="DashOffset" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
     *       &lt;attribute name="DashPattern" type="{http://www.ofdspec.org/2016}ST_Array" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "borderColor"
    })
    public static class Border {

        @XmlElement(name = "BorderColor")
        protected CTColor borderColor;
        @XmlAttribute(name = "LineWidth")
        protected Double lineWidth;
        @XmlAttribute(name = "HorizonalCornerRadius")
        protected Double horizonalCornerRadius;
        @XmlAttribute(name = "VerticalCornerRadius")
        protected Double verticalCornerRadius;
        @XmlAttribute(name = "DashOffset")
        protected Double dashOffset;
        @XmlAttribute(name = "DashPattern")
        protected String dashPattern;

        /**
         * 获取borderColor属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTColor }
         *
         */
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

    }

}

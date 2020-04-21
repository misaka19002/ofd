//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_RadialShd complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_RadialShd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="2"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Color" type="{http://www.ofdspec.org/2016}CT_Color"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Position" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MapType" default="Direct"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Direct"/&gt;
 *             &lt;enumeration value="Repeat"/&gt;
 *             &lt;enumeration value="Reflect"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MapUnit" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Eccentricity" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *       &lt;attribute name="Angle" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *       &lt;attribute name="StartPoint" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *       &lt;attribute name="StartRadius" type="{http://www.w3.org/2001/XMLSchema}double" default="0" /&gt;
 *       &lt;attribute name="EndPoint" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *       &lt;attribute name="EndRadius" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Extend" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_RadialShd", propOrder = {
    "segment"
})
public class CTRadialShd {

    protected List<CTRadialShd.Segment> segment;
    protected String mapType;
    protected Double mapUnit;
    protected Double eccentricity;
    protected Double angle;
    protected String startPoint;
    protected Double startRadius;
    protected String endPoint;
    protected double endRadius;
    protected Integer extend;

    /**
     * Gets the value of the segment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTRadialShd.Segment }
     *
     *
     */
    @XmlElement(name = "Segment", required = true, type = CTRadialShd.Segment.class)
    public List<CTRadialShd.Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<CTRadialShd.Segment>();
        }
        return this.segment;
    }

    /**
     * 获取mapType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "MapType")
    public String getMapType() {
        if (mapType == null) {
            return "Direct";
        } else {
            return mapType;
        }
    }

    /**
     * 设置mapType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMapType(String value) {
        this.mapType = value;
    }

    /**
     * 获取mapUnit属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "MapUnit")
    public Double getMapUnit() {
        return mapUnit;
    }

    /**
     * 设置mapUnit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setMapUnit(Double value) {
        this.mapUnit = value;
    }

    /**
     * 获取eccentricity属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "Eccentricity")
    public double getEccentricity() {
        if (eccentricity == null) {
            return  0.0D;
        } else {
            return eccentricity;
        }
    }

    /**
     * 设置eccentricity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setEccentricity(Double value) {
        this.eccentricity = value;
    }

    /**
     * 获取angle属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "Angle")
    public double getAngle() {
        if (angle == null) {
            return  0.0D;
        } else {
            return angle;
        }
    }

    /**
     * 设置angle属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setAngle(Double value) {
        this.angle = value;
    }

    /**
     * 获取startPoint属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "StartPoint", required = true)
    public String getStartPoint() {
        return startPoint;
    }

    /**
     * 设置startPoint属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStartPoint(String value) {
        this.startPoint = value;
    }

    /**
     * 获取startRadius属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "StartRadius")
    public double getStartRadius() {
        if (startRadius == null) {
            return  0.0D;
        } else {
            return startRadius;
        }
    }

    /**
     * 设置startRadius属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setStartRadius(Double value) {
        this.startRadius = value;
    }

    /**
     * 获取endPoint属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "EndPoint", required = true)
    public String getEndPoint() {
        return endPoint;
    }

    /**
     * 设置endPoint属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEndPoint(String value) {
        this.endPoint = value;
    }

    /**
     * 获取endRadius属性的值。
     *
     */
    @XmlAttribute(name = "EndRadius", required = true)
    public double getEndRadius() {
        return endRadius;
    }

    /**
     * 设置endRadius属性的值。
     *
     */
    public void setEndRadius(double value) {
        this.endRadius = value;
    }

    /**
     * 获取extend属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    @XmlAttribute(name = "Extend")
    public int getExtend() {
        if (extend == null) {
            return  0;
        } else {
            return extend;
        }
    }

    /**
     * 设置extend属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setExtend(Integer value) {
        this.extend = value;
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
     *         &lt;element name="Color" type="{http://www.ofdspec.org/2016}CT_Color"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Position" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "color"
    })
    public static class Segment {

        protected CTColor color;
        protected Double position;

        /**
         * 获取color属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTColor }
         *
         */
        @XmlElement(name = "Color", required = true)
        public CTColor getColor() {
            return color;
        }

        /**
         * 设置color属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link CTColor }
         *
         */
        public void setColor(CTColor value) {
            this.color = value;
        }

        /**
         * 获取position属性的值。
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
        @XmlAttribute(name = "Position")
        public Double getPosition() {
            return position;
        }

        /**
         * 设置position属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Double }
         *
         */
        public void setPosition(Double value) {
            this.position = value;
        }

    }

}

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_AxialShd complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_AxialShd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Color" type="{http://www.ofdspec.org/2016}CT_Color"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Position" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MapType" default="Direct">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Direct"/>
 *             &lt;enumeration value="Repeat"/>
 *             &lt;enumeration value="Reflect"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MapUnit" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Extend" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="StartPoint" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" />
 *       &lt;attribute name="EndPoint" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AxialShd", propOrder = {
    "segment"
})
public class CTAxialShd {

    @XmlElement(name = "Segment", required = true)
    protected List<Segment> segment;
    @XmlAttribute(name = "MapType")
    protected String        mapType;
    @XmlAttribute(name = "MapUnit")
    protected Double mapUnit;
    @XmlAttribute(name = "Extend")
    protected Integer extend;
    @XmlAttribute(name = "StartPoint", required = true)
    protected String startPoint;
    @XmlAttribute(name = "EndPoint", required = true)
    protected String endPoint;

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
     * {@link Segment }
     *
     *
     */
    public List<Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment>();
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
     * 获取extend属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
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
     * 获取startPoint属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
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
     * 获取endPoint属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
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
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Color" type="{http://www.ofdspec.org/2016}CT_Color"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Position" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "color"
    })
    public static class Segment {

        @XmlElement(name = "Color", required = true)
        protected CTColor color;
        @XmlAttribute(name = "Position")
        protected Double position;

        /**
         * 获取color属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTColor }
         *
         */
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

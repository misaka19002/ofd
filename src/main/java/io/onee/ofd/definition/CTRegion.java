//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:53:53 PM CST
//


package io.onee.ofd.definition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_Region complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Region"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="Move"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Line"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="QuadraticBezier"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                           &lt;attribute name="Point2" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CubicBezier"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Point1" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                           &lt;attribute name="Point2" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                           &lt;attribute name="Point3" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Arc"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="SweepDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="LargeArc" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="RotationAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                           &lt;attribute name="EllipseSize" use="required" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *                           &lt;attribute name="EndPoint" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Close" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="Start" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Region", propOrder = {
    "area"
})
public class CTRegion {

    protected List<Area> area;

    /**
     * Gets the value of the area property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Area }
     *
     *
     */
    @XmlElement(name = "Area", required = true, type = Area.class)
    public List<Area> getArea() {
        if (area == null) {
            area = new ArrayList<Area>();
        }
        return this.area;
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
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="Move"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Line"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="QuadraticBezier"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *                 &lt;attribute name="Point2" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CubicBezier"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Point1" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *                 &lt;attribute name="Point2" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *                 &lt;attribute name="Point3" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Arc"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="SweepDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="LargeArc" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="RotationAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *                 &lt;attribute name="EllipseSize" use="required" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
     *                 &lt;attribute name="EndPoint" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Close" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="Start" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "moveOrLineOrQuadraticBezier"
    })
    public static class Area {

        protected List<Object> moveOrLineOrQuadraticBezier;
        protected String start;

        /**
         * Gets the value of the moveOrLineOrQuadraticBezier property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the moveOrLineOrQuadraticBezier property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMoveOrLineOrQuadraticBezier().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Move }
         * {@link Line }
         * {@link QuadraticBezier }
         * {@link CubicBezier }
         * {@link Arc }
         * {@link Object }
         *
         *
         */
        @XmlElements({
            @XmlElement(name = "Move", type = Move.class),
            @XmlElement(name = "Line", type = Line.class),
            @XmlElement(name = "QuadraticBezier", type = QuadraticBezier.class),
            @XmlElement(name = "CubicBezier", type = CubicBezier.class),
            @XmlElement(name = "Arc", type = Arc.class),
            @XmlElement(name = "Close", type = Object.class)
        })
        public List<Object> getMoveOrLineOrQuadraticBezier() {
            if (moveOrLineOrQuadraticBezier == null) {
                moveOrLineOrQuadraticBezier = new ArrayList<Object>();
            }
            return this.moveOrLineOrQuadraticBezier;
        }

        /**
         * 获取start属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "Start", required = true)
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setStart(String value) {
            this.start = value;
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
         *       &lt;attribute name="SweepDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="LargeArc" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="RotationAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
         *       &lt;attribute name="EllipseSize" use="required" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
         *       &lt;attribute name="EndPoint" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class Arc {

            protected boolean sweepDirection;
            protected boolean largeArc;
            protected double rotationAngle;
            protected String ellipseSize;
            protected String endPoint;

            /**
             * 获取sweepDirection属性的值。
             *
             */
            @XmlAttribute(name = "SweepDirection", required = true)
            public boolean isSweepDirection() {
                return sweepDirection;
            }

            /**
             * 设置sweepDirection属性的值。
             *
             */
            public void setSweepDirection(boolean value) {
                this.sweepDirection = value;
            }

            /**
             * 获取largeArc属性的值。
             *
             */
            @XmlAttribute(name = "LargeArc", required = true)
            public boolean isLargeArc() {
                return largeArc;
            }

            /**
             * 设置largeArc属性的值。
             *
             */
            public void setLargeArc(boolean value) {
                this.largeArc = value;
            }

            /**
             * 获取rotationAngle属性的值。
             *
             */
            @XmlAttribute(name = "RotationAngle", required = true)
            public double getRotationAngle() {
                return rotationAngle;
            }

            /**
             * 设置rotationAngle属性的值。
             *
             */
            public void setRotationAngle(double value) {
                this.rotationAngle = value;
            }

            /**
             * 获取ellipseSize属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "EllipseSize", required = true)
            public String getEllipseSize() {
                return ellipseSize;
            }

            /**
             * 设置ellipseSize属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEllipseSize(String value) {
                this.ellipseSize = value;
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
         *       &lt;attribute name="Point1" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *       &lt;attribute name="Point2" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *       &lt;attribute name="Point3" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class CubicBezier {

            protected String point1;
            protected String point2;
            protected String point3;

            /**
             * 获取point1属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Point1")
            public String getPoint1() {
                return point1;
            }

            /**
             * 设置point1属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPoint1(String value) {
                this.point1 = value;
            }

            /**
             * 获取point2属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Point2")
            public String getPoint2() {
                return point2;
            }

            /**
             * 设置point2属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPoint2(String value) {
                this.point2 = value;
            }

            /**
             * 获取point3属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Point3", required = true)
            public String getPoint3() {
                return point3;
            }

            /**
             * 设置point3属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPoint3(String value) {
                this.point3 = value;
            }

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
         *       &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class Line {

            protected String point1;

            /**
             * 获取point1属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Point1", required = true)
            public String getPoint1() {
                return point1;
            }

            /**
             * 设置point1属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPoint1(String value) {
                this.point1 = value;
            }

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
         *       &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class Move {

            protected String point1;

            /**
             * 获取point1属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Point1", required = true)
            public String getPoint1() {
                return point1;
            }

            /**
             * 设置point1属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPoint1(String value) {
                this.point1 = value;
            }

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
         *       &lt;attribute name="Point1" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *       &lt;attribute name="Point2" use="required" type="{http://www.ofdspec.org/2016}ST_Pos" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class QuadraticBezier {

            protected String point1;
            protected String point2;

            /**
             * 获取point1属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Point1", required = true)
            public String getPoint1() {
                return point1;
            }

            /**
             * 设置point1属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPoint1(String value) {
                this.point1 = value;
            }

            /**
             * 获取point2属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Point2", required = true)
            public String getPoint2() {
                return point2;
            }

            /**
             * 设置point2属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPoint2(String value) {
                this.point2 = value;
            }

        }

    }

}

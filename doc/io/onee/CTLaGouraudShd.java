//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_LaGouraudShd complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_LaGouraudShd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Point" maxOccurs="unbounded" minOccurs="4"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Color" type="{http://www.ofdspec.org/2016}CT_Color"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                 &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BackColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="VerticesPerRow" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Extend" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_LaGouraudShd", propOrder = {
    "point",
    "backColor"
})
public class CTLaGouraudShd {

    protected List<CTLaGouraudShd.Point> point;
    protected CTColor backColor;
    protected int verticesPerRow;
    protected Integer extend;

    /**
     * Gets the value of the point property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTLaGouraudShd.Point }
     *
     *
     */
    @XmlElement(name = "Point", required = true, type = CTLaGouraudShd.Point.class)
    public List<CTLaGouraudShd.Point> getPoint() {
        if (point == null) {
            point = new ArrayList<CTLaGouraudShd.Point>();
        }
        return this.point;
    }

    /**
     * 获取backColor属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTColor }
     *
     */
    @XmlElement(name = "BackColor")
    public CTColor getBackColor() {
        return backColor;
    }

    /**
     * 设置backColor属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTColor }
     *
     */
    public void setBackColor(CTColor value) {
        this.backColor = value;
    }

    /**
     * 获取verticesPerRow属性的值。
     *
     */
    @XmlAttribute(name = "VerticesPerRow", required = true)
    public int getVerticesPerRow() {
        return verticesPerRow;
    }

    /**
     * 设置verticesPerRow属性的值。
     *
     */
    public void setVerticesPerRow(int value) {
        this.verticesPerRow = value;
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
    public Integer getExtend() {
        return extend;
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
     *       &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *       &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
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
    public static class Point {

        protected CTColor color;
        protected Double x;
        protected Double y;

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
         * 获取x属性的值。
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
        @XmlAttribute(name = "X")
        public Double getX() {
            return x;
        }

        /**
         * 设置x属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Double }
         *
         */
        public void setX(Double value) {
            this.x = value;
        }

        /**
         * 获取y属性的值。
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
        @XmlAttribute(name = "Y")
        public Double getY() {
            return y;
        }

        /**
         * 设置y属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Double }
         *
         */
        public void setY(Double value) {
            this.y = value;
        }

    }

}

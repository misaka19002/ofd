//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:53:53 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_Text complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Text"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FillColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *         &lt;element name="StrokeColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element name="CGTransform" type="{http://www.ofdspec.org/2016}CT_CGTransform" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="TextCode"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                   &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                   &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                   &lt;attribute name="DeltaX" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *                   &lt;attribute name="DeltaY" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Font" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *       &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Stroke" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="Fill" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="HScale" type="{http://www.w3.org/2001/XMLSchema}double" default="1.0" /&gt;
 *       &lt;attribute name="ReadDirection" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="CharDirection" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="Weight" default="400"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;enumeration value="0"/&gt;
 *             &lt;enumeration value="100"/&gt;
 *             &lt;enumeration value="200"/&gt;
 *             &lt;enumeration value="300"/&gt;
 *             &lt;enumeration value="400"/&gt;
 *             &lt;enumeration value="500"/&gt;
 *             &lt;enumeration value="600"/&gt;
 *             &lt;enumeration value="700"/&gt;
 *             &lt;enumeration value="800"/&gt;
 *             &lt;enumeration value="900"/&gt;
 *             &lt;enumeration value="1000"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Text", propOrder = {
    "fillColor",
    "strokeColor",
    "cgTransformAndTextCode"
})
@XmlSeeAlso({
    CTPageBlock.TextObject.class
})
public class CTText
    extends CTGraphicUnit
{

    protected CTColor fillColor;
    protected CTColor strokeColor;
    protected List<Object> cgTransformAndTextCode;
    protected long font;
    protected double size;
    protected Boolean stroke;
    protected Boolean fill;
    protected Double hScale;
    protected Integer readDirection;
    protected Integer charDirection;
    protected Integer weight;
    protected Boolean italic;

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
     * Gets the value of the cgTransformAndTextCode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cgTransformAndTextCode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCGTransformAndTextCode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCGTransform }
     * {@link TextCode }
     *
     *
     */
    @XmlElements({
        @XmlElement(name = "CGTransform", required = true, type = CTCGTransform.class),
        @XmlElement(name = "TextCode", required = true, type = TextCode.class)
    })
    public List<Object> getCGTransformAndTextCode() {
        if (cgTransformAndTextCode == null) {
            cgTransformAndTextCode = new ArrayList<Object>();
        }
        return this.cgTransformAndTextCode;
    }

    /**
     * 获取font属性的值。
     *
     */
    @XmlAttribute(name = "Font", required = true)
    public long getFont() {
        return font;
    }

    /**
     * 设置font属性的值。
     *
     */
    public void setFont(long value) {
        this.font = value;
    }

    /**
     * 获取size属性的值。
     *
     */
    @XmlAttribute(name = "Size", required = true)
    public double getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     *
     */
    public void setSize(double value) {
        this.size = value;
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
            return false;
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
            return true;
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
     * 获取hScale属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    @XmlAttribute(name = "HScale")
    public double getHScale() {
        if (hScale == null) {
            return  1.0D;
        } else {
            return hScale;
        }
    }

    /**
     * 设置hScale属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setHScale(Double value) {
        this.hScale = value;
    }

    /**
     * 获取readDirection属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    @XmlAttribute(name = "ReadDirection")
    public int getReadDirection() {
        if (readDirection == null) {
            return  0;
        } else {
            return readDirection;
        }
    }

    /**
     * 设置readDirection属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setReadDirection(Integer value) {
        this.readDirection = value;
    }

    /**
     * 获取charDirection属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    @XmlAttribute(name = "CharDirection")
    public int getCharDirection() {
        if (charDirection == null) {
            return  0;
        } else {
            return charDirection;
        }
    }

    /**
     * 设置charDirection属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCharDirection(Integer value) {
        this.charDirection = value;
    }

    /**
     * 获取weight属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    @XmlAttribute(name = "Weight")
    public int getWeight() {
        if (weight == null) {
            return  400;
        } else {
            return weight;
        }
    }

    /**
     * 设置weight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * 获取italic属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlAttribute(name = "Italic")
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**
     * 设置italic属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *       &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *       &lt;attribute name="DeltaX" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
     *       &lt;attribute name="DeltaY" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TextCode {

        protected String value;
        protected Double x;
        protected Double y;
        protected String deltaX;
        protected String deltaY;

        /**
         * 获取value属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlValue
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

        /**
         * 获取deltaX属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "DeltaX")
        public String getDeltaX() {
            return deltaX;
        }

        /**
         * 设置deltaX属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDeltaX(String value) {
            this.deltaX = value;
        }

        /**
         * 获取deltaY属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "DeltaY")
        public String getDeltaY() {
            return deltaY;
        }

        /**
         * 设置deltaY属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDeltaY(String value) {
            this.deltaY = value;
        }

    }

}

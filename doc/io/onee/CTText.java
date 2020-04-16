//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_Text complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Text">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit">
 *       &lt;sequence>
 *         &lt;element name="FillColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
 *         &lt;element name="StrokeColor" type="{http://www.ofdspec.org/2016}CT_Color" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="CGTransform" type="{http://www.ofdspec.org/2016}CT_CGTransform" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="TextCode">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                   &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                   &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                   &lt;attribute name="DeltaX" type="{http://www.ofdspec.org/2016}ST_Array" />
 *                   &lt;attribute name="DeltaY" type="{http://www.ofdspec.org/2016}ST_Array" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="Font" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *       &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Stroke" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Fill" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="HScale" type="{http://www.w3.org/2001/XMLSchema}double" default="1.0" />
 *       &lt;attribute name="ReadDirection" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="CharDirection" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Weight" default="400">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="100"/>
 *             &lt;enumeration value="200"/>
 *             &lt;enumeration value="300"/>
 *             &lt;enumeration value="400"/>
 *             &lt;enumeration value="500"/>
 *             &lt;enumeration value="600"/>
 *             &lt;enumeration value="700"/>
 *             &lt;enumeration value="800"/>
 *             &lt;enumeration value="900"/>
 *             &lt;enumeration value="1000"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Italic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Text", propOrder = {
    "fillColor",
    "strokeColor",
    "cgTransformAndTextCode"
})
@XmlSeeAlso({
    io.onee.CTPageBlock.TextObject.class
})
public class CTText
    extends CTGraphicUnit
{

    @XmlElement(name = "FillColor")
    protected CTColor fillColor;
    @XmlElement(name = "StrokeColor")
    protected CTColor strokeColor;
    @XmlElements({
        @XmlElement(name = "CGTransform", required = true, type = CTCGTransform.class),
        @XmlElement(name = "TextCode", required = true, type = CTText.TextCode.class)
    })
    protected List<Object> cgTransformAndTextCode;
    @XmlAttribute(name = "Font", required = true)
    protected long font;
    @XmlAttribute(name = "Size", required = true)
    protected double size;
    @XmlAttribute(name = "Stroke")
    protected Boolean stroke;
    @XmlAttribute(name = "Fill")
    protected Boolean fill;
    @XmlAttribute(name = "HScale")
    protected Double hScale;
    @XmlAttribute(name = "ReadDirection")
    protected Integer readDirection;
    @XmlAttribute(name = "CharDirection")
    protected Integer charDirection;
    @XmlAttribute(name = "Weight")
    protected Integer weight;
    @XmlAttribute(name = "Italic")
    protected Boolean italic;

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
     * {@link CTText.TextCode }
     *
     *
     */
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
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="X" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="Y" type="{http://www.w3.org/2001/XMLSchema}double" />
     *       &lt;attribute name="DeltaX" type="{http://www.ofdspec.org/2016}ST_Array" />
     *       &lt;attribute name="DeltaY" type="{http://www.ofdspec.org/2016}ST_Array" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TextCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "X")
        protected Double x;
        @XmlAttribute(name = "Y")
        protected Double y;
        @XmlAttribute(name = "DeltaX")
        protected String deltaX;
        @XmlAttribute(name = "DeltaY")
        protected String deltaY;

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
         * 获取x属性的值。
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
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

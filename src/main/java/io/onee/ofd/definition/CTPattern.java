//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Pattern complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Pattern">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellContent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
 *                 &lt;attribute name="Thumbnail" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="XStep" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="YStep" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ReflectMethod" default="Normal">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Normal"/>
 *             &lt;enumeration value="Row"/>
 *             &lt;enumeration value="Column"/>
 *             &lt;enumeration value="RowAndColumn"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RelativeTo" default="Object">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Page"/>
 *             &lt;enumeration value="Object"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CTM" type="{http://www.ofdspec.org/2016}ST_Array" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Pattern", propOrder = {
    "cellContent"
})
public class CTPattern {

    @XmlElement(name = "CellContent", required = true)
    protected CellContent cellContent;
    @XmlAttribute(name = "Width", required = true)
    protected double width;
    @XmlAttribute(name = "Height", required = true)
    protected double height;
    @XmlAttribute(name = "XStep")
    protected Double xStep;
    @XmlAttribute(name = "YStep")
    protected Double yStep;
    @XmlAttribute(name = "ReflectMethod")
    protected String reflectMethod;
    @XmlAttribute(name = "RelativeTo")
    protected String relativeTo;
    @XmlAttribute(name = "CTM")
    protected String ctm;

    /**
     * 获取cellContent属性的值。
     *
     * @return
     *     possible object is
     *     {@link CellContent }
     *
     */
    public CellContent getCellContent() {
        return cellContent;
    }

    /**
     * 设置cellContent属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CellContent }
     *
     */
    public void setCellContent(CellContent value) {
        this.cellContent = value;
    }

    /**
     * 获取width属性的值。
     *
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     *
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     *
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     *
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * 获取xStep属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getXStep() {
        return xStep;
    }

    /**
     * 设置xStep属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setXStep(Double value) {
        this.xStep = value;
    }

    /**
     * 获取yStep属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getYStep() {
        return yStep;
    }

    /**
     * 设置yStep属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setYStep(Double value) {
        this.yStep = value;
    }

    /**
     * 获取reflectMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReflectMethod() {
        if (reflectMethod == null) {
            return "Normal";
        } else {
            return reflectMethod;
        }
    }

    /**
     * 设置reflectMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReflectMethod(String value) {
        this.reflectMethod = value;
    }

    /**
     * 获取relativeTo属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRelativeTo() {
        if (relativeTo == null) {
            return "Object";
        } else {
            return relativeTo;
        }
    }

    /**
     * 设置relativeTo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRelativeTo(String value) {
        this.relativeTo = value;
    }

    /**
     * 获取ctm属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCTM() {
        return ctm;
    }

    /**
     * 设置ctm属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCTM(String value) {
        this.ctm = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
     *       &lt;attribute name="Thumbnail" type="{http://www.ofdspec.org/2016}ST_RefID" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CellContent
        extends CTPageBlock
    {

        @XmlAttribute(name = "Thumbnail")
        protected Long thumbnail;

        /**
         * 获取thumbnail属性的值。
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getThumbnail() {
            return thumbnail;
        }

        /**
         * 设置thumbnail属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setThumbnail(Long value) {
            this.thumbnail = value;
        }

    }

}

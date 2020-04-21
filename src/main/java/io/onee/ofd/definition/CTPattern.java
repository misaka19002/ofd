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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_Pattern complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Pattern"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellContent"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
 *                 &lt;attribute name="Thumbnail" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="XStep" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="YStep" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="ReflectMethod" default="Normal"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Normal"/&gt;
 *             &lt;enumeration value="Row"/&gt;
 *             &lt;enumeration value="Column"/&gt;
 *             &lt;enumeration value="RowAndColumn"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RelativeTo" default="Object"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Page"/&gt;
 *             &lt;enumeration value="Object"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CTM" type="{http://www.ofdspec.org/2016}ST_Array" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Pattern", propOrder = {
    "cellContent"
})
public class CTPattern {

    protected CellContent cellContent;
    protected double width;
    protected double height;
    protected Double xStep;
    protected Double yStep;
    protected String reflectMethod;
    protected String relativeTo;
    protected String ctm;

    /**
     * 获取cellContent属性的值。
     *
     * @return
     *     possible object is
     *     {@link CellContent }
     *
     */
    @XmlElement(name = "CellContent", required = true)
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
    @XmlAttribute(name = "Width", required = true)
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
    @XmlAttribute(name = "Height", required = true)
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
    @XmlAttribute(name = "XStep")
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
    @XmlAttribute(name = "YStep")
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
    @XmlAttribute(name = "ReflectMethod")
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
    @XmlAttribute(name = "RelativeTo")
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
    @XmlAttribute(name = "CTM")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
     *       &lt;attribute name="Thumbnail" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "")
    public static class CellContent
        extends CTPageBlock
    {

        protected Long thumbnail;

        /**
         * 获取thumbnail属性的值。
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        @XmlAttribute(name = "Thumbnail")
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

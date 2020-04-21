//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CT_Permission complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Permission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Annot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Export" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Watermark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrintScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Print" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Printable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Copies" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ValidPeriod" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
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
@XmlType(name = "CT_Permission", propOrder = {
    "edit",
    "annot",
    "export",
    "signature",
    "watermark",
    "printScreen",
    "print",
    "validPeriod"
})
public class CTPermission {

    protected Boolean edit;
    protected Boolean annot;
    protected Boolean export;
    protected Boolean signature;
    protected Boolean watermark;
    protected Boolean printScreen;
    protected CTPermission.Print print;
    protected CTPermission.ValidPeriod validPeriod;

    /**
     * 获取edit属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlElement(name = "Edit", defaultValue = "true")
    public Boolean isEdit() {
        return edit;
    }

    /**
     * 设置edit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setEdit(Boolean value) {
        this.edit = value;
    }

    /**
     * 获取annot属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlElement(name = "Annot", defaultValue = "true")
    public Boolean isAnnot() {
        return annot;
    }

    /**
     * 设置annot属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAnnot(Boolean value) {
        this.annot = value;
    }

    /**
     * 获取export属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlElement(name = "Export", defaultValue = "true")
    public Boolean isExport() {
        return export;
    }

    /**
     * 设置export属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExport(Boolean value) {
        this.export = value;
    }

    /**
     * 获取signature属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlElement(name = "Signature", defaultValue = "true")
    public Boolean isSignature() {
        return signature;
    }

    /**
     * 设置signature属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSignature(Boolean value) {
        this.signature = value;
    }

    /**
     * 获取watermark属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlElement(name = "Watermark", defaultValue = "true")
    public Boolean isWatermark() {
        return watermark;
    }

    /**
     * 设置watermark属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWatermark(Boolean value) {
        this.watermark = value;
    }

    /**
     * 获取printScreen属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlElement(name = "PrintScreen", defaultValue = "true")
    public Boolean isPrintScreen() {
        return printScreen;
    }

    /**
     * 设置printScreen属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPrintScreen(Boolean value) {
        this.printScreen = value;
    }

    /**
     * 获取print属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTPermission.Print }
     *
     */
    @XmlElement(name = "Print")
    public CTPermission.Print getPrint() {
        return print;
    }

    /**
     * 设置print属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTPermission.Print }
     *
     */
    public void setPrint(CTPermission.Print value) {
        this.print = value;
    }

    /**
     * 获取validPeriod属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTPermission.ValidPeriod }
     *
     */
    @XmlElement(name = "ValidPeriod")
    public CTPermission.ValidPeriod getValidPeriod() {
        return validPeriod;
    }

    /**
     * 设置validPeriod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTPermission.ValidPeriod }
     *
     */
    public void setValidPeriod(CTPermission.ValidPeriod value) {
        this.validPeriod = value;
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
     *       &lt;attribute name="Printable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Copies" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "")
    public static class Print {

        protected boolean printable;
        protected Integer copies;

        /**
         * 获取printable属性的值。
         *
         */
        @XmlAttribute(name = "Printable", required = true)
        public boolean isPrintable() {
            return printable;
        }

        /**
         * 设置printable属性的值。
         *
         */
        public void setPrintable(boolean value) {
            this.printable = value;
        }

        /**
         * 获取copies属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        @XmlAttribute(name = "Copies")
        public int getCopies() {
            if (copies == null) {
                return -1;
            } else {
                return copies;
            }
        }

        /**
         * 设置copies属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setCopies(Integer value) {
            this.copies = value;
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
     *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "")
    public static class ValidPeriod {

        protected XMLGregorianCalendar startDate;
        protected XMLGregorianCalendar endDate;

        /**
         * 获取startDate属性的值。
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        @XmlAttribute(name = "StartDate")
        @XmlSchemaType(name = "dateTime")
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * 设置startDate属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * 获取endDate属性的值。
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        @XmlAttribute(name = "EndDate")
        @XmlSchemaType(name = "dateTime")
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * 设置endDate属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

    }

}

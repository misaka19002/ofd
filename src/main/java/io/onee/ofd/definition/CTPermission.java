//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CT_Permission complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Permission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Edit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Annot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Export" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Watermark" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrintScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Print" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Printable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Copies" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValidPeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
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

    @XmlElement(name = "Edit", defaultValue = "true")
    protected Boolean edit;
    @XmlElement(name = "Annot", defaultValue = "true")
    protected Boolean annot;
    @XmlElement(name = "Export", defaultValue = "true")
    protected Boolean export;
    @XmlElement(name = "Signature", defaultValue = "true")
    protected Boolean signature;
    @XmlElement(name = "Watermark", defaultValue = "true")
    protected Boolean watermark;
    @XmlElement(name = "PrintScreen", defaultValue = "true")
    protected Boolean printScreen;
    @XmlElement(name = "Print")
    protected Print print;
    @XmlElement(name = "ValidPeriod")
    protected ValidPeriod validPeriod;

    /**
     * 获取edit属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
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
     *     {@link Print }
     *
     */
    public Print getPrint() {
        return print;
    }

    /**
     * 设置print属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Print }
     *
     */
    public void setPrint(Print value) {
        this.print = value;
    }

    /**
     * 获取validPeriod属性的值。
     *
     * @return
     *     possible object is
     *     {@link ValidPeriod }
     *
     */
    public ValidPeriod getValidPeriod() {
        return validPeriod;
    }

    /**
     * 设置validPeriod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ValidPeriod }
     *
     */
    public void setValidPeriod(ValidPeriod value) {
        this.validPeriod = value;
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
     *       &lt;attribute name="Printable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Copies" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Print {

        @XmlAttribute(name = "Printable", required = true)
        protected boolean printable;
        @XmlAttribute(name = "Copies")
        protected Integer copies;

        /**
         * 获取printable属性的值。
         *
         */
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValidPeriod {

        @XmlAttribute(name = "StartDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startDate;
        @XmlAttribute(name = "EndDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endDate;

        /**
         * 获取startDate属性的值。
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
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

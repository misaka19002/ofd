//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_Extension complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Extension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Property">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="ExtendData" type="{http://www.ofdspec.org/2016}ST_Loc"/>
 *       &lt;/choice>
 *       &lt;attribute name="AppName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AppVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="RefId" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Extension", propOrder = {
    "propertyOrDataOrExtendData"
})
public class CTExtension {

    @XmlElements({
        @XmlElement(name = "Property", type = Property.class),
        @XmlElement(name = "Data"),
        @XmlElement(name = "ExtendData", type = String.class)
    })
    protected List<Object> propertyOrDataOrExtendData;
    @XmlAttribute(name = "AppName", required = true)
    protected String appName;
    @XmlAttribute(name = "Company")
    protected String company;
    @XmlAttribute(name = "AppVersion")
    protected String appVersion;
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "RefId", required = true)
    protected long refId;

    /**
     * Gets the value of the propertyOrDataOrExtendData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrDataOrExtendData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrDataOrExtendData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * {@link Object }
     * {@link String }
     *
     *
     */
    public List<Object> getPropertyOrDataOrExtendData() {
        if (propertyOrDataOrExtendData == null) {
            propertyOrDataOrExtendData = new ArrayList<Object>();
        }
        return this.propertyOrDataOrExtendData;
    }

    /**
     * 获取appName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置appName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * 获取company属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置company属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * 获取appVersion属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * 设置appVersion属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAppVersion(String value) {
        this.appVersion = value;
    }

    /**
     * 获取date属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * 获取refId属性的值。
     *
     */
    public long getRefId() {
        return refId;
    }

    /**
     * 设置refId属性的值。
     *
     */
    public void setRefId(long value) {
        this.refId = value;
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
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Property {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Type")
        protected String type;

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
         * 获取name属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取type属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}

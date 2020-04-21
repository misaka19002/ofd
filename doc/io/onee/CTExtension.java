//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

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
 * &lt;complexType name="CT_Extension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="Property"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ExtendData" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="AppName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AppVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="RefId" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Extension", propOrder = {
    "propertyOrDataOrExtendData"
})
public class CTExtension {

    protected List<Object> propertyOrDataOrExtendData;
    protected String appName;
    protected String company;
    protected String appVersion;
    protected XMLGregorianCalendar date;
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
     * {@link CTExtension.Property }
     * {@link Object }
     * {@link String }
     *
     *
     */
    @XmlElements({
        @XmlElement(name = "Property", type = CTExtension.Property.class),
        @XmlElement(name = "Data", type = Object.class),
        @XmlElement(name = "ExtendData", type = String.class)
    })
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
    @XmlAttribute(name = "AppName", required = true)
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
    @XmlAttribute(name = "Company")
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
    @XmlAttribute(name = "AppVersion")
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
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "dateTime")
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
    @XmlAttribute(name = "RefId", required = true)
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
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class Property {

        protected String value;
        protected String name;
        protected String type;

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
         * 获取name属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "Name", required = true)
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
        @XmlAttribute(name = "Type")
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

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CT_Attachment complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Attachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ModDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="Usage" type="{http://www.w3.org/2001/XMLSchema}string" default="none" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Attachment", propOrder = {
    "fileLoc"
})
public class CTAttachment {

    @XmlElement(name = "FileLoc", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String fileLoc;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Format")
    protected String format;
    @XmlAttribute(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlAttribute(name = "ModDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modDate;
    @XmlAttribute(name = "Size")
    protected Double size;
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    @XmlAttribute(name = "Usage")
    protected String usage;

    /**
     * 获取fileLoc属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileLoc() {
        return fileLoc;
    }

    /**
     * 设置fileLoc属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileLoc(String value) {
        this.fileLoc = value;
    }

    /**
     * 获取id属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setID(String value) {
        this.id = value;
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
     * 获取format属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * 获取creationDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * 获取modDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getModDate() {
        return modDate;
    }

    /**
     * 设置modDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setModDate(XMLGregorianCalendar value) {
        this.modDate = value;
    }

    /**
     * 获取size属性的值。
     *
     * @return
     *     possible object is
     *     {@link Double }
     *
     */
    public Double getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Double }
     *
     */
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * 获取visible属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isVisible() {
        if (visible == null) {
            return true;
        } else {
            return visible;
        }
    }

    /**
     * 设置visible属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * 获取usage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsage() {
        if (usage == null) {
            return "none";
        } else {
            return usage;
        }
    }

    /**
     * 设置usage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsage(String value) {
        this.usage = value;
    }

}

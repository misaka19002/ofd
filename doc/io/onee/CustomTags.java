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
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomTag" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SchemaLoc" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
 *                   &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NameSpace" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "", propOrder = {
    "customTag"
})
@XmlRootElement(name = "CustomTags")
public class CustomTags {

    @XmlElement(name = "CustomTag")
    protected List<CustomTags.CustomTag> customTag;

    /**
     * Gets the value of the customTag property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomTags.CustomTag }
     *
     *
     */
    public List<CustomTags.CustomTag> getCustomTag() {
        if (customTag == null) {
            customTag = new ArrayList<CustomTags.CustomTag>();
        }
        return this.customTag;
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
     *       &lt;sequence>
     *         &lt;element name="SchemaLoc" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
     *         &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
     *       &lt;/sequence>
     *       &lt;attribute name="NameSpace" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "schemaLoc",
        "fileLoc"
    })
    public static class CustomTag {

        @XmlElement(name = "SchemaLoc")
        @XmlSchemaType(name = "anyURI")
        protected String schemaLoc;
        @XmlElement(name = "FileLoc", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String fileLoc;
        @XmlAttribute(name = "NameSpace", required = true)
        protected String nameSpace;

        /**
         * 获取schemaLoc属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSchemaLoc() {
            return schemaLoc;
        }

        /**
         * 设置schemaLoc属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSchemaLoc(String value) {
            this.schemaLoc = value;
        }

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
         * 获取nameSpace属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNameSpace() {
            return nameSpace;
        }

        /**
         * 设置nameSpace属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNameSpace(String value) {
            this.nameSpace = value;
        }

    }

}

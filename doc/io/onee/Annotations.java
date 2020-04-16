//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST 
//


package io.onee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Page" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PageID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
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
    "page"
})
@XmlRootElement(name = "Annotations")
public class Annotations {

    @XmlElement(name = "Page")
    protected List<Annotations.Page> page;

    /**
     * Gets the value of the page property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotations.Page }
     * 
     * 
     */
    public List<Annotations.Page> getPage() {
        if (page == null) {
            page = new ArrayList<Annotations.Page>();
        }
        return this.page;
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
     *         &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
     *       &lt;/sequence>
     *       &lt;attribute name="PageID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileLoc"
    })
    public static class Page {

        @XmlElement(name = "FileLoc", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String fileLoc;
        @XmlAttribute(name = "PageID", required = true)
        protected long pageID;

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
         * 获取pageID属性的值。
         * 
         */
        public long getPageID() {
            return pageID;
        }

        /**
         * 设置pageID属性的值。
         * 
         */
        public void setPageID(long value) {
            this.pageID = value;
        }

    }

}

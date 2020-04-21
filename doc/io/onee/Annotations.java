//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Page" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PageID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
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
@XmlType(name = "", propOrder = {
    "page"
})
@XmlRootElement(name = "Annotations")
public class Annotations {

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
    @XmlElement(name = "Page", type = Annotations.Page.class)
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PageID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "fileLoc"
    })
    public static class Page {

        protected String fileLoc;
        protected long pageID;

        /**
         * 获取fileLoc属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlElement(name = "FileLoc", required = true)
        @XmlSchemaType(name = "anyURI")
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
        @XmlAttribute(name = "PageID", required = true)
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

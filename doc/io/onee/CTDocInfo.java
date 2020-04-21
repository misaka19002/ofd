//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_DocInfo complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_DocInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ModDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DocUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cover" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/&gt;
 *         &lt;element name="Keywords" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomDatas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustomData" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "CT_DocInfo", propOrder = {
    "docID",
    "title",
    "author",
    "subject",
    "_abstract",
    "creationDate",
    "modDate",
    "docUsage",
    "cover",
    "keywords",
    "creator",
    "creatorVersion",
    "customDatas"
})
public class CTDocInfo {

    protected String docID;
    protected String title;
    protected String author;
    protected String subject;
    protected String _abstract;
    protected XMLGregorianCalendar creationDate;
    protected XMLGregorianCalendar modDate;
    protected String docUsage;
    protected String cover;
    protected CTDocInfo.Keywords keywords;
    protected String creator;
    protected String creatorVersion;
    protected CTDocInfo.CustomDatas customDatas;

    /**
     * 获取docID属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "DocID", required = true)
    public String getDocID() {
        return docID;
    }

    /**
     * 设置docID属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocID(String value) {
        this.docID = value;
    }

    /**
     * 获取title属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "Title")
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取author属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "Author")
    public String getAuthor() {
        return author;
    }

    /**
     * 设置author属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * 获取subject属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "Subject")
    public String getSubject() {
        return subject;
    }

    /**
     * 设置subject属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * 获取abstract属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "Abstract")
    public String getAbstract() {
        return _abstract;
    }

    /**
     * 设置abstract属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * 获取creationDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "date")
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
    @XmlElement(name = "ModDate")
    @XmlSchemaType(name = "date")
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
     * 获取docUsage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "DocUsage")
    public String getDocUsage() {
        return docUsage;
    }

    /**
     * 设置docUsage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocUsage(String value) {
        this.docUsage = value;
    }

    /**
     * 获取cover属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "Cover")
    @XmlSchemaType(name = "anyURI")
    public String getCover() {
        return cover;
    }

    /**
     * 设置cover属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCover(String value) {
        this.cover = value;
    }

    /**
     * 获取keywords属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTDocInfo.Keywords }
     *
     */
    @XmlElement(name = "Keywords")
    public CTDocInfo.Keywords getKeywords() {
        return keywords;
    }

    /**
     * 设置keywords属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTDocInfo.Keywords }
     *
     */
    public void setKeywords(CTDocInfo.Keywords value) {
        this.keywords = value;
    }

    /**
     * 获取creator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "Creator")
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取creatorVersion属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "CreatorVersion")
    public String getCreatorVersion() {
        return creatorVersion;
    }

    /**
     * 设置creatorVersion属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreatorVersion(String value) {
        this.creatorVersion = value;
    }

    /**
     * 获取customDatas属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTDocInfo.CustomDatas }
     *
     */
    @XmlElement(name = "CustomDatas")
    public CTDocInfo.CustomDatas getCustomDatas() {
        return customDatas;
    }

    /**
     * 设置customDatas属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTDocInfo.CustomDatas }
     *
     */
    public void setCustomDatas(CTDocInfo.CustomDatas value) {
        this.customDatas = value;
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
     *         &lt;element name="CustomData" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "customData"
    })
    public static class CustomDatas {

        protected List<CTDocInfo.CustomDatas.CustomData> customData;

        /**
         * Gets the value of the customData property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customData property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomData().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CTDocInfo.CustomDatas.CustomData }
         *
         *
         */
        @XmlElement(name = "CustomData", required = true, type = CTDocInfo.CustomDatas.CustomData.class)
        public List<CTDocInfo.CustomDatas.CustomData> getCustomData() {
            if (customData == null) {
                customData = new ArrayList<CTDocInfo.CustomDatas.CustomData>();
            }
            return this.customData;
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
        public static class CustomData {

            protected String value;
            protected String name;

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
     *       &lt;sequence&gt;
     *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "keyword"
    })
    public static class Keywords {

        protected List<String> keyword;

        /**
         * Gets the value of the keyword property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyword property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyword().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        @XmlElement(name = "Keyword", required = true, type = String.class)
        public List<String> getKeyword() {
            if (keyword == null) {
                keyword = new ArrayList<String>();
            }
            return this.keyword;
        }

    }

}

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
 *         &lt;element name="CommonData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MaxUnitID" type="{http://www.ofdspec.org/2016}ST_ID"/>
 *                   &lt;element name="PageArea" type="{http://www.ofdspec.org/2016}CT_PageArea"/>
 *                   &lt;element name="PublicRes" type="{http://www.ofdspec.org/2016}ST_Loc" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DocumentRes" type="{http://www.ofdspec.org/2016}ST_Loc" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TemplatePage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ZOrder">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Background"/>
 *                                 &lt;enumeration value="Foreground"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DefaultCS" type="{http://www.ofdspec.org/2016}ST_RefID" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Page" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *                           &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Outlines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OutlineElem" type="{http://www.ofdspec.org/2016}CT_OutlineElem" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Permissions" type="{http://www.ofdspec.org/2016}CT_Permission" minOccurs="0"/>
 *         &lt;element name="Actions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Action" type="{http://www.ofdspec.org/2016}CT_Action" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VPreferences" type="{http://www.ofdspec.org/2016}CT_VPreferences" minOccurs="0"/>
 *         &lt;element name="Bookmarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Bookmark" type="{http://www.ofdspec.org/2016}CT_Bookmark" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Annotations" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
 *         &lt;element name="CustomTags" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
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
    "commonData",
    "pages",
    "outlines",
    "permissions",
    "actions",
    "vPreferences",
    "bookmarks",
    "annotations",
    "customTags",
    "attachments",
    "extensions"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "CommonData", required = true)
    protected Document.CommonData commonData;
    @XmlElement(name = "Pages", required = true)
    protected Document.Pages pages;
    @XmlElement(name = "Outlines")
    protected Document.Outlines outlines;
    @XmlElement(name = "Permissions")
    protected CTPermission permissions;
    @XmlElement(name = "Actions")
    protected Document.Actions actions;
    @XmlElement(name = "VPreferences")
    protected CTVPreferences vPreferences;
    @XmlElement(name = "Bookmarks")
    protected Document.Bookmarks bookmarks;
    @XmlElement(name = "Annotations")
    @XmlSchemaType(name = "anyURI")
    protected String annotations;
    @XmlElement(name = "CustomTags")
    @XmlSchemaType(name = "anyURI")
    protected String customTags;
    @XmlElement(name = "Attachments")
    @XmlSchemaType(name = "anyURI")
    protected String attachments;
    @XmlElement(name = "Extensions")
    @XmlSchemaType(name = "anyURI")
    protected String extensions;

    /**
     * 获取commonData属性的值。
     *
     * @return
     *     possible object is
     *     {@link Document.CommonData }
     *
     */
    public Document.CommonData getCommonData() {
        return commonData;
    }

    /**
     * 设置commonData属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Document.CommonData }
     *
     */
    public void setCommonData(Document.CommonData value) {
        this.commonData = value;
    }

    /**
     * 获取pages属性的值。
     *
     * @return
     *     possible object is
     *     {@link Document.Pages }
     *
     */
    public Document.Pages getPages() {
        return pages;
    }

    /**
     * 设置pages属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Document.Pages }
     *
     */
    public void setPages(Document.Pages value) {
        this.pages = value;
    }

    /**
     * 获取outlines属性的值。
     *
     * @return
     *     possible object is
     *     {@link Document.Outlines }
     *
     */
    public Document.Outlines getOutlines() {
        return outlines;
    }

    /**
     * 设置outlines属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Document.Outlines }
     *
     */
    public void setOutlines(Document.Outlines value) {
        this.outlines = value;
    }

    /**
     * 获取permissions属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTPermission }
     *
     */
    public CTPermission getPermissions() {
        return permissions;
    }

    /**
     * 设置permissions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTPermission }
     *
     */
    public void setPermissions(CTPermission value) {
        this.permissions = value;
    }

    /**
     * 获取actions属性的值。
     *
     * @return
     *     possible object is
     *     {@link Document.Actions }
     *
     */
    public Document.Actions getActions() {
        return actions;
    }

    /**
     * 设置actions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Document.Actions }
     *
     */
    public void setActions(Document.Actions value) {
        this.actions = value;
    }

    /**
     * 获取vPreferences属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTVPreferences }
     *
     */
    public CTVPreferences getVPreferences() {
        return vPreferences;
    }

    /**
     * 设置vPreferences属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTVPreferences }
     *
     */
    public void setVPreferences(CTVPreferences value) {
        this.vPreferences = value;
    }

    /**
     * 获取bookmarks属性的值。
     *
     * @return
     *     possible object is
     *     {@link Document.Bookmarks }
     *
     */
    public Document.Bookmarks getBookmarks() {
        return bookmarks;
    }

    /**
     * 设置bookmarks属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Document.Bookmarks }
     *
     */
    public void setBookmarks(Document.Bookmarks value) {
        this.bookmarks = value;
    }

    /**
     * 获取annotations属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAnnotations() {
        return annotations;
    }

    /**
     * 设置annotations属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAnnotations(String value) {
        this.annotations = value;
    }

    /**
     * 获取customTags属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomTags() {
        return customTags;
    }

    /**
     * 设置customTags属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomTags(String value) {
        this.customTags = value;
    }

    /**
     * 获取attachments属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttachments() {
        return attachments;
    }

    /**
     * 设置attachments属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttachments(String value) {
        this.attachments = value;
    }

    /**
     * 获取extensions属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExtensions() {
        return extensions;
    }

    /**
     * 设置extensions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExtensions(String value) {
        this.extensions = value;
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
     *         &lt;element name="Action" type="{http://www.ofdspec.org/2016}CT_Action" maxOccurs="unbounded"/>
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
        "action"
    })
    public static class Actions {

        @XmlElement(name = "Action", required = true)
        protected List<CTAction> action;

        /**
         * Gets the value of the action property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the action property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAction().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CTAction }
         *
         *
         */
        public List<CTAction> getAction() {
            if (action == null) {
                action = new ArrayList<CTAction>();
            }
            return this.action;
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
     *       &lt;sequence>
     *         &lt;element name="Bookmark" type="{http://www.ofdspec.org/2016}CT_Bookmark" maxOccurs="unbounded"/>
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
        "bookmark"
    })
    public static class Bookmarks {

        @XmlElement(name = "Bookmark", required = true)
        protected List<CTBookmark> bookmark;

        /**
         * Gets the value of the bookmark property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookmark property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookmark().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CTBookmark }
         *
         *
         */
        public List<CTBookmark> getBookmark() {
            if (bookmark == null) {
                bookmark = new ArrayList<CTBookmark>();
            }
            return this.bookmark;
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
     *       &lt;sequence>
     *         &lt;element name="MaxUnitID" type="{http://www.ofdspec.org/2016}ST_ID"/>
     *         &lt;element name="PageArea" type="{http://www.ofdspec.org/2016}CT_PageArea"/>
     *         &lt;element name="PublicRes" type="{http://www.ofdspec.org/2016}ST_Loc" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DocumentRes" type="{http://www.ofdspec.org/2016}ST_Loc" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TemplatePage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ZOrder">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Background"/>
     *                       &lt;enumeration value="Foreground"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DefaultCS" type="{http://www.ofdspec.org/2016}ST_RefID" minOccurs="0"/>
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
        "maxUnitID",
        "pageArea",
        "publicRes",
        "documentRes",
        "templatePage",
        "defaultCS"
    })
    public static class CommonData {

        @XmlElement(name = "MaxUnitID")
        @XmlSchemaType(name = "unsignedInt")
        protected long maxUnitID;
        @XmlElement(name = "PageArea", required = true)
        protected CTPageArea pageArea;
        @XmlElement(name = "PublicRes")
        @XmlSchemaType(name = "anyURI")
        protected List<String> publicRes;
        @XmlElement(name = "DocumentRes")
        @XmlSchemaType(name = "anyURI")
        protected List<String> documentRes;
        @XmlElement(name = "TemplatePage")
        protected List<Document.CommonData.TemplatePage> templatePage;
        @XmlElement(name = "DefaultCS")
        @XmlSchemaType(name = "unsignedInt")
        protected Long defaultCS;

        /**
         * 获取maxUnitID属性的值。
         *
         */
        public long getMaxUnitID() {
            return maxUnitID;
        }

        /**
         * 设置maxUnitID属性的值。
         *
         */
        public void setMaxUnitID(long value) {
            this.maxUnitID = value;
        }

        /**
         * 获取pageArea属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTPageArea }
         *
         */
        public CTPageArea getPageArea() {
            return pageArea;
        }

        /**
         * 设置pageArea属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link CTPageArea }
         *
         */
        public void setPageArea(CTPageArea value) {
            this.pageArea = value;
        }

        /**
         * Gets the value of the publicRes property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publicRes property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublicRes().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getPublicRes() {
            if (publicRes == null) {
                publicRes = new ArrayList<String>();
            }
            return this.publicRes;
        }

        /**
         * Gets the value of the documentRes property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentRes property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentRes().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getDocumentRes() {
            if (documentRes == null) {
                documentRes = new ArrayList<String>();
            }
            return this.documentRes;
        }

        /**
         * Gets the value of the templatePage property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the templatePage property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTemplatePage().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.CommonData.TemplatePage }
         *
         *
         */
        public List<Document.CommonData.TemplatePage> getTemplatePage() {
            if (templatePage == null) {
                templatePage = new ArrayList<Document.CommonData.TemplatePage>();
            }
            return this.templatePage;
        }

        /**
         * 获取defaultCS属性的值。
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getDefaultCS() {
            return defaultCS;
        }

        /**
         * 设置defaultCS属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setDefaultCS(Long value) {
            this.defaultCS = value;
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
         *       &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ZOrder">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Background"/>
         *             &lt;enumeration value="Foreground"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TemplatePage {

            @XmlAttribute(name = "ID", required = true)
            protected long id;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "ZOrder")
            protected String zOrder;
            @XmlAttribute(name = "BaseLoc", required = true)
            protected String baseLoc;

            /**
             * 获取id属性的值。
             *
             */
            public long getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             *
             */
            public void setID(long value) {
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
             * 获取zOrder属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getZOrder() {
                return zOrder;
            }

            /**
             * 设置zOrder属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setZOrder(String value) {
                this.zOrder = value;
            }

            /**
             * 获取baseLoc属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBaseLoc() {
                return baseLoc;
            }

            /**
             * 设置baseLoc属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBaseLoc(String value) {
                this.baseLoc = value;
            }

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
     *       &lt;sequence>
     *         &lt;element name="OutlineElem" type="{http://www.ofdspec.org/2016}CT_OutlineElem" maxOccurs="unbounded"/>
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
        "outlineElem"
    })
    public static class Outlines {

        @XmlElement(name = "OutlineElem", required = true)
        protected List<CTOutlineElem> outlineElem;

        /**
         * Gets the value of the outlineElem property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outlineElem property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutlineElem().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CTOutlineElem }
         *
         *
         */
        public List<CTOutlineElem> getOutlineElem() {
            if (outlineElem == null) {
                outlineElem = new ArrayList<CTOutlineElem>();
            }
            return this.outlineElem;
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
     *       &lt;sequence>
     *         &lt;element name="Page" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
     *                 &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
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
    public static class Pages {

        @XmlElement(name = "Page", required = true)
        protected List<Document.Pages.Page> page;

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
         * {@link Document.Pages.Page }
         *
         *
         */
        public List<Document.Pages.Page> getPage() {
            if (page == null) {
                page = new ArrayList<Document.Pages.Page>();
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
         *       &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
         *       &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Page {

            @XmlAttribute(name = "ID", required = true)
            protected long id;
            @XmlAttribute(name = "BaseLoc", required = true)
            protected String baseLoc;

            /**
             * 获取id属性的值。
             *
             */
            public long getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             *
             */
            public void setID(long value) {
                this.id = value;
            }

            /**
             * 获取baseLoc属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBaseLoc() {
                return baseLoc;
            }

            /**
             * 设置baseLoc属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBaseLoc(String value) {
                this.baseLoc = value;
            }

        }

    }

}

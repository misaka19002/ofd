//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="DocBody" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DocInfo" type="{http://www.ofdspec.org/2016}CT_DocInfo"/&gt;
 *                   &lt;element name="DocRoot" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
 *                   &lt;element name="Versions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Version" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                                     &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                                     &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Signatures" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *       &lt;attribute name="DocType" use="required" fixed="OFD"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="OFD"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "", propOrder = {
    "docBody"
})
@XmlRootElement(name = "OFD")
public class OFD {

    protected List<OFD.DocBody> docBody;
    protected String version;
    protected String docType;

    /**
     * Gets the value of the docBody property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docBody property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocBody().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OFD.DocBody }
     *
     *
     */
    @XmlElement(name = "DocBody", required = true, type = OFD.DocBody.class)
    public List<OFD.DocBody> getDocBody() {
        if (docBody == null) {
            docBody = new ArrayList<OFD.DocBody>();
        }
        return this.docBody;
    }

    /**
     * 获取version属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Version", required = true)
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * 设置version属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取docType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "DocType", required = true)
    public String getDocType() {
        if (docType == null) {
            return "OFD";
        } else {
            return docType;
        }
    }

    /**
     * 设置docType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocType(String value) {
        this.docType = value;
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
     *         &lt;element name="DocInfo" type="{http://www.ofdspec.org/2016}CT_DocInfo"/&gt;
     *         &lt;element name="DocRoot" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
     *         &lt;element name="Versions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Version" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                           &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *                           &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Signatures" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/&gt;
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
        "docInfo",
        "docRoot",
        "versions",
        "signatures"
    })
    public static class DocBody {

        protected CTDocInfo docInfo;
        protected String docRoot;
        protected OFD.DocBody.Versions versions;
        protected String signatures;

        /**
         * 获取docInfo属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTDocInfo }
         *
         */
        @XmlElement(name = "DocInfo", required = true)
        public CTDocInfo getDocInfo() {
            return docInfo;
        }

        /**
         * 设置docInfo属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link CTDocInfo }
         *
         */
        public void setDocInfo(CTDocInfo value) {
            this.docInfo = value;
        }

        /**
         * 获取docRoot属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlElement(name = "DocRoot", required = true)
        @XmlSchemaType(name = "anyURI")
        public String getDocRoot() {
            return docRoot;
        }

        /**
         * 设置docRoot属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDocRoot(String value) {
            this.docRoot = value;
        }

        /**
         * 获取versions属性的值。
         *
         * @return
         *     possible object is
         *     {@link OFD.DocBody.Versions }
         *
         */
        @XmlElement(name = "Versions")
        public OFD.DocBody.Versions getVersions() {
            return versions;
        }

        /**
         * 设置versions属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link OFD.DocBody.Versions }
         *
         */
        public void setVersions(OFD.DocBody.Versions value) {
            this.versions = value;
        }

        /**
         * 获取signatures属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlElement(name = "Signatures")
        @XmlSchemaType(name = "anyURI")
        public String getSignatures() {
            return signatures;
        }

        /**
         * 设置signatures属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSignatures(String value) {
            this.signatures = value;
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
         *         &lt;element name="Version" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *                 &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
         *                 &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
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
            "version"
        })
        public static class Versions {

            protected List<OFD.DocBody.Versions.Version> version;

            /**
             * Gets the value of the version property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the version property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVersion().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OFD.DocBody.Versions.Version }
             *
             *
             */
            @XmlElement(name = "Version", required = true, type = OFD.DocBody.Versions.Version.class)
            public List<OFD.DocBody.Versions.Version> getVersion() {
                if (version == null) {
                    version = new ArrayList<OFD.DocBody.Versions.Version>();
                }
                return this.version;
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
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
             *       &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
             *       &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.PROPERTY)
            @XmlType(name = "")
            public static class Version {

                protected String id;
                protected int index;
                protected Boolean current;
                protected String baseLoc;

                /**
                 * 获取id属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                @XmlAttribute(name = "ID", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
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
                 * 获取index属性的值。
                 *
                 */
                @XmlAttribute(name = "Index", required = true)
                public int getIndex() {
                    return index;
                }

                /**
                 * 设置index属性的值。
                 *
                 */
                public void setIndex(int value) {
                    this.index = value;
                }

                /**
                 * 获取current属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *
                 */
                @XmlAttribute(name = "Current")
                public boolean isCurrent() {
                    if (current == null) {
                        return false;
                    } else {
                        return current;
                    }
                }

                /**
                 * 设置current属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *
                 */
                public void setCurrent(Boolean value) {
                    this.current = value;
                }

                /**
                 * 获取baseLoc属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                @XmlAttribute(name = "BaseLoc", required = true)
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

}

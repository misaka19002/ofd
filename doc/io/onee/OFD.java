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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="DocBody" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DocInfo" type="{http://www.ofdspec.org/2016}CT_DocInfo"/>
 *                   &lt;element name="DocRoot" type="{http://www.ofdspec.org/2016}ST_Loc"/>
 *                   &lt;element name="Versions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Version" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                                     &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                     &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Signatures" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *       &lt;attribute name="DocType" use="required" fixed="OFD">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="OFD"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "docBody"
})
@XmlRootElement(name = "OFD")
public class OFD {

    @XmlElement(name = "DocBody", required = true)
    protected List<OFD.DocBody> docBody;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "DocType", required = true)
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DocInfo" type="{http://www.ofdspec.org/2016}CT_DocInfo"/>
     *         &lt;element name="DocRoot" type="{http://www.ofdspec.org/2016}ST_Loc"/>
     *         &lt;element name="Versions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Version" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                           &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
     *         &lt;element name="Signatures" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/>
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
        "docInfo",
        "docRoot",
        "versions",
        "signatures"
    })
    public static class DocBody {

        @XmlElement(name = "DocInfo", required = true)
        protected CTDocInfo docInfo;
        @XmlElement(name = "DocRoot", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String docRoot;
        @XmlElement(name = "Versions")
        protected OFD.DocBody.Versions versions;
        @XmlElement(name = "Signatures")
        @XmlSchemaType(name = "anyURI")
        protected String signatures;

        /**
         * 获取docInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CTDocInfo }
         *     
         */
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
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Version" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *                 &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
            "version"
        })
        public static class Versions {

            @XmlElement(name = "Version", required = true)
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
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
             *       &lt;attribute name="Index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
            public static class Version {

                @XmlAttribute(name = "ID", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String id;
                @XmlAttribute(name = "Index", required = true)
                protected int index;
                @XmlAttribute(name = "Current")
                protected Boolean current;
                @XmlAttribute(name = "BaseLoc", required = true)
                protected String baseLoc;

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
                 * 获取index属性的值。
                 * 
                 */
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

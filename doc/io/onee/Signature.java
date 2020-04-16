//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignedInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Provider">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ProviderName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SignatureMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SignatureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="References">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Reference" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CheckMethod" default="MD5">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="MD5"/>
 *                                 &lt;enumeration value="SHA1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;sequence>
 *                     &lt;element name="StampAnnot" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                             &lt;attribute name="PageRef" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *                             &lt;attribute name="Boundary" use="required" type="{http://www.ofdspec.org/2016}ST_Box" />
 *                             &lt;attribute name="Clip" type="{http://www.ofdspec.org/2016}ST_Box" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Seal" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="BaseLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SignedValue" type="{http://www.ofdspec.org/2016}ST_Loc"/>
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
    "signedInfo",
    "signedValue"
})
@XmlRootElement(name = "Signature")
public class Signature {

    @XmlElement(name = "SignedInfo", required = true)
    protected Signature.SignedInfo signedInfo;
    @XmlElement(name = "SignedValue", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String signedValue;

    /**
     * 获取signedInfo属性的值。
     *
     * @return
     *     possible object is
     *     {@link Signature.SignedInfo }
     *
     */
    public Signature.SignedInfo getSignedInfo() {
        return signedInfo;
    }

    /**
     * 设置signedInfo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Signature.SignedInfo }
     *
     */
    public void setSignedInfo(Signature.SignedInfo value) {
        this.signedInfo = value;
    }

    /**
     * 获取signedValue属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignedValue() {
        return signedValue;
    }

    /**
     * 设置signedValue属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSignedValue(String value) {
        this.signedValue = value;
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
     *         &lt;element name="Provider">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ProviderName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SignatureMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SignatureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="References">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Reference" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CheckMethod" default="MD5">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="MD5"/>
     *                       &lt;enumeration value="SHA1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;sequence>
     *           &lt;element name="StampAnnot" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                   &lt;attribute name="PageRef" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
     *                   &lt;attribute name="Boundary" use="required" type="{http://www.ofdspec.org/2016}ST_Box" />
     *                   &lt;attribute name="Clip" type="{http://www.ofdspec.org/2016}ST_Box" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="Seal" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="BaseLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
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
        "provider",
        "signatureMethod",
        "signatureDateTime",
        "references",
        "stampAnnot",
        "seal"
    })
    public static class SignedInfo {

        @XmlElement(name = "Provider", required = true)
        protected Signature.SignedInfo.Provider provider;
        @XmlElement(name = "SignatureMethod")
        protected String signatureMethod;
        @XmlElement(name = "SignatureDateTime")
        protected String signatureDateTime;
        @XmlElement(name = "References", required = true)
        protected Signature.SignedInfo.References references;
        @XmlElement(name = "StampAnnot")
        protected List<Signature.SignedInfo.StampAnnot> stampAnnot;
        @XmlElement(name = "Seal")
        protected Signature.SignedInfo.Seal seal;

        /**
         * 获取provider属性的值。
         *
         * @return
         *     possible object is
         *     {@link Signature.SignedInfo.Provider }
         *
         */
        public Signature.SignedInfo.Provider getProvider() {
            return provider;
        }

        /**
         * 设置provider属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Signature.SignedInfo.Provider }
         *
         */
        public void setProvider(Signature.SignedInfo.Provider value) {
            this.provider = value;
        }

        /**
         * 获取signatureMethod属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSignatureMethod() {
            return signatureMethod;
        }

        /**
         * 设置signatureMethod属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSignatureMethod(String value) {
            this.signatureMethod = value;
        }

        /**
         * 获取signatureDateTime属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSignatureDateTime() {
            return signatureDateTime;
        }

        /**
         * 设置signatureDateTime属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSignatureDateTime(String value) {
            this.signatureDateTime = value;
        }

        /**
         * 获取references属性的值。
         *
         * @return
         *     possible object is
         *     {@link Signature.SignedInfo.References }
         *
         */
        public Signature.SignedInfo.References getReferences() {
            return references;
        }

        /**
         * 设置references属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Signature.SignedInfo.References }
         *
         */
        public void setReferences(Signature.SignedInfo.References value) {
            this.references = value;
        }

        /**
         * Gets the value of the stampAnnot property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stampAnnot property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStampAnnot().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Signature.SignedInfo.StampAnnot }
         *
         *
         */
        public List<Signature.SignedInfo.StampAnnot> getStampAnnot() {
            if (stampAnnot == null) {
                stampAnnot = new ArrayList<Signature.SignedInfo.StampAnnot>();
            }
            return this.stampAnnot;
        }

        /**
         * 获取seal属性的值。
         *
         * @return
         *     possible object is
         *     {@link Signature.SignedInfo.Seal }
         *
         */
        public Signature.SignedInfo.Seal getSeal() {
            return seal;
        }

        /**
         * 设置seal属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Signature.SignedInfo.Seal }
         *
         */
        public void setSeal(Signature.SignedInfo.Seal value) {
            this.seal = value;
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
         *       &lt;attribute name="ProviderName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Provider {

            @XmlAttribute(name = "ProviderName", required = true)
            protected String providerName;
            @XmlAttribute(name = "Version")
            protected String version;
            @XmlAttribute(name = "Company")
            protected String company;

            /**
             * 获取providerName属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProviderName() {
                return providerName;
            }

            /**
             * 设置providerName属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProviderName(String value) {
                this.providerName = value;
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
                return version;
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
         *         &lt;element name="Reference" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CheckMethod" default="MD5">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="MD5"/>
         *             &lt;enumeration value="SHA1"/>
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
            "reference"
        })
        public static class References {

            @XmlElement(name = "Reference", required = true)
            protected List<Signature.SignedInfo.References.Reference> reference;
            @XmlAttribute(name = "CheckMethod")
            protected String checkMethod;

            /**
             * Gets the value of the reference property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reference property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReference().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Signature.SignedInfo.References.Reference }
             *
             *
             */
            public List<Signature.SignedInfo.References.Reference> getReference() {
                if (reference == null) {
                    reference = new ArrayList<Signature.SignedInfo.References.Reference>();
                }
                return this.reference;
            }

            /**
             * 获取checkMethod属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCheckMethod() {
                if (checkMethod == null) {
                    return "MD5";
                } else {
                    return checkMethod;
                }
            }

            /**
             * 设置checkMethod属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCheckMethod(String value) {
                this.checkMethod = value;
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
             *         &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
             *       &lt;/sequence>
             *       &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "checkValue"
            })
            public static class Reference {

                @XmlElement(name = "CheckValue", required = true)
                protected byte[] checkValue;
                @XmlAttribute(name = "FileRef", required = true)
                protected String fileRef;

                /**
                 * 获取checkValue属性的值。
                 *
                 * @return
                 *     possible object is
                 *     byte[]
                 */
                public byte[] getCheckValue() {
                    return checkValue;
                }

                /**
                 * 设置checkValue属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     byte[]
                 */
                public void setCheckValue(byte[] value) {
                    this.checkValue = value;
                }

                /**
                 * 获取fileRef属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFileRef() {
                    return fileRef;
                }

                /**
                 * 设置fileRef属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFileRef(String value) {
                    this.fileRef = value;
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
         *         &lt;element name="BaseLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/>
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
            "baseLoc"
        })
        public static class Seal {

            @XmlElement(name = "BaseLoc", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String baseLoc;

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
         *       &lt;attribute name="PageRef" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
         *       &lt;attribute name="Boundary" use="required" type="{http://www.ofdspec.org/2016}ST_Box" />
         *       &lt;attribute name="Clip" type="{http://www.ofdspec.org/2016}ST_Box" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StampAnnot {

            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "PageRef", required = true)
            protected long pageRef;
            @XmlAttribute(name = "Boundary", required = true)
            protected String boundary;
            @XmlAttribute(name = "Clip")
            protected String clip;

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
             * 获取pageRef属性的值。
             *
             */
            public long getPageRef() {
                return pageRef;
            }

            /**
             * 设置pageRef属性的值。
             *
             */
            public void setPageRef(long value) {
                this.pageRef = value;
            }

            /**
             * 获取boundary属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBoundary() {
                return boundary;
            }

            /**
             * 设置boundary属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBoundary(String value) {
                this.boundary = value;
            }

            /**
             * 获取clip属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getClip() {
                return clip;
            }

            /**
             * 设置clip属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setClip(String value) {
                this.clip = value;
            }

        }

    }

}

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

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
 *         &lt;element name="SignedInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Provider"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="ProviderName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SignatureMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SignatureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="References"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Reference" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="CheckMethod" default="MD5"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="MD5"/&gt;
 *                                 &lt;enumeration value="SHA1"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="StampAnnot" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                             &lt;attribute name="PageRef" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *                             &lt;attribute name="Boundary" use="required" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
 *                             &lt;attribute name="Clip" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Seal" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="BaseLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SignedValue" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
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
    "signedInfo",
    "signedValue"
})
@XmlRootElement(name = "Signature")
public class Signature {

    protected Signature.SignedInfo signedInfo;
    protected String signedValue;

    /**
     * 获取signedInfo属性的值。
     *
     * @return
     *     possible object is
     *     {@link Signature.SignedInfo }
     *
     */
    @XmlElement(name = "SignedInfo", required = true)
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
    @XmlElement(name = "SignedValue", required = true)
    @XmlSchemaType(name = "anyURI")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Provider"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ProviderName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SignatureMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SignatureDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="References"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Reference" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="CheckMethod" default="MD5"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="MD5"/&gt;
     *                       &lt;enumeration value="SHA1"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="StampAnnot" maxOccurs="unbounded" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *                   &lt;attribute name="PageRef" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
     *                   &lt;attribute name="Boundary" use="required" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
     *                   &lt;attribute name="Clip" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="Seal" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="BaseLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
        "provider",
        "signatureMethod",
        "signatureDateTime",
        "references",
        "stampAnnot",
        "seal"
    })
    public static class SignedInfo {

        protected Signature.SignedInfo.Provider provider;
        protected String signatureMethod;
        protected String signatureDateTime;
        protected Signature.SignedInfo.References references;
        protected List<Signature.SignedInfo.StampAnnot> stampAnnot;
        protected Signature.SignedInfo.Seal seal;

        /**
         * 获取provider属性的值。
         *
         * @return
         *     possible object is
         *     {@link Signature.SignedInfo.Provider }
         *
         */
        @XmlElement(name = "Provider", required = true)
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
        @XmlElement(name = "SignatureMethod")
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
        @XmlElement(name = "SignatureDateTime")
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
        @XmlElement(name = "References", required = true)
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
        @XmlElement(name = "StampAnnot", type = Signature.SignedInfo.StampAnnot.class)
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
        @XmlElement(name = "Seal")
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
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="ProviderName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Company" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class Provider {

            protected String providerName;
            protected String version;
            protected String company;

            /**
             * 获取providerName属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "ProviderName", required = true)
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
            @XmlAttribute(name = "Version")
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
         *         &lt;element name="Reference" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CheckMethod" default="MD5"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="MD5"/&gt;
         *             &lt;enumeration value="SHA1"/&gt;
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
            "reference"
        })
        public static class References {

            protected List<Signature.SignedInfo.References.Reference> reference;
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
            @XmlElement(name = "Reference", required = true, type = Signature.SignedInfo.References.Reference.class)
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
            @XmlAttribute(name = "CheckMethod")
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
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="CheckValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="FileRef" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.PROPERTY)
            @XmlType(name = "", propOrder = {
                "checkValue"
            })
            public static class Reference {

                protected byte[] checkValue;
                protected String fileRef;

                /**
                 * 获取checkValue属性的值。
                 *
                 * @return
                 *     possible object is
                 *     byte[]
                 */
                @XmlElement(name = "CheckValue", required = true)
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
                @XmlAttribute(name = "FileRef", required = true)
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
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BaseLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
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
            "baseLoc"
        })
        public static class Seal {

            protected String baseLoc;

            /**
             * 获取baseLoc属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlElement(name = "BaseLoc", required = true)
            @XmlSchemaType(name = "anyURI")
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
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *       &lt;attribute name="PageRef" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
         *       &lt;attribute name="Boundary" use="required" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
         *       &lt;attribute name="Clip" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class StampAnnot {

            protected String id;
            protected long pageRef;
            protected String boundary;
            protected String clip;

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
             * 获取pageRef属性的值。
             *
             */
            @XmlAttribute(name = "PageRef", required = true)
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
            @XmlAttribute(name = "Boundary", required = true)
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
            @XmlAttribute(name = "Clip")
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

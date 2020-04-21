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
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annot" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Parameters" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Parameter" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Appearance"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
 *                           &lt;attribute name="Boundary" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
 *                 &lt;attribute name="Type" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Link"/&gt;
 *                       &lt;enumeration value="Path"/&gt;
 *                       &lt;enumeration value="Highlight"/&gt;
 *                       &lt;enumeration value="Stamp"/&gt;
 *                       &lt;enumeration value="Watermark"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Creator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LastModDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *                 &lt;attribute name="Subtype" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Print" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *                 &lt;attribute name="NoZoom" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                 &lt;attribute name="NoRotate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *                 &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
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
    "annot"
})
@XmlRootElement(name = "PageAnnot")
public class PageAnnot {

    protected List<PageAnnot.Annot> annot;

    /**
     * Gets the value of the annot property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annot property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnot().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageAnnot.Annot }
     *
     *
     */
    @XmlElement(name = "Annot", required = true, type = PageAnnot.Annot.class)
    public List<PageAnnot.Annot> getAnnot() {
        if (annot == null) {
            annot = new ArrayList<PageAnnot.Annot>();
        }
        return this.annot;
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
     *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Parameters" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Parameter" maxOccurs="unbounded"&gt;
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
     *         &lt;element name="Appearance"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
     *                 &lt;attribute name="Boundary" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
     *       &lt;attribute name="Type" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Link"/&gt;
     *             &lt;enumeration value="Path"/&gt;
     *             &lt;enumeration value="Highlight"/&gt;
     *             &lt;enumeration value="Stamp"/&gt;
     *             &lt;enumeration value="Watermark"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Creator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LastModDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *       &lt;attribute name="Subtype" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Print" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *       &lt;attribute name="NoZoom" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *       &lt;attribute name="NoRotate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
     *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "remark",
        "parameters",
        "appearance"
    })
    public static class Annot {

        protected String remark;
        protected PageAnnot.Annot.Parameters parameters;
        protected PageAnnot.Annot.Appearance appearance;
        protected long id;
        protected String type;
        protected String creator;
        protected XMLGregorianCalendar lastModDate;
        protected Boolean visible;
        protected String subtype;
        protected Boolean print;
        protected Boolean noZoom;
        protected Boolean noRotate;
        protected Boolean readOnly;

        /**
         * 获取remark属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlElement(name = "Remark")
        public String getRemark() {
            return remark;
        }

        /**
         * 设置remark属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRemark(String value) {
            this.remark = value;
        }

        /**
         * 获取parameters属性的值。
         *
         * @return
         *     possible object is
         *     {@link PageAnnot.Annot.Parameters }
         *
         */
        @XmlElement(name = "Parameters")
        public PageAnnot.Annot.Parameters getParameters() {
            return parameters;
        }

        /**
         * 设置parameters属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link PageAnnot.Annot.Parameters }
         *
         */
        public void setParameters(PageAnnot.Annot.Parameters value) {
            this.parameters = value;
        }

        /**
         * 获取appearance属性的值。
         *
         * @return
         *     possible object is
         *     {@link PageAnnot.Annot.Appearance }
         *
         */
        @XmlElement(name = "Appearance", required = true)
        public PageAnnot.Annot.Appearance getAppearance() {
            return appearance;
        }

        /**
         * 设置appearance属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link PageAnnot.Annot.Appearance }
         *
         */
        public void setAppearance(PageAnnot.Annot.Appearance value) {
            this.appearance = value;
        }

        /**
         * 获取id属性的值。
         *
         */
        @XmlAttribute(name = "ID", required = true)
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
         * 获取type属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "Type", required = true)
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取creator属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "Creator", required = true)
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
         * 获取lastModDate属性的值。
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        @XmlAttribute(name = "LastModDate", required = true)
        @XmlSchemaType(name = "date")
        public XMLGregorianCalendar getLastModDate() {
            return lastModDate;
        }

        /**
         * 设置lastModDate属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setLastModDate(XMLGregorianCalendar value) {
            this.lastModDate = value;
        }

        /**
         * 获取visible属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @XmlAttribute(name = "Visible")
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
         * 获取subtype属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "Subtype")
        public String getSubtype() {
            return subtype;
        }

        /**
         * 设置subtype属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSubtype(String value) {
            this.subtype = value;
        }

        /**
         * 获取print属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @XmlAttribute(name = "Print")
        public boolean isPrint() {
            if (print == null) {
                return true;
            } else {
                return print;
            }
        }

        /**
         * 设置print属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPrint(Boolean value) {
            this.print = value;
        }

        /**
         * 获取noZoom属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @XmlAttribute(name = "NoZoom")
        public boolean isNoZoom() {
            if (noZoom == null) {
                return false;
            } else {
                return noZoom;
            }
        }

        /**
         * 设置noZoom属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setNoZoom(Boolean value) {
            this.noZoom = value;
        }

        /**
         * 获取noRotate属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @XmlAttribute(name = "NoRotate")
        public boolean isNoRotate() {
            if (noRotate == null) {
                return false;
            } else {
                return noRotate;
            }
        }

        /**
         * 设置noRotate属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setNoRotate(Boolean value) {
            this.noRotate = value;
        }

        /**
         * 获取readOnly属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        @XmlAttribute(name = "ReadOnly")
        public boolean isReadOnly() {
            if (readOnly == null) {
                return true;
            } else {
                return readOnly;
            }
        }

        /**
         * 设置readOnly属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setReadOnly(Boolean value) {
            this.readOnly = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
         *       &lt;attribute name="Boundary" type="{http://www.ofdspec.org/2016}ST_Box" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class Appearance
            extends CTPageBlock
        {

            protected String boundary;

            /**
             * 获取boundary属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Boundary")
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
         *         &lt;element name="Parameter" maxOccurs="unbounded"&gt;
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
            "parameter"
        })
        public static class Parameters {

            protected List<PageAnnot.Annot.Parameters.Parameter> parameter;

            /**
             * Gets the value of the parameter property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameter property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameter().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PageAnnot.Annot.Parameters.Parameter }
             *
             *
             */
            @XmlElement(name = "Parameter", required = true, type = PageAnnot.Annot.Parameters.Parameter.class)
            public List<PageAnnot.Annot.Parameters.Parameter> getParameter() {
                if (parameter == null) {
                    parameter = new ArrayList<PageAnnot.Annot.Parameters.Parameter>();
                }
                return this.parameter;
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
            public static class Parameter {

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

    }

}

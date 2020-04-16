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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Annot" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Parameters" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Parameter" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Appearance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
 *                           &lt;attribute name="Boundary" type="{http://www.ofdspec.org/2016}ST_Box" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *                 &lt;attribute name="Type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Link"/>
 *                       &lt;enumeration value="Path"/>
 *                       &lt;enumeration value="Highlight"/>
 *                       &lt;enumeration value="Stamp"/>
 *                       &lt;enumeration value="Watermark"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Creator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LastModDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="Subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Print" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="NoZoom" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="NoRotate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
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
    "annot"
})
@XmlRootElement(name = "PageAnnot")
public class PageAnnot {

    @XmlElement(name = "Annot", required = true)
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Parameters" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Parameter" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Appearance">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
     *                 &lt;attribute name="Boundary" type="{http://www.ofdspec.org/2016}ST_Box" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
     *       &lt;attribute name="Type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Link"/>
     *             &lt;enumeration value="Path"/>
     *             &lt;enumeration value="Highlight"/>
     *             &lt;enumeration value="Stamp"/>
     *             &lt;enumeration value="Watermark"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Creator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LastModDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="Subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Print" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="NoZoom" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="NoRotate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remark",
        "parameters",
        "appearance"
    })
    public static class Annot {

        @XmlElement(name = "Remark")
        protected String remark;
        @XmlElement(name = "Parameters")
        protected PageAnnot.Annot.Parameters parameters;
        @XmlElement(name = "Appearance", required = true)
        protected PageAnnot.Annot.Appearance appearance;
        @XmlAttribute(name = "ID", required = true)
        protected long id;
        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "Creator", required = true)
        protected String creator;
        @XmlAttribute(name = "LastModDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lastModDate;
        @XmlAttribute(name = "Visible")
        protected Boolean visible;
        @XmlAttribute(name = "Subtype")
        protected String subtype;
        @XmlAttribute(name = "Print")
        protected Boolean print;
        @XmlAttribute(name = "NoZoom")
        protected Boolean noZoom;
        @XmlAttribute(name = "NoRotate")
        protected Boolean noRotate;
        @XmlAttribute(name = "ReadOnly")
        protected Boolean readOnly;

        /**
         * 获取remark属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
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
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
         *       &lt;attribute name="Boundary" type="{http://www.ofdspec.org/2016}ST_Box" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Appearance
            extends CTPageBlock
        {

            @XmlAttribute(name = "Boundary")
            protected String boundary;

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
         *         &lt;element name="Parameter" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "parameter"
        })
        public static class Parameters {

            @XmlElement(name = "Parameter", required = true)
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
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Parameter {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Name", required = true)
                protected String name;

                /**
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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

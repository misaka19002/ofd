//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

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
 *         &lt;element name="Template" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="TemplateID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *                 &lt;attribute name="ZOrder" default="Background">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Background"/>
 *                       &lt;enumeration value="Foreground"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PageRes" type="{http://www.ofdspec.org/2016}ST_Loc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.ofdspec.org/2016}CT_PageArea" minOccurs="0"/>
 *         &lt;element name="Content" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Layer" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_Layer">
 *                           &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "template",
    "pageRes",
    "area",
    "content",
    "actions"
})
@XmlRootElement(name = "Page")
public class Page {

    @XmlElement(name = "Template")
    protected List<Template> template;
    @XmlElement(name = "PageRes")
    @XmlSchemaType(name = "anyURI")
    protected List<String>   pageRes;
    @XmlElement(name = "Area")
    protected CTPageArea area;
    @XmlElement(name = "Content")
    protected Content content;
    @XmlElement(name = "Actions")
    protected Actions actions;

    /**
     * Gets the value of the template property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the template property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Template }
     *
     *
     */
    public List<Template> getTemplate() {
        if (template == null) {
            template = new ArrayList<Template>();
        }
        return this.template;
    }

    /**
     * Gets the value of the pageRes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageRes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageRes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getPageRes() {
        if (pageRes == null) {
            pageRes = new ArrayList<String>();
        }
        return this.pageRes;
    }

    /**
     * 获取area属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTPageArea }
     *
     */
    public CTPageArea getArea() {
        return area;
    }

    /**
     * 设置area属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTPageArea }
     *
     */
    public void setArea(CTPageArea value) {
        this.area = value;
    }

    /**
     * 获取content属性的值。
     *
     * @return
     *     possible object is
     *     {@link Content }
     *
     */
    public Content getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Content }
     *
     */
    public void setContent(Content value) {
        this.content = value;
    }

    /**
     * 获取actions属性的值。
     *
     * @return
     *     possible object is
     *     {@link Actions }
     *
     */
    public Actions getActions() {
        return actions;
    }

    /**
     * 设置actions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Actions }
     *
     */
    public void setActions(Actions value) {
        this.actions = value;
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
     *         &lt;element name="Layer" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Layer">
     *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
     *               &lt;/extension>
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
        "layer"
    })
    public static class Content {

        @XmlElement(name = "Layer", required = true)
        protected List<Layer> layer;

        /**
         * Gets the value of the layer property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the layer property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLayer().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Layer }
         *
         *
         */
        public List<Layer> getLayer() {
            if (layer == null) {
                layer = new ArrayList<Layer>();
            }
            return this.layer;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Layer">
         *       &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Layer
            extends CTLayer
        {

            @XmlAttribute(name = "ID", required = true)
            protected long id;

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
     *       &lt;attribute name="TemplateID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
     *       &lt;attribute name="ZOrder" default="Background">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Background"/>
     *             &lt;enumeration value="Foreground"/>
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
    @XmlType(name = "")
    public static class Template {

        @XmlAttribute(name = "TemplateID", required = true)
        protected long templateID;
        @XmlAttribute(name = "ZOrder")
        protected String zOrder;

        /**
         * 获取templateID属性的值。
         *
         */
        public long getTemplateID() {
            return templateID;
        }

        /**
         * 设置templateID属性的值。
         *
         */
        public void setTemplateID(long value) {
            this.templateID = value;
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
            if (zOrder == null) {
                return "Background";
            } else {
                return zOrder;
            }
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

    }

}

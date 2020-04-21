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
 *         &lt;element name="Template" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TemplateID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *                 &lt;attribute name="ZOrder" default="Background"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Background"/&gt;
 *                       &lt;enumeration value="Foreground"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PageRes" type="{http://www.ofdspec.org/2016}ST_Loc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.ofdspec.org/2016}CT_PageArea" minOccurs="0"/&gt;
 *         &lt;element name="Content" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Layer" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_Layer"&gt;
 *                           &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Actions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Action" type="{http://www.ofdspec.org/2016}CT_Action" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "", propOrder = {
    "template",
    "pageRes",
    "area",
    "content",
    "actions"
})
@XmlRootElement(name = "Page")
public class Page {

    protected List<Page.Template> template;
    protected List<String> pageRes;
    protected CTPageArea area;
    protected Page.Content content;
    protected Page.Actions actions;

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
     * {@link Page.Template }
     *
     *
     */
    @XmlElement(name = "Template", type = Page.Template.class)
    public List<Page.Template> getTemplate() {
        if (template == null) {
            template = new ArrayList<Page.Template>();
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
    @XmlElement(name = "PageRes", type = String.class)
    @XmlSchemaType(name = "anyURI")
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
    @XmlElement(name = "Area")
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
     *     {@link Page.Content }
     *
     */
    @XmlElement(name = "Content")
    public Page.Content getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Page.Content }
     *
     */
    public void setContent(Page.Content value) {
        this.content = value;
    }

    /**
     * 获取actions属性的值。
     *
     * @return
     *     possible object is
     *     {@link Page.Actions }
     *
     */
    @XmlElement(name = "Actions")
    public Page.Actions getActions() {
        return actions;
    }

    /**
     * 设置actions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Page.Actions }
     *
     */
    public void setActions(Page.Actions value) {
        this.actions = value;
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
     *         &lt;element name="Action" type="{http://www.ofdspec.org/2016}CT_Action" maxOccurs="unbounded"/&gt;
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
        "action"
    })
    public static class Actions {

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
        @XmlElement(name = "Action", required = true, type = CTAction.class)
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Layer" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Layer"&gt;
     *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
     *               &lt;/extension&gt;
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
        "layer"
    })
    public static class Content {

        protected List<Page.Content.Layer> layer;

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
         * {@link Page.Content.Layer }
         *
         *
         */
        @XmlElement(name = "Layer", required = true, type = Page.Content.Layer.class)
        public List<Page.Content.Layer> getLayer() {
            if (layer == null) {
                layer = new ArrayList<Page.Content.Layer>();
            }
            return this.layer;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Layer"&gt;
         *       &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class Layer
            extends CTLayer
        {

            protected long id;

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
     *       &lt;attribute name="TemplateID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
     *       &lt;attribute name="ZOrder" default="Background"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Background"/&gt;
     *             &lt;enumeration value="Foreground"/&gt;
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
    @XmlType(name = "")
    public static class Template {

        protected long templateID;
        protected String zOrder;

        /**
         * 获取templateID属性的值。
         *
         */
        @XmlAttribute(name = "TemplateID", required = true)
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
        @XmlAttribute(name = "ZOrder")
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

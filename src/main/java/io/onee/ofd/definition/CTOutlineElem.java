//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:53:53 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_OutlineElem complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_OutlineElem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *         &lt;element name="OutlineElem" type="{http://www.ofdspec.org/2016}CT_OutlineElem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Expanded" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_OutlineElem", propOrder = {
    "actions",
    "outlineElem"
})
public class CTOutlineElem {

    protected Actions actions;
    protected List<CTOutlineElem> outlineElem;
    protected String title;
    protected Integer count;
    protected Boolean expanded;

    /**
     * 获取actions属性的值。
     *
     * @return
     *     possible object is
     *     {@link Actions }
     *
     */
    @XmlElement(name = "Actions")
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
    @XmlElement(name = "OutlineElem", type = CTOutlineElem.class)
    public List<CTOutlineElem> getOutlineElem() {
        if (outlineElem == null) {
            outlineElem = new ArrayList<CTOutlineElem>();
        }
        return this.outlineElem;
    }

    /**
     * 获取title属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Title", required = true)
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
     * 获取count属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    @XmlAttribute(name = "Count")
    public Integer getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * 获取expanded属性的值。
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    @XmlAttribute(name = "Expanded")
    public boolean isExpanded() {
        if (expanded == null) {
            return true;
        } else {
            return expanded;
        }
    }

    /**
     * 设置expanded属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExpanded(Boolean value) {
        this.expanded = value;
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

}

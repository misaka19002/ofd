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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_PageBlock complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CT_PageBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="TextObject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Text">
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PathObject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Path">
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ImageObject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Image">
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompositeObject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Composite">
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PageBlock">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PageBlock", propOrder = {
    "textObjectOrPathObjectOrImageObject"
})
@XmlSeeAlso({
    io.onee.PageAnnot.Annot.Appearance.class,
    CTLayer.class,
    CTPageBlock.PageBlock.class,
    io.onee.CTPattern.CellContent.class
})
public class CTPageBlock {

    @XmlElements({
        @XmlElement(name = "TextObject", type = CTPageBlock.TextObject.class),
        @XmlElement(name = "PathObject", type = CTPageBlock.PathObject.class),
        @XmlElement(name = "ImageObject", type = CTPageBlock.ImageObject.class),
        @XmlElement(name = "CompositeObject", type = CTPageBlock.CompositeObject.class),
        @XmlElement(name = "PageBlock", type = CTPageBlock.PageBlock.class)
    })
    protected List<Object> textObjectOrPathObjectOrImageObject;

    /**
     * Gets the value of the textObjectOrPathObjectOrImageObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textObjectOrPathObjectOrImageObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextObjectOrPathObjectOrImageObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPageBlock.TextObject }
     * {@link CTPageBlock.PathObject }
     * {@link CTPageBlock.ImageObject }
     * {@link CTPageBlock.CompositeObject }
     * {@link CTPageBlock.PageBlock }
     * 
     * 
     */
    public List<Object> getTextObjectOrPathObjectOrImageObject() {
        if (textObjectOrPathObjectOrImageObject == null) {
            textObjectOrPathObjectOrImageObject = new ArrayList<Object>();
        }
        return this.textObjectOrPathObjectOrImageObject;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Composite">
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
    public static class CompositeObject
        extends CTComposite
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Image">
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
    public static class ImageObject
        extends CTImage
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
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
    public static class PageBlock
        extends CTPageBlock
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Path">
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
    public static class PathObject
        extends CTPath
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Text">
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
    public static class TextObject
        extends CTText
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

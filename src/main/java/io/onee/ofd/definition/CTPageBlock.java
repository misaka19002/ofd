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
 * <p>CT_PageBlock complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_PageBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="TextObject"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Text"&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PathObject"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Path"&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImageObject"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Image"&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompositeObject"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Composite"&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PageBlock"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.ofdspec.org/2016}ST_ID" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_PageBlock", propOrder = {
    "textObjectOrPathObjectOrImageObject"
})
@XmlSeeAlso({
    PageAnnot.Annot.Appearance.class,
    CTLayer.class,
    CTPageBlock.PageBlock.class,
    CTPattern.CellContent.class
})
public class CTPageBlock {

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
     * {@link TextObject }
     * {@link PathObject }
     * {@link ImageObject }
     * {@link CompositeObject }
     * {@link PageBlock }
     *
     *
     */
    @XmlElements({
        @XmlElement(name = "TextObject", type = TextObject.class),
        @XmlElement(name = "PathObject", type = PathObject.class),
        @XmlElement(name = "ImageObject", type = ImageObject.class),
        @XmlElement(name = "CompositeObject", type = CompositeObject.class),
        @XmlElement(name = "PageBlock", type = PageBlock.class)
    })
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Composite"&gt;
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
    public static class CompositeObject
        extends CTComposite
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


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Image"&gt;
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
    public static class ImageObject
        extends CTImage
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


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
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
    public static class PageBlock
        extends CTPageBlock
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


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Path"&gt;
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
    public static class PathObject
        extends CTPath
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


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Text"&gt;
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
    public static class TextObject
        extends CTText
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

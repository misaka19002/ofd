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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ColorSpaces">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ColorSpace" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_ColorSpace">
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
 *         &lt;element name="DrawParams">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DrawParam" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_DrawParam">
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
 *         &lt;element name="Fonts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Font" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_Font">
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
 *         &lt;element name="MultiMedias">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MultiMedia" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_MultiMedia">
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
 *         &lt;element name="CompositeGraphicUnits">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompositeGraphicUnit" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_VectorG">
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
 *       &lt;/choice>
 *       &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "colorSpacesOrDrawParamsOrFonts"
})
@XmlRootElement(name = "Res")
public class Res {

    @XmlElements({
        @XmlElement(name = "ColorSpaces", type = ColorSpaces.class),
        @XmlElement(name = "DrawParams", type = DrawParams.class),
        @XmlElement(name = "Fonts", type = Fonts.class),
        @XmlElement(name = "MultiMedias", type = MultiMedias.class),
        @XmlElement(name = "CompositeGraphicUnits", type = CompositeGraphicUnits.class)
    })
    protected List<Object> colorSpacesOrDrawParamsOrFonts;
    @XmlAttribute(name = "BaseLoc", required = true)
    protected String baseLoc;

    /**
     * Gets the value of the colorSpacesOrDrawParamsOrFonts property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorSpacesOrDrawParamsOrFonts property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorSpacesOrDrawParamsOrFonts().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorSpaces }
     * {@link DrawParams }
     * {@link Fonts }
     * {@link MultiMedias }
     * {@link CompositeGraphicUnits }
     *
     *
     */
    public List<Object> getColorSpacesOrDrawParamsOrFonts() {
        if (colorSpacesOrDrawParamsOrFonts == null) {
            colorSpacesOrDrawParamsOrFonts = new ArrayList<Object>();
        }
        return this.colorSpacesOrDrawParamsOrFonts;
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
     *         &lt;element name="ColorSpace" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_ColorSpace">
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
        "colorSpace"
    })
    public static class ColorSpaces {

        @XmlElement(name = "ColorSpace", required = true)
        protected List<ColorSpace> colorSpace;

        /**
         * Gets the value of the colorSpace property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the colorSpace property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColorSpace().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ColorSpace }
         *
         *
         */
        public List<ColorSpace> getColorSpace() {
            if (colorSpace == null) {
                colorSpace = new ArrayList<ColorSpace>();
            }
            return this.colorSpace;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_ColorSpace">
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
        public static class ColorSpace
            extends CTColorSpace
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
     *       &lt;sequence>
     *         &lt;element name="CompositeGraphicUnit" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_VectorG">
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
        "compositeGraphicUnit"
    })
    public static class CompositeGraphicUnits {

        @XmlElement(name = "CompositeGraphicUnit", required = true)
        protected List<CompositeGraphicUnit> compositeGraphicUnit;

        /**
         * Gets the value of the compositeGraphicUnit property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compositeGraphicUnit property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompositeGraphicUnit().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompositeGraphicUnit }
         *
         *
         */
        public List<CompositeGraphicUnit> getCompositeGraphicUnit() {
            if (compositeGraphicUnit == null) {
                compositeGraphicUnit = new ArrayList<CompositeGraphicUnit>();
            }
            return this.compositeGraphicUnit;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_VectorG">
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
        public static class CompositeGraphicUnit
            extends CTVectorG
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
     *       &lt;sequence>
     *         &lt;element name="DrawParam" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_DrawParam">
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
        "drawParam"
    })
    public static class DrawParams {

        @XmlElement(name = "DrawParam", required = true)
        protected List<DrawParam> drawParam;

        /**
         * Gets the value of the drawParam property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drawParam property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrawParam().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DrawParam }
         *
         *
         */
        public List<DrawParam> getDrawParam() {
            if (drawParam == null) {
                drawParam = new ArrayList<DrawParam>();
            }
            return this.drawParam;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_DrawParam">
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
        public static class DrawParam
            extends CTDrawParam
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
     *       &lt;sequence>
     *         &lt;element name="Font" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Font">
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
        "font"
    })
    public static class Fonts {

        @XmlElement(name = "Font", required = true)
        protected List<Font> font;

        /**
         * Gets the value of the font property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the font property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFont().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Font }
         *
         *
         */
        public List<Font> getFont() {
            if (font == null) {
                font = new ArrayList<Font>();
            }
            return this.font;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Font">
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
        public static class Font
            extends CTFont
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
     *       &lt;sequence>
     *         &lt;element name="MultiMedia" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_MultiMedia">
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
        "multiMedia"
    })
    public static class MultiMedias {

        @XmlElement(name = "MultiMedia", required = true)
        protected List<MultiMedia> multiMedia;

        /**
         * Gets the value of the multiMedia property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the multiMedia property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMultiMedia().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultiMedia }
         *
         *
         */
        public List<MultiMedia> getMultiMedia() {
            if (multiMedia == null) {
                multiMedia = new ArrayList<MultiMedia>();
            }
            return this.multiMedia;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_MultiMedia">
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
        public static class MultiMedia
            extends CTMultiMedia
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

}

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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="ColorSpaces"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ColorSpace" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_ColorSpace"&gt;
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
 *         &lt;element name="DrawParams"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DrawParam" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_DrawParam"&gt;
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
 *         &lt;element name="Fonts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Font" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_Font"&gt;
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
 *         &lt;element name="MultiMedias"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MultiMedia" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_MultiMedia"&gt;
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
 *         &lt;element name="CompositeGraphicUnits"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CompositeGraphicUnit" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.ofdspec.org/2016}CT_VectorG"&gt;
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
 *       &lt;/choice&gt;
 *       &lt;attribute name="BaseLoc" use="required" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "", propOrder = {
    "colorSpacesOrDrawParamsOrFonts"
})
@XmlRootElement(name = "Res")
public class Res {

    protected List<Object> colorSpacesOrDrawParamsOrFonts;
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
     * {@link Res.ColorSpaces }
     * {@link Res.DrawParams }
     * {@link Res.Fonts }
     * {@link Res.MultiMedias }
     * {@link Res.CompositeGraphicUnits }
     *
     *
     */
    @XmlElements({
        @XmlElement(name = "ColorSpaces", type = Res.ColorSpaces.class),
        @XmlElement(name = "DrawParams", type = Res.DrawParams.class),
        @XmlElement(name = "Fonts", type = Res.Fonts.class),
        @XmlElement(name = "MultiMedias", type = Res.MultiMedias.class),
        @XmlElement(name = "CompositeGraphicUnits", type = Res.CompositeGraphicUnits.class)
    })
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
    @XmlAttribute(name = "BaseLoc", required = true)
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ColorSpace" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_ColorSpace"&gt;
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
        "colorSpace"
    })
    public static class ColorSpaces {

        protected List<Res.ColorSpaces.ColorSpace> colorSpace;

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
         * {@link Res.ColorSpaces.ColorSpace }
         *
         *
         */
        @XmlElement(name = "ColorSpace", required = true, type = Res.ColorSpaces.ColorSpace.class)
        public List<Res.ColorSpaces.ColorSpace> getColorSpace() {
            if (colorSpace == null) {
                colorSpace = new ArrayList<Res.ColorSpaces.ColorSpace>();
            }
            return this.colorSpace;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_ColorSpace"&gt;
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
        public static class ColorSpace
            extends CTColorSpace
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
     *       &lt;sequence&gt;
     *         &lt;element name="CompositeGraphicUnit" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_VectorG"&gt;
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
        "compositeGraphicUnit"
    })
    public static class CompositeGraphicUnits {

        protected List<Res.CompositeGraphicUnits.CompositeGraphicUnit> compositeGraphicUnit;

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
         * {@link Res.CompositeGraphicUnits.CompositeGraphicUnit }
         *
         *
         */
        @XmlElement(name = "CompositeGraphicUnit", required = true, type = Res.CompositeGraphicUnits.CompositeGraphicUnit.class)
        public List<Res.CompositeGraphicUnits.CompositeGraphicUnit> getCompositeGraphicUnit() {
            if (compositeGraphicUnit == null) {
                compositeGraphicUnit = new ArrayList<Res.CompositeGraphicUnits.CompositeGraphicUnit>();
            }
            return this.compositeGraphicUnit;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_VectorG"&gt;
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
        public static class CompositeGraphicUnit
            extends CTVectorG
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
     *       &lt;sequence&gt;
     *         &lt;element name="DrawParam" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_DrawParam"&gt;
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
        "drawParam"
    })
    public static class DrawParams {

        protected List<Res.DrawParams.DrawParam> drawParam;

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
         * {@link Res.DrawParams.DrawParam }
         *
         *
         */
        @XmlElement(name = "DrawParam", required = true, type = Res.DrawParams.DrawParam.class)
        public List<Res.DrawParams.DrawParam> getDrawParam() {
            if (drawParam == null) {
                drawParam = new ArrayList<Res.DrawParams.DrawParam>();
            }
            return this.drawParam;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_DrawParam"&gt;
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
        public static class DrawParam
            extends CTDrawParam
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
     *       &lt;sequence&gt;
     *         &lt;element name="Font" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_Font"&gt;
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
        "font"
    })
    public static class Fonts {

        protected List<Res.Fonts.Font> font;

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
         * {@link Res.Fonts.Font }
         *
         *
         */
        @XmlElement(name = "Font", required = true, type = Res.Fonts.Font.class)
        public List<Res.Fonts.Font> getFont() {
            if (font == null) {
                font = new ArrayList<Res.Fonts.Font>();
            }
            return this.font;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_Font"&gt;
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
        public static class Font
            extends CTFont
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
     *       &lt;sequence&gt;
     *         &lt;element name="MultiMedia" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.ofdspec.org/2016}CT_MultiMedia"&gt;
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
        "multiMedia"
    })
    public static class MultiMedias {

        protected List<Res.MultiMedias.MultiMedia> multiMedia;

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
         * {@link Res.MultiMedias.MultiMedia }
         *
         *
         */
        @XmlElement(name = "MultiMedia", required = true, type = Res.MultiMedias.MultiMedia.class)
        public List<Res.MultiMedias.MultiMedia> getMultiMedia() {
            if (multiMedia == null) {
                multiMedia = new ArrayList<Res.MultiMedias.MultiMedia>();
            }
            return this.multiMedia;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.ofdspec.org/2016}CT_MultiMedia"&gt;
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
        public static class MultiMedia
            extends CTMultiMedia
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

}

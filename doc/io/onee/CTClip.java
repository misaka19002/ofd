//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>CT_Clip complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Clip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Path" type="{http://www.ofdspec.org/2016}CT_Path"/>
 *                   &lt;element name="Text" type="{http://www.ofdspec.org/2016}CT_Text"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="DrawParam" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *                 &lt;attribute name="CTM" type="{http://www.ofdspec.org/2016}ST_Array" />
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
@XmlType(name = "CT_Clip", propOrder = {
    "area"
})
public class CTClip {

    @XmlElement(name = "Area", required = true)
    protected List<CTClip.Area> area;

    /**
     * Gets the value of the area property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTClip.Area }
     *
     *
     */
    public List<CTClip.Area> getArea() {
        if (area == null) {
            area = new ArrayList<CTClip.Area>();
        }
        return this.area;
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
     *       &lt;choice>
     *         &lt;element name="Path" type="{http://www.ofdspec.org/2016}CT_Path"/>
     *         &lt;element name="Text" type="{http://www.ofdspec.org/2016}CT_Text"/>
     *       &lt;/choice>
     *       &lt;attribute name="DrawParam" type="{http://www.ofdspec.org/2016}ST_RefID" />
     *       &lt;attribute name="CTM" type="{http://www.ofdspec.org/2016}ST_Array" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "path",
        "text"
    })
    public static class Area {

        @XmlElement(name = "Path")
        protected CTPath path;
        @XmlElement(name = "Text")
        protected CTText text;
        @XmlAttribute(name = "DrawParam")
        protected Long drawParam;
        @XmlAttribute(name = "CTM")
        protected String ctm;

        /**
         * 获取path属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTPath }
         *
         */
        public CTPath getPath() {
            return path;
        }

        /**
         * 设置path属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link CTPath }
         *
         */
        public void setPath(CTPath value) {
            this.path = value;
        }

        /**
         * 获取text属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTText }
         *
         */
        public CTText getText() {
            return text;
        }

        /**
         * 设置text属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link CTText }
         *
         */
        public void setText(CTText value) {
            this.text = value;
        }

        /**
         * 获取drawParam属性的值。
         *
         * @return
         *     possible object is
         *     {@link Long }
         *
         */
        public Long getDrawParam() {
            return drawParam;
        }

        /**
         * 设置drawParam属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Long }
         *
         */
        public void setDrawParam(Long value) {
            this.drawParam = value;
        }

        /**
         * 获取ctm属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCTM() {
            return ctm;
        }

        /**
         * 设置ctm属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCTM(String value) {
            this.ctm = value;
        }

    }

}

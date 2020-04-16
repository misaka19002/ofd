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
 * <p>CT_ColorSpace complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_ColorSpace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Palette" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CV" type="{http://www.ofdspec.org/2016}ST_Array" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="GRAY"/>
 *             &lt;enumeration value="RGB"/>
 *             &lt;enumeration value="CMYK"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BitsPerComponent" type="{http://www.w3.org/2001/XMLSchema}int" default="8" />
 *       &lt;attribute name="Profile" type="{http://www.ofdspec.org/2016}ST_Loc" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ColorSpace", propOrder = {
    "palette"
})
@XmlSeeAlso({
    io.onee.Res.ColorSpaces.ColorSpace.class
})
public class CTColorSpace {

    @XmlElement(name = "Palette")
    protected CTColorSpace.Palette palette;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "BitsPerComponent")
    protected Integer bitsPerComponent;
    @XmlAttribute(name = "Profile")
    protected String profile;

    /**
     * 获取palette属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTColorSpace.Palette }
     *
     */
    public CTColorSpace.Palette getPalette() {
        return palette;
    }

    /**
     * 设置palette属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTColorSpace.Palette }
     *
     */
    public void setPalette(CTColorSpace.Palette value) {
        this.palette = value;
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
     * 获取bitsPerComponent属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getBitsPerComponent() {
        if (bitsPerComponent == null) {
            return  8;
        } else {
            return bitsPerComponent;
        }
    }

    /**
     * 设置bitsPerComponent属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setBitsPerComponent(Integer value) {
        this.bitsPerComponent = value;
    }

    /**
     * 获取profile属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfile() {
        return profile;
    }

    /**
     * 设置profile属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfile(String value) {
        this.profile = value;
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
     *         &lt;element name="CV" type="{http://www.ofdspec.org/2016}ST_Array" maxOccurs="unbounded"/>
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
        "cv"
    })
    public static class Palette {

        @XmlElement(name = "CV", required = true)
        protected List<String> cv;

        /**
         * Gets the value of the cv property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cv property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCV().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         *
         *
         */
        public List<String> getCV() {
            if (cv == null) {
                cv = new ArrayList<String>();
            }
            return this.cv;
        }

    }

}

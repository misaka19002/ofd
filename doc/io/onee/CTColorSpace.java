//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
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
 * &lt;complexType name="CT_ColorSpace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Palette" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CV" type="{http://www.ofdspec.org/2016}ST_Array" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="GRAY"/&gt;
 *             &lt;enumeration value="RGB"/&gt;
 *             &lt;enumeration value="CMYK"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="BitsPerComponent" type="{http://www.w3.org/2001/XMLSchema}int" default="8" /&gt;
 *       &lt;attribute name="Profile" type="{http://www.ofdspec.org/2016}ST_Loc" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_ColorSpace", propOrder = {
    "palette"
})
@XmlSeeAlso({
    io.onee.Res.ColorSpaces.ColorSpace.class
})
public class CTColorSpace {

    protected CTColorSpace.Palette palette;
    protected String type;
    protected Integer bitsPerComponent;
    protected String profile;

    /**
     * 获取palette属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTColorSpace.Palette }
     *
     */
    @XmlElement(name = "Palette")
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
    @XmlAttribute(name = "Type", required = true)
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
    @XmlAttribute(name = "BitsPerComponent")
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
    @XmlAttribute(name = "Profile")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CV" type="{http://www.ofdspec.org/2016}ST_Array" maxOccurs="unbounded"/&gt;
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
        "cv"
    })
    public static class Palette {

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
        @XmlElement(name = "CV", required = true, type = String.class)
        public List<String> getCV() {
            if (cv == null) {
                cv = new ArrayList<String>();
            }
            return this.cv;
        }

    }

}

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Bookmark complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Bookmark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dest" type="{http://www.ofdspec.org/2016}CT_Dest"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Bookmark", propOrder = {
    "dest"
})
public class CTBookmark {

    @XmlElement(name = "Dest", required = true)
    protected CTDest dest;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * 获取dest属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTDest }
     *
     */
    public CTDest getDest() {
        return dest;
    }

    /**
     * 设置dest属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CTDest }
     *
     */
    public void setDest(CTDest value) {
        this.dest = value;
    }

    /**
     * 获取name属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

}

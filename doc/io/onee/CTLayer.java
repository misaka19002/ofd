//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Layer complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Layer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock">
 *       &lt;attribute name="Type" default="Body">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Body"/>
 *             &lt;enumeration value="Background"/>
 *             &lt;enumeration value="Foreground"/>
 *             &lt;enumeration value="Custom"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DrawParam" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Layer")
@XmlSeeAlso({
    io.onee.Page.Content.Layer.class
})
public class CTLayer
    extends CTPageBlock
{

    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DrawParam")
    protected Long drawParam;

    /**
     * 获取type属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        if (type == null) {
            return "Body";
        } else {
            return type;
        }
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

}

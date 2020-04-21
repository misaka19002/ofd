//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

/**
 * <p>CT_Layer complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Layer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_PageBlock"&gt;
 *       &lt;attribute name="Type" default="Body"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Body"/&gt;
 *             &lt;enumeration value="Background"/&gt;
 *             &lt;enumeration value="Foreground"/&gt;
 *             &lt;enumeration value="Custom"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DrawParam" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Layer")
@XmlSeeAlso({
    io.onee.Page.Content.Layer.class
})
public class CTLayer
    extends CTPageBlock
{

    protected String type;
    protected Long drawParam;

    /**
     * 获取type属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Type")
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
    @XmlAttribute(name = "DrawParam")
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

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

/**
 * <p>CT_Composite complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Composite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit"&gt;
 *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Composite")
@XmlSeeAlso({
    io.onee.CTPageBlock.CompositeObject.class
})
public class CTComposite
    extends CTGraphicUnit
{

    protected long resourceID;

    /**
     * 获取resourceID属性的值。
     *
     */
    @XmlAttribute(name = "ResourceID", required = true)
    public long getResourceID() {
        return resourceID;
    }

    /**
     * 设置resourceID属性的值。
     *
     */
    public void setResourceID(long value) {
        this.resourceID = value;
    }

}

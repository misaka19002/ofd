//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.*;


/**
 * <p>CT_Composite complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Composite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ofdspec.org/2016}CT_GraphicUnit">
 *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Composite")
@XmlSeeAlso({
    CTPageBlock.CompositeObject.class
})
public class CTComposite
    extends CTGraphicUnit
{

    @XmlAttribute(name = "ResourceID", required = true)
    protected long resourceID;

    /**
     * 获取resourceID属性的值。
     *
     */
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

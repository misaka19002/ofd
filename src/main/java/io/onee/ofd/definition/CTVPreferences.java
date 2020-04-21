//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:53:53 PM CST 
//


package io.onee.ofd.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_VPreferences complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CT_VPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PageMode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="None"/&gt;
 *               &lt;enumeration value="FullScreen"/&gt;
 *               &lt;enumeration value="UseOutlines"/&gt;
 *               &lt;enumeration value="UseThumbs"/&gt;
 *               &lt;enumeration value="UseCustomTags"/&gt;
 *               &lt;enumeration value="UseLayers"/&gt;
 *               &lt;enumeration value="UseAttatchs"/&gt;
 *               &lt;enumeration value="UseBookmarks"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PageLayout" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OnePage"/&gt;
 *               &lt;enumeration value="OneColumn"/&gt;
 *               &lt;enumeration value="TwoPageL"/&gt;
 *               &lt;enumeration value="TwoColumnL"/&gt;
 *               &lt;enumeration value="TwoPageR"/&gt;
 *               &lt;enumeration value="TwoColumnR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TabDisplay" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="DocTitle"/&gt;
 *               &lt;enumeration value="FileName"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HideToolbar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HideMenubar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HideWindowUI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ZoomMode"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;enumeration value="Default"/&gt;
 *                 &lt;enumeration value="FitHeight"/&gt;
 *                 &lt;enumeration value="FitWidth"/&gt;
 *                 &lt;enumeration value="FitRect"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Zoom" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_VPreferences", propOrder = {
    "pageMode",
    "pageLayout",
    "tabDisplay",
    "hideToolbar",
    "hideMenubar",
    "hideWindowUI",
    "zoomMode",
    "zoom"
})
public class CTVPreferences {

    protected String pageMode;
    protected String pageLayout;
    protected String tabDisplay;
    protected Boolean hideToolbar;
    protected Boolean hideMenubar;
    protected Boolean hideWindowUI;
    protected String zoomMode;
    protected Double zoom;

    /**
     * 获取pageMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name = "PageMode", defaultValue = "None")
    public String getPageMode() {
        return pageMode;
    }

    /**
     * 设置pageMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMode(String value) {
        this.pageMode = value;
    }

    /**
     * 获取pageLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name = "PageLayout", defaultValue = "OneColumn")
    public String getPageLayout() {
        return pageLayout;
    }

    /**
     * 设置pageLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLayout(String value) {
        this.pageLayout = value;
    }

    /**
     * 获取tabDisplay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name = "TabDisplay", defaultValue = "DocTitle")
    public String getTabDisplay() {
        return tabDisplay;
    }

    /**
     * 设置tabDisplay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabDisplay(String value) {
        this.tabDisplay = value;
    }

    /**
     * 获取hideToolbar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @XmlElement(name = "HideToolbar", defaultValue = "false")
    public Boolean isHideToolbar() {
        return hideToolbar;
    }

    /**
     * 设置hideToolbar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideToolbar(Boolean value) {
        this.hideToolbar = value;
    }

    /**
     * 获取hideMenubar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @XmlElement(name = "HideMenubar", defaultValue = "false")
    public Boolean isHideMenubar() {
        return hideMenubar;
    }

    /**
     * 设置hideMenubar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideMenubar(Boolean value) {
        this.hideMenubar = value;
    }

    /**
     * 获取hideWindowUI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @XmlElement(name = "HideWindowUI", defaultValue = "false")
    public Boolean isHideWindowUI() {
        return hideWindowUI;
    }

    /**
     * 设置hideWindowUI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideWindowUI(Boolean value) {
        this.hideWindowUI = value;
    }

    /**
     * 获取zoomMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @XmlElement(name = "ZoomMode")
    public String getZoomMode() {
        return zoomMode;
    }

    /**
     * 设置zoomMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoomMode(String value) {
        this.zoomMode = value;
    }

    /**
     * 获取zoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @XmlElement(name = "Zoom")
    public Double getZoom() {
        return zoom;
    }

    /**
     * 设置zoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZoom(Double value) {
        this.zoom = value;
    }

}

//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST 
//


package io.onee;

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
 * &lt;complexType name="CT_VPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PageMode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="None"/>
 *               &lt;enumeration value="FullScreen"/>
 *               &lt;enumeration value="UseOutlines"/>
 *               &lt;enumeration value="UseThumbs"/>
 *               &lt;enumeration value="UseCustomTags"/>
 *               &lt;enumeration value="UseLayers"/>
 *               &lt;enumeration value="UseAttatchs"/>
 *               &lt;enumeration value="UseBookmarks"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PageLayout" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="OnePage"/>
 *               &lt;enumeration value="OneColumn"/>
 *               &lt;enumeration value="TwoPageL"/>
 *               &lt;enumeration value="TwoColumnL"/>
 *               &lt;enumeration value="TwoPageR"/>
 *               &lt;enumeration value="TwoColumnR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TabDisplay" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="DocTitle"/>
 *               &lt;enumeration value="FileName"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HideToolbar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideMenubar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideWindowUI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ZoomMode">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="Default"/>
 *                 &lt;enumeration value="FitHeight"/>
 *                 &lt;enumeration value="FitWidth"/>
 *                 &lt;enumeration value="FitRect"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Zoom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
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

    @XmlElement(name = "PageMode", defaultValue = "None")
    protected String pageMode;
    @XmlElement(name = "PageLayout", defaultValue = "OneColumn")
    protected String pageLayout;
    @XmlElement(name = "TabDisplay", defaultValue = "DocTitle")
    protected String tabDisplay;
    @XmlElement(name = "HideToolbar", defaultValue = "false")
    protected Boolean hideToolbar;
    @XmlElement(name = "HideMenubar", defaultValue = "false")
    protected Boolean hideMenubar;
    @XmlElement(name = "HideWindowUI", defaultValue = "false")
    protected Boolean hideWindowUI;
    @XmlElement(name = "ZoomMode")
    protected String zoomMode;
    @XmlElement(name = "Zoom")
    protected Double zoom;

    /**
     * 获取pageMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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

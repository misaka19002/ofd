//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.16 时间 04:51:38 PM CST 
//


package io.onee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CT_Action complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CT_Action">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Region" type="{http://www.ofdspec.org/2016}CT_Region" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Goto">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="Dest" type="{http://www.ofdspec.org/2016}CT_Dest"/>
 *                     &lt;element name="Bookmark">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="URI">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="URI" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="Base" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="GotoA">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="AttachID" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                   &lt;attribute name="NewWindow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Sound">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *                   &lt;attribute name="Volume" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                   &lt;attribute name="Repeat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="Synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Movie">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
 *                   &lt;attribute name="Operator" default="Play">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Play"/>
 *                         &lt;enumeration value="Stop"/>
 *                         &lt;enumeration value="Pause"/>
 *                         &lt;enumeration value="Resume"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Event" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="DO"/>
 *             &lt;enumeration value="PO"/>
 *             &lt;enumeration value="CLICK"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Action", propOrder = {
    "region",
    "_goto",
    "uri",
    "gotoA",
    "sound",
    "movie"
})
public class CTAction {

    @XmlElement(name = "Region")
    protected CTRegion region;
    @XmlElement(name = "Goto")
    protected CTAction.Goto _goto;
    @XmlElement(name = "URI")
    protected CTAction.URI uri;
    @XmlElement(name = "GotoA")
    protected CTAction.GotoA gotoA;
    @XmlElement(name = "Sound")
    protected CTAction.Sound sound;
    @XmlElement(name = "Movie")
    protected CTAction.Movie movie;
    @XmlAttribute(name = "Event", required = true)
    protected String event;

    /**
     * 获取region属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTRegion }
     *     
     */
    public CTRegion getRegion() {
        return region;
    }

    /**
     * 设置region属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTRegion }
     *     
     */
    public void setRegion(CTRegion value) {
        this.region = value;
    }

    /**
     * 获取goto属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTAction.Goto }
     *     
     */
    public CTAction.Goto getGoto() {
        return _goto;
    }

    /**
     * 设置goto属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTAction.Goto }
     *     
     */
    public void setGoto(CTAction.Goto value) {
        this._goto = value;
    }

    /**
     * 获取uri属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTAction.URI }
     *     
     */
    public CTAction.URI getURI() {
        return uri;
    }

    /**
     * 设置uri属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTAction.URI }
     *     
     */
    public void setURI(CTAction.URI value) {
        this.uri = value;
    }

    /**
     * 获取gotoA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTAction.GotoA }
     *     
     */
    public CTAction.GotoA getGotoA() {
        return gotoA;
    }

    /**
     * 设置gotoA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTAction.GotoA }
     *     
     */
    public void setGotoA(CTAction.GotoA value) {
        this.gotoA = value;
    }

    /**
     * 获取sound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTAction.Sound }
     *     
     */
    public CTAction.Sound getSound() {
        return sound;
    }

    /**
     * 设置sound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTAction.Sound }
     *     
     */
    public void setSound(CTAction.Sound value) {
        this.sound = value;
    }

    /**
     * 获取movie属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTAction.Movie }
     *     
     */
    public CTAction.Movie getMovie() {
        return movie;
    }

    /**
     * 设置movie属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTAction.Movie }
     *     
     */
    public void setMovie(CTAction.Movie value) {
        this.movie = value;
    }

    /**
     * 获取event属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * 设置event属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
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
     *         &lt;element name="Dest" type="{http://www.ofdspec.org/2016}CT_Dest"/>
     *         &lt;element name="Bookmark">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dest",
        "bookmark"
    })
    public static class Goto {

        @XmlElement(name = "Dest")
        protected CTDest dest;
        @XmlElement(name = "Bookmark")
        protected CTAction.Goto.Bookmark bookmark;

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
         * 获取bookmark属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CTAction.Goto.Bookmark }
         *     
         */
        public CTAction.Goto.Bookmark getBookmark() {
            return bookmark;
        }

        /**
         * 设置bookmark属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CTAction.Goto.Bookmark }
         *     
         */
        public void setBookmark(CTAction.Goto.Bookmark value) {
            this.bookmark = value;
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
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Bookmark {

            @XmlAttribute(name = "Name", required = true)
            protected String name;

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
     *       &lt;attribute name="AttachID" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="NewWindow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GotoA {

        @XmlAttribute(name = "AttachID", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object attachID;
        @XmlAttribute(name = "NewWindow")
        protected Boolean newWindow;

        /**
         * 获取attachID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAttachID() {
            return attachID;
        }

        /**
         * 设置attachID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAttachID(Object value) {
            this.attachID = value;
        }

        /**
         * 获取newWindow属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNewWindow() {
            if (newWindow == null) {
                return true;
            } else {
                return newWindow;
            }
        }

        /**
         * 设置newWindow属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNewWindow(Boolean value) {
            this.newWindow = value;
        }

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
     *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
     *       &lt;attribute name="Operator" default="Play">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Play"/>
     *             &lt;enumeration value="Stop"/>
     *             &lt;enumeration value="Pause"/>
     *             &lt;enumeration value="Resume"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Movie {

        @XmlAttribute(name = "ResourceID", required = true)
        protected long resourceID;
        @XmlAttribute(name = "Operator")
        protected String operator;

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

        /**
         * 获取operator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperator() {
            if (operator == null) {
                return "Play";
            } else {
                return operator;
            }
        }

        /**
         * 设置operator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperator(String value) {
            this.operator = value;
        }

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
     *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" />
     *       &lt;attribute name="Volume" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Repeat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Sound {

        @XmlAttribute(name = "ResourceID", required = true)
        protected long resourceID;
        @XmlAttribute(name = "Volume")
        protected Integer volume;
        @XmlAttribute(name = "Repeat")
        protected Boolean repeat;
        @XmlAttribute(name = "Synchronous")
        protected Boolean synchronous;

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

        /**
         * 获取volume属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getVolume() {
            return volume;
        }

        /**
         * 设置volume属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setVolume(Integer value) {
            this.volume = value;
        }

        /**
         * 获取repeat属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRepeat() {
            return repeat;
        }

        /**
         * 设置repeat属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRepeat(Boolean value) {
            this.repeat = value;
        }

        /**
         * 获取synchronous属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSynchronous() {
            return synchronous;
        }

        /**
         * 设置synchronous属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSynchronous(Boolean value) {
            this.synchronous = value;
        }

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
     *       &lt;attribute name="URI" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Base" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class URI {

        @XmlAttribute(name = "URI", required = true)
        protected String uri;
        @XmlAttribute(name = "Base")
        protected String base;
        @XmlAttribute(name = "Target")
        protected String target;

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * 获取base属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBase() {
            return base;
        }

        /**
         * 设置base属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBase(String value) {
            this.base = value;
        }

        /**
         * 获取target属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * 设置target属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

    }

}

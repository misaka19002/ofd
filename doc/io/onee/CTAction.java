//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

/**
 * <p>CT_Action complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CT_Action"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Region" type="{http://www.ofdspec.org/2016}CT_Region" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Goto"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Dest" type="{http://www.ofdspec.org/2016}CT_Dest"/&gt;
 *                     &lt;element name="Bookmark"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="URI"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="URI" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="Base" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="GotoA"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="AttachID" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *                   &lt;attribute name="NewWindow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Sound"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *                   &lt;attribute name="Volume" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                   &lt;attribute name="Repeat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                   &lt;attribute name="Synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Movie"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
 *                   &lt;attribute name="Operator" default="Play"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Play"/&gt;
 *                         &lt;enumeration value="Stop"/&gt;
 *                         &lt;enumeration value="Pause"/&gt;
 *                         &lt;enumeration value="Resume"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Event" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="DO"/&gt;
 *             &lt;enumeration value="PO"/&gt;
 *             &lt;enumeration value="CLICK"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CT_Action", propOrder = {
    "region",
    "_goto",
    "uri",
    "gotoA",
    "sound",
    "movie"
})
public class CTAction {

    protected CTRegion region;
    protected CTAction.Goto _goto;
    protected CTAction.URI uri;
    protected CTAction.GotoA gotoA;
    protected CTAction.Sound sound;
    protected CTAction.Movie movie;
    protected String event;

    /**
     * 获取region属性的值。
     *
     * @return
     *     possible object is
     *     {@link CTRegion }
     *
     */
    @XmlElement(name = "Region")
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
    @XmlElement(name = "Goto")
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
    @XmlElement(name = "URI")
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
    @XmlElement(name = "GotoA")
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
    @XmlElement(name = "Sound")
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
    @XmlElement(name = "Movie")
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
    @XmlAttribute(name = "Event", required = true)
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Dest" type="{http://www.ofdspec.org/2016}CT_Dest"/&gt;
     *         &lt;element name="Bookmark"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "dest",
        "bookmark"
    })
    public static class Goto {

        protected CTDest dest;
        protected CTAction.Goto.Bookmark bookmark;

        /**
         * 获取dest属性的值。
         *
         * @return
         *     possible object is
         *     {@link CTDest }
         *
         */
        @XmlElement(name = "Dest")
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
        @XmlElement(name = "Bookmark")
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
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "")
        public static class Bookmark {

            protected String name;

            /**
             * 获取name属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "Name", required = true)
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="AttachID" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
     *       &lt;attribute name="NewWindow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "")
    public static class GotoA {

        protected Object attachID;
        protected Boolean newWindow;

        /**
         * 获取attachID属性的值。
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        @XmlAttribute(name = "AttachID", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
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
        @XmlAttribute(name = "NewWindow")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
     *       &lt;attribute name="Operator" default="Play"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Play"/&gt;
     *             &lt;enumeration value="Stop"/&gt;
     *             &lt;enumeration value="Pause"/&gt;
     *             &lt;enumeration value="Resume"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "")
    public static class Movie {

        protected long resourceID;
        protected String operator;

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

        /**
         * 获取operator属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "Operator")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="ResourceID" use="required" type="{http://www.ofdspec.org/2016}ST_RefID" /&gt;
     *       &lt;attribute name="Volume" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="Repeat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "")
    public static class Sound {

        protected long resourceID;
        protected Integer volume;
        protected Boolean repeat;
        protected Boolean synchronous;

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

        /**
         * 获取volume属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        @XmlAttribute(name = "Volume")
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
        @XmlAttribute(name = "Repeat")
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
        @XmlAttribute(name = "Synchronous")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="URI" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Base" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "")
    public static class URI {

        protected String uri;
        protected String base;
        protected String target;

        /**
         * 获取uri属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "URI", required = true)
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
        @XmlAttribute(name = "Base")
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
        @XmlAttribute(name = "Target")
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

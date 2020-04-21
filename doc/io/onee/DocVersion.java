//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:28:23 PM CST
//


package io.onee;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="FileList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="File" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.ofdspec.org/2016&gt;ST_Loc"&gt;
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocRoot" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "", propOrder = {
    "fileList",
    "docRoot"
})
@XmlRootElement(name = "DocVersion")
public class DocVersion {

    protected DocVersion.FileList fileList;
    protected String docRoot;
    protected String id;
    protected String version;
    protected String name;
    protected XMLGregorianCalendar creationDate;

    /**
     * 获取fileList属性的值。
     *
     * @return
     *     possible object is
     *     {@link DocVersion.FileList }
     *
     */
    @XmlElement(name = "FileList", required = true)
    public DocVersion.FileList getFileList() {
        return fileList;
    }

    /**
     * 设置fileList属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DocVersion.FileList }
     *
     */
    public void setFileList(DocVersion.FileList value) {
        this.fileList = value;
    }

    /**
     * 获取docRoot属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlElement(name = "DocRoot", required = true)
    @XmlSchemaType(name = "anyURI")
    public String getDocRoot() {
        return docRoot;
    }

    /**
     * 设置docRoot属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocRoot(String value) {
        this.docRoot = value;
    }

    /**
     * 获取id属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取version属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Version")
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取name属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @XmlAttribute(name = "Name")
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

    /**
     * 获取creationDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    @XmlAttribute(name = "CreationDate")
    @XmlSchemaType(name = "date")
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
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
     *         &lt;element name="File" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.ofdspec.org/2016&gt;ST_Loc"&gt;
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "file"
    })
    public static class FileList {

        protected List<DocVersion.FileList.File> file;

        /**
         * Gets the value of the file property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocVersion.FileList.File }
         *
         *
         */
        @XmlElement(name = "File", required = true, type = DocVersion.FileList.File.class)
        public List<DocVersion.FileList.File> getFile() {
            if (file == null) {
                file = new ArrayList<DocVersion.FileList.File>();
            }
            return this.file;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.ofdspec.org/2016&gt;ST_Loc"&gt;
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.PROPERTY)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class File {

            protected String value;
            protected String id;

            /**
             * 获取value属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlValue
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 获取id属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            public String getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setID(String value) {
                this.id = value;
            }

        }

    }

}

package io.onee.ofd.test;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by admin on 2020/4/15 17:17:16.
 */
public class XsdTest {
    public Tuple2 t001  = new Tuple2("<? xml", "<?xml");
    public Tuple2 t0011 = new Tuple2("schemaxmlns", "schema xmlns");
    public Tuple2 t0012 = new Tuple2("xmlns : xs", "xmlns:xs");
    public Tuple2 t0013 = new Tuple2(" >", ">");
    public Tuple2 t0014 = new Tuple2(" />", "/>");
    public Tuple2 t0015 = new Tuple2(" ?>", "?>");
    
    public Tuple2 t003  = new Tuple2("<! --", "<!--");
    public Tuple2 t0031 = new Tuple2("< ! --", "<!--");
    public Tuple2 t004  = new Tuple2("-- >", "-->");
    public Tuple2 t005  = new Tuple2(" _ ", "_");
    
    
    public Tuple2 t008 = new Tuple2("GB / T 33190 — 2016", "");
    public Tuple2 t009 = new Tuple2("http :// ", "http://");
    public Tuple2 t010 = new Tuple2(" / ", "/");
    public Tuple2 t011 = new Tuple2("xmlns :  ", "xmlns:");
    
    public Tuple2 t17 = new Tuple2("xs : simpleTypename", "xs:simpleType name");
    public Tuple2 t18 = new Tuple2("xs : complexTypename", "xs:complexType name");
    
    public Tuple2 t30 = new Tuple2("xs : attributename", "xs:attribute name");
    public Tuple2 t31 = new Tuple2("xs : restrictionbase", "xs:restriction base");
    public Tuple2 t32 = new Tuple2("xs : enumerationvalue", "xs:enumeration value");
    public Tuple2 t33 = new Tuple2("xs : elementname", "xs:element name");
    public Tuple2 t34 = new Tuple2("xs : choicemaxOccurs", "xs:choice maxOccurs");
    public Tuple2 t35 = new Tuple2("xs : choiceminOccurs", "xs:choice minOccurs");
    public Tuple2 t36 = new Tuple2("xs : includeschemaLocation", "xs:include schemaLocation");
    public Tuple2 t37 = new Tuple2("xs : extensionbase", "xs : extension base");
    public Tuple2 t38 = new Tuple2("xs : sequencemaxOccurs", "xs:sequence maxOccurs");
    
    
    public Tuple2 t0070 = new Tuple2(" xs : ", "xs:");
    public Tuple2 t0071 = new Tuple2(" xs :", "xs:");
    public Tuple2 t0072 = new Tuple2("xs :", "xs:");
    public Tuple2 t0073 = new Tuple2(" xs:", "xs:");
    public Tuple2 t0074 = new Tuple2("xs: ", "xs:");
    
    
    @Test
    public void generateFiles() throws Exception {
        Path basePath = Paths.get("C:\\Users\\admin\\Desktop\\ofd_reader\\xsd");
        List<Path> p3 = Files.list(basePath).collect(Collectors.toList());
        for (Path file : p3) {
            if (Files.isRegularFile(file) && file.getFileName().toString().endsWith("source.txt")) {
                long start = System.currentTimeMillis();
                String fileName = file.getFileName().toString();
                String content = new String(Files.readAllBytes(file));
                content = generateContentPretty(content);
                String newFileName = fileName.split(" ")[1].split("\\.")[0] + ".xsd";
                Path newFilePath = basePath.resolve(newFileName);
                Files.write(newFilePath, content.getBytes(Charset.defaultCharset()));
                long end = System.currentTimeMillis();
                System.out.println(newFileName + "耗时:" + (end - start));
            }
        }
        
        System.out.println("aa");
    }
    
    @Test
    public void numberTest() {
        String d = "4 9";
        d = pageNumRrease(d);
        System.out.println(d);
    }
    
    public String generateContentPretty(String content) throws IllegalAccessException {
        return generateContent(content, true);
    }
    
    public String generateContent(String content, Boolean pretty) throws IllegalAccessException {
        if (pretty == null) {
            pretty = false;
        }
        Field[] s = this.getClass().getFields();
        for (Field field : s) {
            System.out.println(field.getName());
            if (field.get(this) instanceof Tuple2) {
                Tuple2<String, String> tuple2 = (Tuple2) field.get(this);
                content = content.replace(tuple2.f1, tuple2.f2);
            }
        }
        content = this.pageNumRrease(content).replace("    ", "");
//        content = content.replace("\r\n", "").trim();
        if (pretty) {
            return prettyXml(content.trim());
        } else {
            return content.trim();
        }
    }
    
    public String prettyXml(String content) {
        try {
            Document doc = xmlFromstring(content);
            String result = formatXmlString(doc);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return content;
        }
    }
    
    public String pageNumRrease(String content) {
        int min = 93;
        int max = 127;
        
        List<String> list = IntStream
                .range(min, max)
                .boxed()
                .map(String::valueOf)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .map(x -> x.replace("", " "))
                .map(String::trim)
                .collect(Collectors.toList());
        for (String s : list) {
            content = content.replace(s, "");
        }
        return content;
    }
    
    private Document xmlFromstring(String content) throws ParserConfigurationException, IOException, SAXException {
        Document doc = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.parse(new InputSource(new StringReader(content)));
        return doc;
    }
    
    private String formatXmlString(Document doc) throws TransformerException, IOException {
        OutputFormat format = new OutputFormat(doc);
        format.setLineWidth(500);
        format.setIndenting(true);
        format.setIndent(2);
        Writer out = new StringWriter();
        XMLSerializer serializer = new XMLSerializer(out, format);
        serializer.serialize(doc);
        return out.toString();
    }
    
    @Test
    public void dsfsd() {
        try {
            String ds = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + "<xs:schema xmlns=\"http://www.ofdspec.org/2016\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" targetNamespace=\"http://www.ofdspec.org/2016\">\n" + "<xs:include schemaLocation=\"Page.xsd\"/>\n" + "<xs:include schemaLocation=\"Definitions.xsd\"/>\n" + "<!-- 资源文件定义。 文档中使用的资源性文件比如图形、图像、 多媒体、 绘制参数(样式) 等应在资\n" + "源文件中统一管理。 -->\n" + "<xs:element name=\"Res\">\n" + "<xs:complexType>\n" + "\n" + "\n" + "<xs:choice maxOccurs=\"unbounded\" minOccurs=\"0\">\n" + "<xs:element name=\"ColorSpaces\">\n" + "<xs:complexType>\n" + "<xs:sequence>\n" + "<xs:element maxOccurs=\"unbounded\" name=\"ColorSpace\">\n" + "<xs:complexType>\n" + "<xs:complexContent>\n" + "<xs:extension base=\"CT_ColorSpace\">\n" + "<xs:attribute name=\"ID\" type=\"ST_ID\" use=\"required\"/>\n" + "</xs:extension>\n" + "</xs:complexContent>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "</xs:sequence>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "<xs:element name=\"DrawParams\">\n" + "<xs:complexType>\n" + "<xs:sequence>\n" + "<xs:element maxOccurs=\"unbounded\" name=\"DrawParam\">\n" + "<xs:complexType>\n" + "<xs:complexContent>\n" + "<xs:extension base=\"CT_DrawParam\">\n" + "<xs:attribute name=\"ID\" type=\"ST_ID\" use=\"required\"/>\n" + "</xs:extension>\n" + "</xs:complexContent>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "</xs:sequence>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "<xs:element name=\"Fonts\">\n" + "<xs:complexType>\n" + "<xs:sequence>\n" + "<xs:element maxOccurs=\"unbounded\" name=\"Font\">\n" + "<xs:complexType>\n" + "<xs:complexContent>\n" + "<xs:extension base=\"CT_Font\">\n" + "<xs:attribute name=\"ID\" type=\"ST_ID\" use=\"required\"/>\n" + "</xs:extension>\n" + "\n" + "\n" + "</xs:complexContent>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "</xs:sequence>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "<xs:element name=\"MultiMedias\">\n" + "<xs:complexType>\n" + "<xs:sequence>\n" + "<xs:element maxOccurs=\"unbounded\" name=\"MultiMedia\">\n" + "<xs:complexType>\n" + "<xs:complexContent>\n" + "<xs:extension base=\"CT_MultiMedia\">\n" + "<xs:attribute name=\"ID\" type=\"ST_ID\" use=\"required\"/>\n" + "</xs:extension>\n" + "</xs:complexContent>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "</xs:sequence>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "<xs:element name=\"CompositeGraphicUnits\">\n" + "<xs:complexType>\n" + "<xs:sequence>\n" + "<xs:element maxOccurs=\"unbounded\" name=\"CompositeGraphicUnit\">\n" + "<xs:complexType>\n" + "<xs:complexContent>\n" + "<xs:extension base=\"CT_VectorG\">\n" + "<xs:attribute name=\"ID\" type=\"ST_ID\" use=\"required\"/>\n" + "</xs:extension>\n" + "</xs:complexContent>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "</xs:sequence>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "</xs:choice>\n" + "<xs:attribute name=\"BaseLoc\" type=\"ST_Loc\" use=\"required\"/>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "\n" + "\n" + "<!-- 颜色空间的定义 -->\n" + "<xs:complexType name=\"CT_ColorSpace\">\n" + "<xs:sequence>\n" + "<xs:element minOccurs=\"0\" name=\"Palette\">\n" + "<xs:complexType>\n" + "<xs:sequence>\n" + "<xs:element maxOccurs=\"unbounded\" name=\"CV\" type=\"ST_Array\"/>\n" + "</xs:sequence>\n" + "</xs:complexType>\n" + "</xs:element>\n" + "</xs:sequence>\n" + "<xs:attribute name=\"Type\" use=\"required\">\n" + "<xs:simpleType>\n" + "<xs:restriction base=\"xs:string\">\n" + "<xs:enumeration value=\"GRAY\"/>\n" + "<xs:enumeration value=\"RGB\"/>\n" + "<xs:enumeration value=\"CMYK\"/>\n" + "</xs:restriction>\n" + "</xs:simpleType>\n" + "</xs:attribute>\n" + "<xs:attribute default=\"8\" name=\"BitsPerComponent\" type=\"xs:int\"/>\n" + "<xs:attribute name=\"Profile\" type=\"ST_Loc\"/>\n" + "</xs:complexType>\n" + "<!-- 绘制参数定义 -->\n" + "<xs:complexType name=\"CT_DrawParam\">\n" + "<xs:sequence>\n" + "<xs:element minOccurs=\"0\" name=\"FillColor\" type=\"CT_Color\"/>\n" + "<xs:element minOccurs=\"0\" name=\"StrokeColor\" type=\"CT_Color\"/>\n" + "</xs:sequence>\n" + "<xs:attribute name=\"Relative\" type=\"ST_RefID\"/>\n" + "<xs:attribute default=\"0.353\" name=\"LineWidth\" type=\"xs:double\"/>\n" + "<xs:attribute default=\"Miter\" name=\"Join\" type=\"xs:string\"/>\n" + "<xs:attribute default=\"Butt\" name=\"Cap\" type=\"xs:string\"/>\n" + "<xs:attribute default=\"0\" name=\"DashOffset\" type=\"xs:double\"/>\n" + "<xs:attribute name=\"DashPattern\" type=\"ST_Array\"/>\n" + "<xs:attribute default=\"4.234\" name=\"MiterLimit\" type=\"xs:double\"/>\n" + "</xs:complexType>\n" + "<!-- 字型资源定义 -->\n" + "<xs:complexType name=\"CT_Font\">\n" + "<xs:sequence>\n" + "<xs:element minOccurs=\"0\" name=\"FontFile\" type=\"ST_Loc\"/>\n" + "</xs:sequence>\n" + "\n" + "\n" + "<xs:attribute name=\"FontName\" type=\"xs:string\" use=\"required\"/>\n" + "<xs:attribute name=\"FamilyName\" type=\"xs:string\"/>\n" + "<xs:attribute default=\"unicode\" name=\"Charset\">\n" + "<xs:simpleType>\n" + "<xs:restriction base=\"xs:string\">\n" + "<xs:enumeration value=\"symbol\"/>\n" + "<xs:enumeration value=\"prc\"/>\n" + "<xs:enumeration value=\"big5\"/>\n" + "<xs:enumeration value=\"shift-jis\"/>\n" + "<xs:enumeration value=\"wansung\"/>\n" + "<xs:enumeration value=\"johab\"/>\n" + "<xs:enumeration value=\"unicode\"/>\n" + "</xs:restriction>\n" + "</xs:simpleType>\n" + "</xs:attribute>\n" + "<xs:attribute default=\"false\" name=\"Italic\" type=\"xs:boolean\"/>\n" + "<xs:attribute default=\"false\" name=\"Bold\" type=\"xs:boolean\"/>\n" + "<xs:attribute default=\"false\" name=\"Serif\" type=\"xs:boolean\"/>\n" + "<xs:attribute default=\"false\" name=\"FixedWidth\" type=\"xs:boolean\"/>\n" + "</xs:complexType>\n" + "<!-- 多媒体(含位图图像)资源定义 -->\n" + "<xs:complexType name=\"CT_MultiMedia\">\n" + "<xs:sequence>\n" + "<xs:element name=\"MediaFile\" type=\"ST_Loc\"/>\n" + "</xs:sequence>\n" + "<xs:attribute name=\"Type\" use=\"required\">\n" + "<xs:simpleType>\n" + "<xs:restriction base=\"xs:string\">\n" + "<xs:enumeration value=\"Image\"/>\n" + "<xs:enumeration value=\"Audio\"/>\n" + "<xs:enumeration value=\"Video\"/>\n" + "</xs:restriction>\n" + "</xs:simpleType>\n" + "</xs:attribute>\n" + "<xs:attribute name=\"Format\" type=\"xs:string\"/>\n" + "</xs:complexType>\n" + "<!-- 矢量图像定义 -->\n" + "<xs:complexType name=\"CT_VectorG\">\n" + "<xs:sequence>\n" + "<xs:element minOccurs=\"0\" name=\"Thumbnail\" type=\"ST_RefID\"/>\n" + "<xs:element minOccurs=\"0\" name=\"Substitution\" type=\"ST_RefID\"/>\n" + "<xs:element name=\"Content\" type=\"CT_PageBlock\"/>\n" + "</xs:sequence>\n" + "\n" + "\n" + "<xs:attribute name=\"Width\" type=\"xs:double\" use=\"required\"/>\n" + "<xs:attribute name=\"Height\" type=\"xs:double\" use=\"required\"/>\n" + "</xs:complexType>\n" + "</xs:schema>\n";
            Document doc = xmlFromstring(ds);
            String s = formatXmlString(doc);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

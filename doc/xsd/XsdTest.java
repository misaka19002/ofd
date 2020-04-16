package io.vxdoc.modelConverter;

import io.vxdoc.annoUtil.Tuple2;
import org.junit.Test;

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
    public Tuple2 t001 = new Tuple2("<? xml", "<?xml");
    public Tuple2 t0011 = new Tuple2("schemaxmlns", "schema xmlns");
    public Tuple2 t0012 = new Tuple2("xmlns : xs", "xmlns:xs");
    public Tuple2 t0013 = new Tuple2(" >", ">");
    public Tuple2 t0014 = new Tuple2(" />", "/>");
    public Tuple2 t0015 = new Tuple2(" ?>", "?>");
    
    public Tuple2 t003 = new Tuple2("<! --", "<!--");
    public Tuple2 t0031 = new Tuple2("< ! --", "<!--");
    public Tuple2 t004 = new Tuple2("-- >", "-->");
    public Tuple2 t005 = new Tuple2(" _ ", "_");
    
    
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
            if (Files.isRegularFile(file)&&file.getFileName().toString().endsWith("source.txt")) {
                long start = System.currentTimeMillis();
                String fileName = file.getFileName().toString();
                String content = new String(Files.readAllBytes(file));
                content = generateFile(content);
                String newFileName = fileName.split(" ")[1].split("\\.")[0]+".xsd";
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
        d= pageNumRrease(d);
        System.out.println(d);
    }
    
    public String generateContent(String content) throws IllegalAccessException {
        Field[] s = this.getClass().getFields();
        for (Field field : s) {
            System.out.println(field.getName());
            if (field.get(this) instanceof Tuple2) {
                Tuple2<String, String> tuple2 = (Tuple2) field.get(this);
                content = content.replace(tuple2.f1, tuple2.f2);
            }
        }
        content = this.pageNumRrease(content).replace("    ","");
//        content = content.replace("\r\n", "").trim();
        return content.trim();
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
}

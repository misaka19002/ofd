package io.onee.ofd.project.font;

import io.onee.ofd.test.Tuple2;
import org.apache.fontbox.ttf.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static org.apache.fontbox.ttf.NameRecord.*;

/**
 * Created by admin on 2020/5/27 14:53:21.
 */
public class FontFactoryImpl {
    private String FONT_NAME = "SimSun";
    
    //key: fontName ,value: opentypefont
    private Map<String, Optional<TrueTypeFont>> fontNames    = new ConcurrentHashMap<>();
    //key: fontName ,value: familyName
    private Map<String, String>                 fontFamilies = new ConcurrentHashMap<>();
    private OTFParser                           parser       = new OTFParser(false, true);
    
    public FontFactoryImpl() {
        fontNames.put(FONT_NAME, Optional.empty());
        fontFamilies.put(FONT_NAME, FONT_NAME);
    }
    
    public void register(String path) {
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            this.register(file);
        }
    }
    
    public void register(File file) {
        try {
            //ttc
            if (file.getPath().endsWith("ttc")) {
                new TrueTypeCollection(new File("d:/data/simsun.ttc")).processAllFonts(x -> {
                    register(x);
                });
            } else {
                OpenTypeFont font = parser.parse(file);
                this.register(font);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void register(TrueTypeFont font) throws IOException {
        Tuple2<String, String> name = this.getEnglishName(font.getNaming());
        if (fontNames.containsKey(name.f2)) {
            return;
        } else {
            this.fontNames.put(name.f1, Optional.of(font));
            this.fontFamilies.put(name.f1, name.f2);
        }
        
        
    }
    
    /**
     * register all system fonts
     *
     * @return
     */
    public int registerDirectories() {
        int count = 0;
        count += registerDirectory("c:/windows/fonts");
        count += registerDirectory("c:/winnt/fonts");
        count += registerDirectory("d:/windows/fonts");
        count += registerDirectory("d:/winnt/fonts");
        count += registerDirectory("/usr/share/X11/fonts", true);
        count += registerDirectory("/usr/X/lib/X11/fonts", true);
        count += registerDirectory("/usr/openwin/lib/X11/fonts", true);
        count += registerDirectory("/usr/share/fonts", true);
        count += registerDirectory("/usr/X11R6/lib/X11/fonts", true);
        count += registerDirectory("/Library/Fonts");
        count += registerDirectory("/System/Library/Fonts");
        return count;
    }
    
    public int registerDirectory(String dir) {
        return registerDirectory(dir, false);
    }
    
    public int registerDirectory(String dir, boolean scanSubdirectories) {
        int count = 0;
        try {
            File file = new File(dir);
            if (!file.exists() || !file.isDirectory()) return 0;
            String[] files = file.list();
            if (files == null) return 0;
            for (String file1 : files) {
                try {
                    file = new File(dir, file1);
                    if (file.isDirectory()) {
                        if (scanSubdirectories) {
                            count += registerDirectory(file.getAbsolutePath(), true);
                        }
                    } else {
                        String name = file.getPath();
                        String suffix = name.length() < 4 ? null : name.substring(name.length() - 4).toLowerCase();
                        if (".afm".equals(suffix) || ".pfm".equals(suffix)) {
                            /* Only register Type 1 fonts with matching .pfb files */
                            File pfb = new File(name.substring(0, name.length() - 4) + ".pfb");
                            if (pfb.exists()) {
                                register(name);
                                ++count;
                            }
                        } else if (".ttf".equals(suffix) || ".otf".equals(suffix)) {
                            register(name);
                            ++count;
                        } else if (".ttc".equals(suffix)) {
                            register(name);
                            ++count;
                        }
                    }
                } catch (Exception e) {
                    //empty on purpose
                }
            }
        } catch (Exception e) {
            //empty on purpose
        }
        return count;
    }
    
    /**
     * Returns the fontstyle, if the font is already styled. <br>
     * <pre>
     * For example:
     * font: Helvetica - style: normal
     * font: Helvetica-Bold - style: bold
     * </pre>
     *
     * @param fontName
     * @return
     */
    private int getFontStyle(String fontName) {
        String lcf = fontName.toLowerCase();
//        int fontStyle = io.onee.ofd.project.font.Font.NORMAL;
//        if (lcf.contains("bold")) {
//            fontStyle |= io.onee.ofd.project.font.Font.BOLD;
//        }
//        if (lcf.contains("italic") || lcf.contains("oblique")) {
//            fontStyle |= Font.ITALIC;
//        }
//        return fontStyle;
        return 0;
    }
    
    /**
     * NAME_FULL_FONT_NAME: 4
     * NAME_FONT_FAMILY_NAME: 1
     *
     * @param namingTable
     * @return map.key=fullName; map.value=familyName
     */
    private Tuple2<String, String> getEnglishName(NamingTable namingTable)
    {
        
        // Unicode, Full, BMP, 1.1, 1.0
        for (int i = 4; i >= 0; i--) {
            String nameUni = namingTable.getName(NAME_FULL_FONT_NAME, PLATFORM_UNICODE, i, LANGUGAE_UNICODE);
            String nameUniFm = namingTable.getName(NAME_FONT_FAMILY_NAME, PLATFORM_UNICODE, i, LANGUGAE_UNICODE);
            if (nameUni != null) {
                return new Tuple2<>(nameUni, nameUniFm);
            }
        }
        
        // Windows, Unicode BMP, EN-US
        String nameWin = namingTable.getName(4, PLATFORM_WINDOWS, ENCODING_WINDOWS_UNICODE_BMP, LANGUGAE_WINDOWS_EN_US);
        String nameWinFm = namingTable.getName(1, PLATFORM_WINDOWS, ENCODING_WINDOWS_UNICODE_BMP, LANGUGAE_WINDOWS_EN_US);
        if (nameWin != null) {
            return new Tuple2<>(nameWin, nameWinFm);
        }
        
        // Macintosh, Roman, English
        String nameMac = namingTable.getName(4, PLATFORM_MACINTOSH, ENCODING_MACINTOSH_ROMAN, LANGUGAE_MACINTOSH_ENGLISH);
        String nameMacFm = namingTable.getName(1, PLATFORM_MACINTOSH, ENCODING_MACINTOSH_ROMAN, LANGUGAE_MACINTOSH_ENGLISH);
        if (nameMac != null) {
            return new Tuple2<>(nameMac, nameMacFm);
        }
        return null;
    }
    
    public Set<String> getFontNames() {
        return fontNames.keySet();
    }
    
    public Map<String, List<String>> getFontFamilies() {
        return fontFamilies
                .entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
    }
    
    public Optional<TrueTypeFont> getOpenTypeFont(String fontName) {
        return fontNames.get(fontName);
    }
}

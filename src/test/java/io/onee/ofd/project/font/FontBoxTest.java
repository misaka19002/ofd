package io.onee.ofd.project.font;

import org.apache.fontbox.ttf.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2020/5/27 16:15:31.
 */
public class FontBoxTest {


    @Test
    public void simpleFont() throws IOException {
        TTFParser parser = new TTFParser();
        OpenTypeFont otf = new OTFParser().parse("d:/data/HYKaiTiJ.ttf");
        int gid = Arrays
                .stream(otf.getCmap().getCmaps())
                .map(cmapSubtable -> cmapSubtable.getGlyphId('A'))
                .filter(x -> x > 0)
                .findFirst()
                .orElse(0);
        //A:546
        int width = otf.getHorizontalMetrics().getAdvanceWidth(gid);
        //    FontFamilyName(1),
        //    FontSubfamilyName(2),
        //    UniqueFontIdentifier(3),
        //    FullFontName(4),
        //
        System.out.println(width);
        
    }
    
    @Test
    public void aliPuHuiFont() throws IOException {
        OTFParser parser = new OTFParser();
        OpenTypeFont o1 = parser.parse("d:/data/Alibaba-PuHuiTi-Bold.ttf");
        OpenTypeFont o2 = parser.parse("d:/data/Alibaba-PuHuiTi-Heavy.ttf");
        OpenTypeFont o3 = parser.parse("d:/data/Alibaba-PuHuiTi-Light.ttf");
        OpenTypeFont o4 = parser.parse("d:/data/Alibaba-PuHuiTi-Medium.ttf");
        OpenTypeFont o5 = parser.parse("d:/data/Alibaba-PuHuiTi-Regular.ttf");
        List<OpenTypeFont> otfList = new ArrayList<>();
        otfList.add(o1);
        otfList.add(o2);
        otfList.add(o3);
        otfList.add(o4);
        otfList.add(o5);
    
        for (OpenTypeFont openTypeFont : otfList) {
            //platform 0: unicode, 1: mac, 3: windows
            //encoding 3:ENCODING_UNICODE_2_0_BMP/ENCODING_UNICODE_1_1  0:LANGUGAE_UNICODE/ENCODING_WINDOWS_SYMBOL/ENCODING_MACINTOSH_ROMAN
//            System.out.println(openTypeFont.getNaming().getNameRecords().get(1).toString());
//            System.out.println(openTypeFont.getNaming().getNameRecords().get(2).toString());
//            System.out.println(openTypeFont.getNaming().getNameRecords().get(3).toString());
//            System.out.println(openTypeFont.getNaming().getNameRecords().get(4).toString());
            
            System.out.println(openTypeFont.getNaming().getName(4,0,3, NameRecord.LANGUGAE_UNICODE));
            System.out.println(openTypeFont.getNaming().getName(4,1,0, 0));
//            System.out.println(openTypeFont.getNaming().getName(4,1,25, 33));
            System.out.println(openTypeFont.getCmap().getCmaps()[0].getPlatformId());
            System.out.println(openTypeFont.getCmap().getCmaps()[1].getPlatformId());
            
            //System.out.println(openTypeFont.getCmap().getCmaps()[0].getPlatformEncodingId());
            //System.out.println(openTypeFont.getCmap().getCmaps()[1].getPlatformEncodingId());
            System.out.println();
        }
    }
    
    private String getEnglishName(int nameId, NamingTable namingTable)
    {
        
        // Unicode, Full, BMP, 1.1, 1.0
        for (int i = 4; i >= 0; i--)
        {
            String nameUni =
                    namingTable.getName(nameId,
                            NameRecord.PLATFORM_UNICODE,
                            i,
                            NameRecord.LANGUGAE_UNICODE);
            if (nameUni != null)
            {
                return nameUni;
            }
        }
        
        // Windows, Unicode BMP, EN-US
        String nameWin =
                namingTable.getName(nameId,
                        NameRecord.PLATFORM_WINDOWS,
                        NameRecord.ENCODING_WINDOWS_UNICODE_BMP,
                        NameRecord.LANGUGAE_WINDOWS_EN_US);
        if (nameWin != null)
        {
            return nameWin;
        }
        
        // Macintosh, Roman, English
        String nameMac =
                namingTable.getName(nameId,
                        NameRecord.PLATFORM_MACINTOSH,
                        NameRecord.ENCODING_MACINTOSH_ROMAN,
                        NameRecord.LANGUGAE_MACINTOSH_ENGLISH);
        if (nameMac != null)
        {
            return nameMac;
        }
        
        return null;
    }
}

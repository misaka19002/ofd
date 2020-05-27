package io.onee.ofd.project.font;

import org.apache.fontbox.ttf.OTFParser;
import org.apache.fontbox.ttf.OpenTypeFont;
import org.apache.fontbox.ttf.TTFParser;
import org.apache.fontbox.ttf.TrueTypeFont;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by admin on 2020/5/27 16:15:31.
 */
public class FontBoxTest {


    @Test
    public void simpleFont() throws IOException {
        TTFParser parser = new TTFParser();
        TrueTypeFont ttf = parser.parse(new File("d:/data/HYKaiTiJ.ttf"));
        OpenTypeFont otf = new OTFParser().parse("d:/data/HYKaiTiJ.ttf");
        int gid = Arrays
                .stream(otf.getCmap().getCmaps())
                .map(cmapSubtable -> cmapSubtable.getGlyphId('A'))
                .filter(x -> x > 0)
                .findFirst()
                .orElse(0);
        //A:546
        int width = otf.getHorizontalMetrics().getAdvanceWidth(gid);
        System.out.println(width);
        
    }

}

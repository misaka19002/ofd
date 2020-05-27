package io.onee.ofd.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2020/5/18 11:13:05.
 */
public class OtherTest {
    @Test
    public void generateRectangle() {
        List<String> pageSize = Arrays.asList("841×1189", "594×841", "420×594", "297×420", "210×297", "148×210", "105×148", "74×105", "52×74", "37×52", "26×37" );
        int m = 0;
        for (String s : pageSize) {
            String[] strings = s.split("×" );
            String result = String.format("public static Rectangle A%s = new Rectangle(0d,0d,%sd,%sd);", m, strings[0], strings[1]);
            System.out.println(result);
            m++;
        }
    }
}

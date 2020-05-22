package io.onee.ofd.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.onee.ofd.other.PageArea;
import io.onee.ofd.other.Rectangle;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by admin on 2020/5/19 10:08:31.
 */
public class PageAreaTest {
    
    @Test
    public void RectangleToString() {
        Rectangle rectangle = new Rectangle(0, 0, 20, 30);
        System.out.println(rectangle.toString());
        assert "0.0 0.0 20.0 30.0".equals(rectangle.toString());
    }
    
    @Test
    public void PageAreaToString() {
        Rectangle rectangle = PageArea.A4;
        System.out.println(rectangle.toString());
        //0.0 0.0 210.0 297.0
        assert "0.0 0.0 210.0 297.0".equals(rectangle.toString());
    
        Rectangle rectangle1 = PageArea.A4.setMargin(PageArea.Margin.Normal);
        System.out.println(rectangle1.toString());
        //先加 后减 尽量减少精度问题，但是仍有一些无法避免
        //Double.valueOf(1-(0.3+0.4)).toString() = 0.30000000000000004
        assert "31.8 25.4 146.4 246.2".equals(rectangle1.toString());
    }
    
    @Test
    public void ss() {
        String sql1 = "select count(distinct nn.request_id) from invoiceData_sg_%s sg right join invoiceData_nn_%s nn on sg.einvoice_code=nn.einvoice_code and sg.einvoice_number=nn.einvoice_number  where sg.id is null union all \n";
        StringBuilder sb = new StringBuilder();
        LocalDate start = LocalDate.parse("2019-01-01" );
        LocalDate end = LocalDate.parse("2019-12-30" );
        while (start.isBefore(end)) {
            String yyyyMM = start.format(DateTimeFormatter.ofPattern("yyyyMM"));
            sb.append(String.format(sql1, yyyyMM, yyyyMM));
            start = start.plusMonths(1);
        }
    
        int m = sb.lastIndexOf("union all");
        sb.delete(m, sb.length());
        sb.append(";");
        System.out.println(sb.toString());
    }
    @Test
    public void ss111() {
        Path path = Paths.get("C:\\Users\\admin\\Desktop\\adb04f5f450e45ae9630cf5f74b6eb2f.txt");
        try {
            String content = Files.readAllLines(path).stream().collect(Collectors.joining());
            JSONObject json = JSON.parseObject(content);
            String data = json.getString("Data");
            data = new String(Base64.getDecoder().decode(data));
            JSONArray array = JSON.parseObject(data).getJSONObject("DataBag").getJSONArray("EInvoice");
            List<String> numberList = array
                    .stream()
                    .map(x -> (JSONObject) x)
                    .map(x -> x.getString("EInvoiceCode")+"  "+x.getString("EInvoiceNumber"))
                    .collect(Collectors.toList());
            System.out.println(numberList);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

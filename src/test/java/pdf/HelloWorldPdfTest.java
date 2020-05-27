package pdf;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.html.HtmlWriter;
import com.lowagie.text.pdf.PdfWriter;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by admin on 2020/5/27 14:10:03.
 */
public class HelloWorldPdfTest {
    
    @Test
    public void landscapePortrait() {
        
        System.out.println("Documents in Landscape and Portrait format");
        // step 1: creation of a document-object
        Document document = new Document(PageSize.A4.rotate());
        
        try {
            
            // step 2:
            // we create a writer that listens to the document
            // and directs a PDF-stream to a file
            
            PdfWriter.getInstance(document, new FileOutputStream("/srv/helloworld-landscape.pdf"));
            HtmlWriter.getInstance(document, new FileOutputStream("/srv/helloworld-landscape.html"));
            // step 3: we open the document
            document.open();
            
            // step 4: we add some content
            document.add(new Paragraph("To create a document in landscape format, just make the height smaller than the width. For instance by rotating the PageSize Rectangle: PageSize.A4.rotate()"));
            document.setPageSize(PageSize.A4);
            document.newPage();
            document.add(new Paragraph("This is portrait again.This is portrait again.This is portrait again.This is portrait again.This is portrait again.This is portrait again.This is portrait again."));
        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        
        // step 5: we close the document
        document.close();
    }
    
    @Test
    public void testHelloWorld() throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            // step 1: creation of a document-object
            Document document = new Document();
            // step 2:
            // we create 3 different writers that listen to the document
            PdfWriter pdf = PdfWriter.getInstance(document, baos);
            
            // step 3: we open the document
            document.open();
            // step 4: we add a paragraph to the document
            document.add(new Paragraph("Hello World"));
            
            // step 5: we close the document
            document.close();
            Files.write(Paths.get("/srv/helloworld.pdf"), baos.toByteArray());
        }
        
    }
}

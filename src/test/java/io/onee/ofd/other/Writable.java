package io.onee.ofd.other;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by admin on 2020/5/15 18:59:54.
 */
public interface Writable {
    
    void toXml(ZipOutputStream zipOutputStream);
    
    default void writeZipEntry(String fileName, String content, ZipOutputStream zos) throws IOException {
        ZipEntry entry = new ZipEntry(fileName);
        zos.putNextEntry(entry);
        zos.write(content.getBytes());
        zos.flush();
        zos.closeEntry();
    }
}

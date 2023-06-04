package org.wlld.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * description: <br>
 * createTime: 2023/6/3 17:03 <br>
 *
 * @author zzh
 */
public class FileUtils {
    private FileUtils() {}

    public static InputStream getInputStream(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if(file.exists()) {
            return new FileInputStream(file);
        }
        ClassLoader classLoader = FileUtils.class.getClassLoader();
        return classLoader.getResourceAsStream(filePath);
    }
}

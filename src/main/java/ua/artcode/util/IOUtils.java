package ua.artcode.util;

import java.io.InputStream;

/**
 * Created by serhii on 11.10.15.
 */
public class IOUtils {

    public static InputStream getClassPathResource(String path){
        return IOUtils.class.getResourceAsStream(path);
    }

}

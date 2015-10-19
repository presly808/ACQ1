package ua.artcode.week3.day1.utils;

import org.testng.Assert;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public class PropertyLoader {

    private static final String PROPERTY_FILE = "/application.properties";

    public static String loadProperty(String name) {

        Properties props = new Properties();

        try {
            props.load(PropertyLoader.class.getResourceAsStream(PROPERTY_FILE));
        } catch (IOException e) {
            e.printStackTrace();
            //TODO add logger
            Assert.fail("Incorrect properties name - " + name);
        }

        String value = "";
        if (name != null) {
            value = props.getProperty(name);
        }

        return value;
    }


}

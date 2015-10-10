package ua.artcode.util;

import org.openqa.selenium.By;
import ua.artcode.exection.WrongPropertyTypeException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by serhii on 10.10.15.
 */
public class ConfigData {


    private static String uiMappingFileLocation = "UIMapping.properties";
    private static Map selectorsMap;

    private static void loadAllData() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(uiMappingFileLocation));
            selectorsMap = properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getValue(String key) {
        if (selectorsMap == null) {
            loadAllData();
        }
        return String.valueOf(selectorsMap.get(key));
    }

    public By getSelectorBy(String selectorPropertieName){

        String value = getValue(selectorPropertieName);

        String beginBrace = "(";
        String endBrace = ")";

        int beginBraceIndex = value.indexOf(beginBrace);
        int endBraceIndex = value.indexOf(endBrace);

        String selectorType = value.substring(0, beginBraceIndex);

        // remember about quotes in selector value
        String selectorValue = value.substring(beginBraceIndex + 2, endBraceIndex - 1);

        if ("id".equals(selectorType)){
            return By.id(selectorValue);
        } else if("className".equals(selectorType)){
            return By.className(selectorValue);
        } else if("xpath".equals(selectorType)){
            return By.xpath(selectorValue);
        } else if("css".equals(selectorType)){
            return By.cssSelector(selectorValue);
        } else {
            throw new WrongPropertyTypeException(String.format("wrong type %s in file", selectorType));
        }


    }


}

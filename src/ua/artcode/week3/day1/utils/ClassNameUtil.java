package ua.artcode.week3.day1.utils;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public class ClassNameUtil {

    private ClassNameUtil(){}

    public static String getCurrentClassName() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e){
            return e.getStackTrace()[1].getClassName();
        }
    }

}

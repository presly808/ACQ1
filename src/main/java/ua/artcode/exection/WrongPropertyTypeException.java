package ua.artcode.exection;

/**
 * Created by serhii on 10.10.15.
 */
public class WrongPropertyTypeException extends RuntimeException {

    public WrongPropertyTypeException(String message) {
        super(message);
    }
}

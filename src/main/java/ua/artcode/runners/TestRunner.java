package ua.artcode.runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Runner;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.JUnit4;
import org.junit.runners.model.InitializationError;
import ua.artcode.week1.day2.FirstTests;
import ua.artcode.week1.day3.TestPageFactory;
import ua.artcode.week1.day3.TestPageFactoryRefactored;

/**
 * Created by serhii on 11.10.15.
 */
public class TestRunner {


    public static void main(String[] args) throws InitializationError {
        JUnitCore.runClasses(TestPageFactoryRefactored.class);
    }
}

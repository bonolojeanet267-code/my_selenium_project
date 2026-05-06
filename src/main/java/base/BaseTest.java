package base;

import io.cucumber.java.After;
import utilities.DriverFactory;

public class BaseTest {

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
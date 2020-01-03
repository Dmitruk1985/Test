package com.test.core;

import org.openqa.selenium.WebDriver;

public class Driver {

    private static final DriverThreadLocalContainer threadDriver = new DriverThreadLocalContainer();

    private Driver() {
    }

    public static WebDriver getInstance() {
        return threadDriver.getAndCheckWebDriver();
    }

    public static void driverQuit() {
        threadDriver.closeWebDriver();
    }
}

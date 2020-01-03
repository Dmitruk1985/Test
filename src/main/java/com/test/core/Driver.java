package com.test.core;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

    @Attachment(value="Page Sreenshot", type="image/png")
    public static byte[] makeScreenShot(){
        return ((TakesScreenshot) getInstance()).getScreenshotAs(OutputType.BYTES);
    }
}

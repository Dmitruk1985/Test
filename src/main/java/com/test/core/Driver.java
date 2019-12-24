package com.test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver instance;

    private Driver() {

    }

    public static WebDriver getInstance() {

        if (instance == null) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            instance = new ChromeDriver();
        }
        return instance;
    }
}

package com.test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.currentThread;

public class DriverThreadLocalContainer {
    private final Map<Long, WebDriver> threadWebDriver = new ConcurrentHashMap<>(4);

    public WebDriver getAndCheckWebDriver() {
        WebDriver webDriver = threadWebDriver.get(currentThread().getId());

        if (webDriver == null) {
            webDriver = createDriver();
        }
        return webDriver;
    }

    private WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        threadWebDriver.put(currentThread().getId(), driver);
        return threadWebDriver.get(currentThread().getId());
    }

    public void closeWebDriver() {
        System.out.println("THREAD " + currentThread().getId());
        threadWebDriver.get(currentThread().getId()).quit();
        threadWebDriver.remove(currentThread().getId());
    }

}

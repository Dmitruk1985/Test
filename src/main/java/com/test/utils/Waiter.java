package com.test.utils;

import com.test.core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Waiter {
    private final static int DEFAULT_TIME = 5;

    private Waiter() {

    }

    public static WebElement isDisplayed(int time, By locator) {
        return (new WebDriverWait(Driver.getInstance(), time)).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static WebElement isDisplayed(By locator) {
        return isDisplayed(DEFAULT_TIME, locator);
    }
}

package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    public static void main(String[]arg){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        WebElement d =(new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//li[starts-with(@class, 'ajax_block_product')]")));
        d.click();
        WebElement d2 =(new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//span[contains(text(), 'Add to cart')]")));
        d2.click();
        //driver.quit();
    }

}

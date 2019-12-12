package com.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       /* WebElement d =(new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//li[starts-with(@class, 'ajax_block_product')]")));
        d.click();
        WebElement d2 =(new WebDriverWait(driver,5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//span[contains(text(), 'Add to cart')]")));
        d2.click();
        //driver.quit();
        driver.manage().window().setSize(new Dimension(800, 600));
        driver.get("http://automationpractice.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement d = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Click Here')]")));
        d.click();
        List<String> s = new ArrayList<>(driver.getWindowHandles());
        System.out.println(s);
        driver.switchTo().window(s.get(1));
        driver.close();
        driver.get("http://automationpractice.com");
        WebElement d = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id='search_query_top']")));
        d.sendKeys("Blouse", Keys.ENTER);
        WebElement d2 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), '1 result has been found.')]")));
        System.out.println(d2.isDisplayed());
        WebElement d3 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Add to cart')]")));
        System.out.println(d3.getText());
        WebElement d4 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//ul[@class=\"product_list grid row\"]/li")));
        System.out.println(d4.getText());
        driver.get("http://the-internet.herokuapp.com/iframe");
        WebElement d5 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe")));
        driver.switchTo().frame(d5);
        WebElement d6 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='tinymce']/p")));
        d6.clear();
        driver.switchTo().defaultContent();
        WebElement d7 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='tinymce']/p")));
        System.out.println(d7.getText());*/
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement d8 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Click for JS Alert')]")));
        d8.click();
        Alert a = driver.switchTo().alert();
        a.accept();
        WebElement d9 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Click for JS Confirm')]")));
        d9.click();
        Alert a2 = driver.switchTo().alert();
        sleep();
        a2.dismiss();
        sleep();
        WebElement d10 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Click for JS Prompt')]")));
        d10.click();
        sleep();
        Alert a3 = driver.switchTo().alert();
        sleep();
        a3.sendKeys("test");
        a3.accept();
    }

    private static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
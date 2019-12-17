package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyStorePage {

    private By popularLocator = By.xpath("//*[contains(text(), 'Popular')]");
    private By bestsellersLocator = By.xpath("//*[contains(text(), 'Best Sellers')]");
    private By itemLocator = By.xpath("//div[@class='product-container']");

    private final WebDriver driver;

    public MyStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public MyStorePage switchToPopular() {
        WebElement d = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(popularLocator));
        d.click();
        return this;
    }

    public MyStorePage switchToBestSelles() {
        WebElement d = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(bestsellersLocator));
        d.click();
        return this;
    }

    public void findItem(String name) {
        List<WebElement> l = driver.findElements(itemLocator);
        for (int i = 0; i < l.size(); i++) {
            WebElement parent = l.get(i);
            Item e = new Item(driver,parent);
            if (e.getTitle().equals(name)){

            }
        }
    }
}

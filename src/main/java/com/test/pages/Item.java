package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Item {

    private By addToCartButtonLocator = By.xpath(".//span[contains(text(), 'Add to cart')]");
    private By price = By.xpath("//span[@itemprop='price']");
    private By name = By.xpath(".//a[@class='product-name']");
    private By moreButtonLocator = By.xpath("//span[contains(text(), 'More')]");
    private WebElement parent;

    public Item(WebElement parent) {
        this.parent = parent;
    }

    public String getTitle() {
        WebElement d = parent.findElement(name);
        return d.getText();
    }

    public String getPrice() {
        WebElement d = parent.findElement(price);
        return d.getText();
    }

    public Item addToCart() {
        WebElement d = parent.findElement(addToCartButtonLocator);
        d.click();
        return this;
    }

    public Item viewFullPage() {
        WebElement d = parent.findElement(moreButtonLocator);
        d.click();
        return this;
    }
}

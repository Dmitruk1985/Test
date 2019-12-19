package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPanel extends AbstractPage {

    private By womenLocator = By.xpath(".//a[@title='Women']");
    private By blousesLocator = By.xpath(".//a[@title='Blouses']");


    public NavigationPanel switchToWomen() {
        WebElement d = driver.findElement(womenLocator);
        Actions a = new Actions(driver);
        a.moveToElement(d).perform();
        return this;
    }

    public NavigationPanel switchToBlouses() {
        WebElement d = driver.findElement(blousesLocator);
        d.click();
        return this;
    }
}

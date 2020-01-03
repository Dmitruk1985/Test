package com.test.pages;

import com.test.utils.Waiter;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyStorePage extends AbstractPage {

    @FindBy(xpath = "//*[contains(text(), 'Popular')]")
    private WebElement popularLocator;

    @FindBy(xpath = "//*[contains(text(), 'Best Sellers')]")
    private WebElement bestsellersLocator;

    @FindBy(xpath = "//div[@class='product-container']")
    private List<WebElement> itemLocator;

    private By womenLocator = By.xpath(".//a[@title='Women']");


     public MyStorePage switchToPopular() {
        popularLocator.click();
        return this;
    }


    public MyStorePage switchToBestSelles() {
        bestsellersLocator.click();
        return this;
    }

    @Step("Находим элемент [{0}]")
    public Item findItem(String name) {
        for (int i = 0; i < itemLocator.size(); i++) {
            WebElement parent = itemLocator.get(i);
            Item e = new Item(parent);
            //  System.out.println(e.getTitle());
            if (e.getTitle().equals(name)) {
                return e;
            }
        }
        throw new RuntimeException("Нет пліткі с такім названіем: " + name);
    }
}

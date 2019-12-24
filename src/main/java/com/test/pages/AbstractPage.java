package com.test.pages;

import com.test.core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected final WebDriver driver;

    public AbstractPage() {
        this.driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
    }

}

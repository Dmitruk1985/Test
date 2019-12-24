package com.test;

import com.test.core.Driver;
import com.test.pages.Item;
import com.test.pages.MyStorePage;
import com.test.pages.NavigationPanel;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {
    public static void main(String[] arg) {

        Driver.getInstance().get("http://automationpractice.com/index.php");

        MyStorePage m = new MyStorePage();
       // m.switchToBestSelles();
       Item i = m.findItem("Blouse");
       i.addToCart();
      /*m.switchToWomen();
        NavigationPanel n = new NavigationPanel(driver);
        n.switchToWomen();
        n.switchToBlouses();*/
    }
}

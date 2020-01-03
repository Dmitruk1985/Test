package com.test;

import com.test.core.Driver;
import com.test.pages.Item;
import com.test.pages.MyStorePage;
import org.junit.jupiter.api.*;

public class Main3Test {

    @BeforeAll
    static void openDriver() {
        Driver.getInstance().get("http://automationpractice.com/index.php");
    }
    @Test
    @DisplayName("Мой тест")
    @Tag("NewFeature")
   // @Disabled("Тест отменен")
    public void test() {

        MyStorePage m = new MyStorePage();
       // m.switchToBestSelles();
       Item i = m.findItem("Blouse");
       i.addToCart();
      /*m.switchToWomen();
        NavigationPanel n = new NavigationPanel(driver);
        n.switchToWomen();
        n.switchToBlouses();*/
         }

    @AfterAll
    static void closeDriver() {
//        Driver.quitDriver();
    }
}


package com.test;

import com.test.core.Driver;
import org.junit.jupiter.api.Test;

public class Main4Test {
    @Test
    public void openDriver() {
        Driver.getInstance().get("http://automationpractice.com/index.php");
}

}

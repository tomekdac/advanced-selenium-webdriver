package com.herokuapp.theinternet.keypressestest;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeypressesTests extends BaseTest {
    @Test
    public void pressKeyTest() {
        log.info("Starting pressKeyTest");

        KeyPressesPage keyPressesPage = new KeyPressesPage(driver, log);
        keyPressesPage.openPage();

        keyPressesPage.pressKey(Keys.ENTER);
        String result = keyPressesPage.getResultText();

        Assert.assertEquals(result, "You entered: ENTER", "Result is not expected: " + result);
    }

    @Test
    public void pressKeyWithActionTest() {
        log.info("Starting pressKeyWithActionTest");

        KeyPressesPage keyPressesPage = new KeyPressesPage(driver, log);
        keyPressesPage.openPage();

        keyPressesPage.pressKeyWithActions(Keys.ENTER);
        String result = keyPressesPage.getResultText();

        Assert.assertEquals(result, "You entered: ENTER", "Result is not expected: " + result);
    }
}

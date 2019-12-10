package com.herokuapp.theinternet.windowstests;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import com.herokuapp.theinternet.pages.WindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTests extends BaseTest {
    @Test
    public void newWindowTest() {
        log.info("Starting newWindowTest");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        WindowsPage windowsPage = welcomePage.clickMultipleWindowsLink();

        NewWindowPage newWindowPage = windowsPage.openNewWindow();

        String pageSource = newWindowPage.getCurrentPageSource();

        Assert.assertTrue(pageSource.contains("New Window"), "New page source doesn't contains New Window");
    }

}

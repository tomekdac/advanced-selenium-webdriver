package com.herokuapp.theinternet.checkboxespagetests;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.CheckboxesPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTests extends BaseTest {
    @Test
    public void selectingTwoCheckboxesTest() {
        log.info("Starting selectingTwoCheckboxesTest");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();
        checkboxesPage.selectAllCheckboxes();

        Assert.assertTrue(checkboxesPage.areAllCheckboxesChecked(), "Not all checkboxes checked");
    }
}

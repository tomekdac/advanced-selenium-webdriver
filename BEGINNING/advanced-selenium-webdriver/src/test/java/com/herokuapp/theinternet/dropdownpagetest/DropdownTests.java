package com.herokuapp.theinternet.dropdownpagetest;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTest {
    @Test
    public void optionTwoTest() {
        log.info("Starting optionTwoTest");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        DropdownPage dropdownPage = welcomePage.clickDropdownLink();
        dropdownPage.selectOption(2);

        String selectedOption = dropdownPage.getSelectedOption();

        Assert.assertEquals(selectedOption, "Option 2", "Option 2 is not selected. Instead selected - " + selectedOption);
    }
}

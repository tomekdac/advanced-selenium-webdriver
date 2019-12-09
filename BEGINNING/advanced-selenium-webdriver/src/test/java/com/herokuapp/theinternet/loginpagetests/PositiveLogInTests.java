package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.LogInPage;
import com.herokuapp.theinternet.pages.SecureAreaPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLogInTests extends BaseTest {

    @Test
    public void logInTest() {
        log.info("Starting logIn test");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        LogInPage loginPage = welcomePage.clickFormAuthenticationLink();

        SecureAreaPage secureAreaPage = loginPage.logIn("tomsmith", "SuperSecretPassword!");

        // verifications
        Assert.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getPageUrl());

        // log out button is visible
        Assert.assertTrue(secureAreaPage.isLogOutButtonVisible(),
                "logOutButton is not visible.");

        // Successful log in message
        String expectedSuccessMessage = "You logged into a secure area!";
		String actualSuccessMessage = secureAreaPage.getSuccessMessageText();
        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
                        + expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);

    }
}

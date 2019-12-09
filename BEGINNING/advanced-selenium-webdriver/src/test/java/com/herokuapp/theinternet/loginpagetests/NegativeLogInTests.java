package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.LogInPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeLogInTests extends BaseTest {

	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1)
	public void negativeTest(String username, String password, String expectedErrorMessage) {
		log.info("Starting negativeTest");

		WelcomePage welcomePage = new WelcomePage(driver, log);
		welcomePage.openPage();

		LogInPage loginPage = welcomePage.clickFormAuthenticationLink();
		loginPage.negativeLogIn(username, password);
		// Verification
		String actualErrorMessage = loginPage.getErrorMessage();
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"actualErrorMessage does not contain expectedErrorMessage\nexpectedErrorMessage: "
						+ expectedErrorMessage + "\nactualErrorMessage: " + actualErrorMessage);
	}


}

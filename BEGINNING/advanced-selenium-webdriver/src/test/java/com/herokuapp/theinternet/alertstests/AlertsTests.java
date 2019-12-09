package com.herokuapp.theinternet.alertstests;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.JavaScriptAlertsPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest {
    @Test
    public void jsAlertTest() {
        log.info("Starting jsAlertTest");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        JavaScriptAlertsPage alertsPage = welcomePage.clickJSAlertsLink();
        alertsPage.openJSAlert();
        String alertMessage = alertsPage.getAlertText();

        alertsPage.acceptAlert();
        String result = alertsPage.getResultText();

        Assert.assertEquals(alertMessage, "I am a JS Alert", "Alert message is not expected");
        Assert.assertEquals(result, "You successfuly clicked an alert", "Result is not expected");
    }

    @Test
    public void jsDismissTest() {
        log.info("Starting jsDismissTest");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        JavaScriptAlertsPage alertsPage = welcomePage.clickJSAlertsLink();
        alertsPage.openJSConfirm();
        String alertMessage = alertsPage.getAlertText();

        alertsPage.dismissAlert();
        String result = alertsPage.getResultText();

        Assert.assertEquals(alertMessage, "I am a JS Confirm", "Alert message is not expected");
        Assert.assertEquals(result, "You clicked: Cancel", "Result is not expected");
    }

    @Test
    public void jsPromptTest() {
        log.info("Starting jsPromptTest");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        JavaScriptAlertsPage alertsPage = welcomePage.clickJSAlertsLink();
        alertsPage.openJSPrompt();
        String alertMessage = alertsPage.getAlertText();

        alertsPage.typeTextIntoAlert("Hello Alert!");

        String result = alertsPage.getResultText();

        Assert.assertEquals(alertMessage, "I am a JS prompt", "Alert message is not expected");
        Assert.assertEquals(result, "You entered: Hello Alert!", "Result is not expected");
    }
}

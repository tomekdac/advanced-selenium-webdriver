package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureAreaPage extends BasePageObject {
    private  String pageUrl = "https://the-internet.herokuapp.com/secure";

    By logOutButtonLocator = By.xpath("//a[@class='button secondary radius']");
    By successMessageLocator = By.id("flash");

    public SecureAreaPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public boolean isLogOutButtonVisible() {
        return find(logOutButtonLocator).isDisplayed();
    }

    public String getSuccessMessageText() {
        return find(successMessageLocator).getText();
    }

}

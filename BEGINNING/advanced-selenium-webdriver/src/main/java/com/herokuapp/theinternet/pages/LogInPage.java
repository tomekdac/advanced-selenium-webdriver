package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePageObject {

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By logInButtonLocator = By.tagName("button");

    private By errorMessageLocator = By.id("flash");


    public LogInPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public SecureAreaPage logIn(String username, String password) {
        log.info("Executing LogIn with username [" + username + "] and password [" + password + "]");
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);

        return new SecureAreaPage(driver, log);
    }

    public void negativeLogIn(String username, String password) {
        log.info("Executing NegativeLogIn with username [" + username + "] and password [" + password + "]");
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
    }


    public String getErrorMessage() {
        return find(errorMessageLocator).getText();
    }

}

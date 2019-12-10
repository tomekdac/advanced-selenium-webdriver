package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

    private String pageUrl = "https://the-internet.herokuapp.com/";

    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
    private By checkboxesLocator = By.linkText("Checkboxes");
    private By dropdownLocator = By.linkText("Dropdown");
    private By jSAlertsLocator = By.linkText("JavaScript Alerts");
    private By multipleWindowsLocator = By.linkText("Multiple Windows");

    public WelcomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public LogInPage clickFormAuthenticationLink() {
        log.info("Clicking Form Authentication Link");
        click(formAuthenticationLinkLocator);
        return new LogInPage(driver, log);
    }

    public CheckboxesPage clickCheckboxesLink() {
        log.info("Clicking Checkboxes Link");
        click(checkboxesLocator);
        return new CheckboxesPage(driver, log);
    }

    public DropdownPage clickDropdownLink() {
        log.info("Clicking Dropdown Link");
        click(dropdownLocator);
        return new DropdownPage(driver, log);
    }

    public JavaScriptAlertsPage clickJSAlertsLink() {
        log.info("Clicking JSAlerts Link");
        click(jSAlertsLocator);
        return new JavaScriptAlertsPage(driver, log);
    }

    public WindowsPage clickMultipleWindowsLink() {
        log.info("Clicking Multiple Windows Link");
        click(multipleWindowsLocator);
        return new WindowsPage(driver, log);
    }

}

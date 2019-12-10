package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsPage extends BasePageObject {
    private By newWindowLinkLocator = By.linkText("Click Here");

    public WindowsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public NewWindowPage openNewWindow() {
        log.info("Clicking for 'New Window' page and switching to new page");
        clickAndSwitchToNewPage(newWindowLinkLocator);
        return new NewWindowPage(driver, log);
    }

}

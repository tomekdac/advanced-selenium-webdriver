package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage extends BasePageObject {
    private By checkboxLocator = By.xpath("//input[@type='checkbox']");

    public CheckboxesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectAllCheckboxes() {
        log.info("Checking all unchecked checkboxes");
        findAll(checkboxLocator).stream()
                .filter(webElement -> !webElement.isSelected())
                .forEach(WebElement::click);
    }

    public boolean areAllCheckboxesChecked() {
        log.info("Verifying that all checkboxes are checked");
        return findAll(checkboxLocator).stream()
                .allMatch(WebElement::isSelected);
    }
}

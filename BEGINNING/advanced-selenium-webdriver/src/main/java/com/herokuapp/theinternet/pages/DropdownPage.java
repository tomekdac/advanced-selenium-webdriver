package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePageObject {
    private By dropdownElementSelector = By.id("dropdown");

    public DropdownPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectOption(int option) {
        log.info("Selecting option " + option + " from dropdown");
        WebElement dropdownElement = find(dropdownElementSelector);
        Select dropdown = new Select(dropdownElement);

        dropdown.selectByIndex(option);
        //dropdown.selectByValue(String.valueOf(option));

    }

    public String getSelectedOption() {
        WebElement dropdownElement = find(dropdownElementSelector);
        Select dropdown = new Select(dropdownElement);
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        log.info(selectedOption + " is selected in dropdown");
        return selectedOption;
    }
}

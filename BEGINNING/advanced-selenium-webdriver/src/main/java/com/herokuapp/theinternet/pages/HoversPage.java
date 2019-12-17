package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HoversPage extends BasePageObject {

    private String pageUrl = "https://the-internet.herokuapp.com/hovers";
    private By avatarLocator = By.cssSelector("div.figure");
    private By viewProfileLinkLocator = By.linkText("View profile");
//    private By viewProfileLinkLocator = By.xpath(".//a[contains(text(), 'View profile')]");

    public HoversPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public void openUserProfile(int i) {
        List<WebElement> avatars = findAll(avatarLocator);
        WebElement specifiedUserAvatar = avatars.get(i - 1);
        hoverOver(specifiedUserAvatar);
        specifiedUserAvatar.findElement(viewProfileLinkLocator).click();
    }

}

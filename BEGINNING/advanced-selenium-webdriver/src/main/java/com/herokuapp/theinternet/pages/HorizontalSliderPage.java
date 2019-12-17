package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage extends BasePageObject {

    private String pageUrl = "https://the-internet.herokuapp.com/horizontal_slider";

    private By sliderLocator = By.xpath("//input[@type='range']");
    private By sliderValueLocator = By.id("range");

    public HorizontalSliderPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public void slideTo(String value) {
        log.info("Moving slider to: " + value);
        WebElement slider = find(sliderLocator);
        int sliderWidth = slider.getSize().getWidth();
        double percent = Double.parseDouble(value) / 5.0;
        double xMove = percent * sliderWidth;
        int xOffset = (int) (xMove - sliderWidth / 2);
        (new Actions(driver)).dragAndDropBy(slider, xOffset, 0).build().perform();
    }

    public String getSliderValue() {
        return find(sliderValueLocator).getText();
    }
}

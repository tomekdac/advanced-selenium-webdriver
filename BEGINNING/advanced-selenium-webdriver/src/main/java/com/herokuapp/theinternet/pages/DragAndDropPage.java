package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends BasePageObject {

    private String pageUrl = "https://the-internet.herokuapp.com/drag_and_drop";
    private By columnALocator = By.xpath("//*[@id='column-a']");
    private By columnBLocator = By.xpath("//*[@id='column-b']");

    public DragAndDropPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public void dragAtoB() {
        performDragAndDrop(columnALocator, columnBLocator);
    }

    public void dragBtoA() {
        performDragAndDrop(columnBLocator, columnALocator);
    }

    public String getColumnAText() {
        String text = find(columnALocator).getText();
        log.info("Column A text is: " + text);
        return text;
    }

    public String getColumnBText() {
        String text = find(columnBLocator).getText();
        log.info("Column B text is: " + text);
        return text;
    }


}

package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage extends BasePageObject {

    private String pageUrl = "https://the-internet.herokuapp.com/upload";

    private By chooseFileFieldLocator = By.id("file-upload");
    private By uploadButtonLocator = By.id("file-submit");
    private By uploadedFilesLocator = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public void selectFile(String filename) {
        log.info("Selecting file [" + filename + "] from files folder");
        String filePath = System.getProperty("user.dir") + "//src//main//resources//files//" + filename;
        type(filePath, chooseFileFieldLocator);

    }

    public void pushUploadButton() {
        log.info("Pushing upload button");
        click(uploadButtonLocator);
    }

    public String getUploadedFilesNames() {
        String names = find(uploadedFilesLocator).getText();
        log.info("Uploaded files: " + names);
        return names;
    }
}

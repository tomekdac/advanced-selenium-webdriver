package com.herokuapp.theinternet.fileuploadertest;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.FileUploaderPage;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploaderTests extends BaseTest {
    @Test
    public void imageUploadTest() {
        log.info("Starting imageUploadTest");

        FileUploaderPage fileUploaderPage = new FileUploaderPage(driver, log);
        fileUploaderPage.openPage();

        String fileName = "logo.png";
        fileUploaderPage.selectFile(fileName);

        fileUploaderPage.pushUploadButton();

        String fileNames = fileUploaderPage.getUploadedFilesNames();

        Assert.assertTrue(fileNames.contains(fileName), "Our file [" + fileName + "] is not one of uploaded (" + fileNames + ").");
    }

}

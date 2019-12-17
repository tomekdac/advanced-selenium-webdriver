package com.herokuapp.theinternet.hoverstest;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.DragAndDropPage;
import com.herokuapp.theinternet.pages.HoversPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTests extends BaseTest {
    @Test
    public void user2profileTest() {
        log.info("Starting user2profileTest");

        HoversPage hoversPage = new HoversPage(driver, log);
        hoversPage.openPage();

        hoversPage.openUserProfile(2);

        Assert.assertTrue(hoversPage.getCurrentUrl().contains("/users/2"), "URL of opened page is not expected user 2 url");

    }

}

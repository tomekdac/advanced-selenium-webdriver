package com.herokuapp.theinternet.slidertests;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;
import com.herokuapp.theinternet.pages.HoversPage;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SliderTests extends BaseTest {
    @Test()
    @Parameters({"value"})
    public void horizontalSliderTest(@Optional("3.5") String value) {
        log.info("Starting horizontalSliderTest");

        HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage(driver, log);
        horizontalSliderPage.openPage();

        sleep(2000);
        horizontalSliderPage.slideTo(value);
        sleep(2000);

        Assert.assertEquals(horizontalSliderPage.getSliderValue(), value, "Slider value");
    }

}

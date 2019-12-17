package com.herokuapp.theinternet.draganddroptests;

import com.herokuapp.theinternet.base.BaseTest;
import com.herokuapp.theinternet.pages.DragAndDropPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTests extends BaseTest {
    @Test
    public void dragAToBTest() {
        log.info("Starting dragAToBTest");

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver, log);
        dragAndDropPage.openPage();

        dragAndDropPage.dragAtoB();

        String columnAText = dragAndDropPage.getColumnAText();
        Assert.assertEquals(columnAText, "B", "Column A text should be B, instead is: " + columnAText);

        String columnBText = dragAndDropPage.getColumnBText();
        Assert.assertEquals(columnBText, "A", "Column B text should be A, instead is: " + columnBText);

    }

    @Test
    public void dragBToATest() {
        log.info("Starting dragBToATest");

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver, log);
        dragAndDropPage.openPage();

        dragAndDropPage.dragBtoA();

        String columnAText = dragAndDropPage.getColumnAText();
        Assert.assertEquals(columnAText, "B", "Column A text should be B, instead is: " + columnAText);

        String columnBText = dragAndDropPage.getColumnBText();
        Assert.assertEquals(columnBText, "A", "Column B text should be A, instead is: " + columnBText);

    }

}

package com.herokuapp.theinternet.base;

public class TestUtilities {

    /**
     * static sleep
     */
    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

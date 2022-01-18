package com.myfirstproject;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day07_Actions4 extends TestBase {

//scroll up and down ACTIONS AWESOME

    /*
    Create a class: ActionClass4
Create test method : scrollUpDown()
Go to amazon
Scroll the page down
Scroll the page up
     */

    @Test
    public void scrollUpDown() throws InterruptedException {

        driver.get("https://www.amazon.com");
        //we want to scroll up and down
        Thread.sleep(3000);

        //        1. create actions
        Actions actions = new Actions(driver);

//        2. use proper actions method

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();// scrolling page down
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();// scrolling page down

//    ARROW_DOWN moving page down a little bit.

        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();// scrolling page down
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();// scrolling page down


//        PAGE_UP and ARROW_UP is used to move the pages up

//        ARROW_UP move a little

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();// scrolling page down
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_UP).perform();// scrolling page down

    }
}

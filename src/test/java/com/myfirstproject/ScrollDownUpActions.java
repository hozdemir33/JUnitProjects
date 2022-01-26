package com.myfirstproject;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ScrollDownUpActions extends TestBase {
    @Test
    public void ScrollUpDownActions1(){
      driver.get("https://www.amazon.com");

        //1.step create an ACTIONS CLASS

        Actions actions=new Actions(driver);

        //2. use proper actions method

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.UP).sendKeys(Keys.UP).sendKeys(Keys.UP).perform();



    }
}

package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;

public class Day07_Action02 extends TestBase {


    @Test
    public void hoverOver() throws InterruptedException {
        driver.get("https://www.amazon.com");

        WebElement accountList= driver.findElement(By.id("nav-link-accountList"));

        //1.Create actions class
        Actions actions=new Actions(driver);
        //2.Use proper actions method
        actions.moveToElement(accountList).perform();

        //click on Account option
      driver.findElement(By.linkText("Account")).click();
       Thread.sleep(3000);
      //  Then verify the page title contains "Your Account"
        Assert.assertEquals("Your Account", driver.getTitle());

    }

}

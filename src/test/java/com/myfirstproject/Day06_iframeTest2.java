package com.myfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day06_iframeTest2 {

    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }
    @Test
    public void iframeSize(){
    // Go to amazon
    //print the number of iframe
//        Go to amazon
//        print the number of iframe
        int numberOfFrame = driver.findElements(By.tagName("iframe")).size();
        System.out.println(numberOfFrame);

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
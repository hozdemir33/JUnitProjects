package com.myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Day07_WebDriverManager {

    WebDriver driver;
    @Before
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
//        From now on, we will USE WebDriverManager.chromedriver().setup();
//        WebDriverManager.chromedriver().setup(); calls and setup the driver
//        This is more efficient, no need to give path, automatically use driver related files
//        easy to use it. Easy to CREATE a different driver.

        WebDriverManager.chromedriver().setup();

        //   Below will run headless.
        //   You will not see the browser opened.
        //   But test will execute

        driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        }
      @Test
    public void test(){

        driver.get("https://www.google.com");
          System.out.println(driver.getTitle());

      }
    }


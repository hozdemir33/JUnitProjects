package com.myfirstproject;


import com.github.javafaker.Faker;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FaceBookPractice {
    WebDriver driver;
    Faker faker=new Faker();
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void practiceRadioBotton(){
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(faker.name().firstName());
        driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());

        driver.findElement(By.name("reg_email__")).sendKeys("hulu@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hulu@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Mazda!");

        //Month
       WebElement month= driver.findElement(By.id("month"));
       Select selectedMonth=new Select(month);
       selectedMonth.selectByVisibleText("Nov");

       //Day
      WebElement day= driver.findElement(By.id("day"));
      Select selectedDay=new Select(day);
      selectedDay.selectByIndex(30);

      //Year
        WebElement year= driver.findElement(By.id("year"));
        Select selectedYear=new Select(year);
        selectedYear.selectByValue("1985");

       //pick a gender--MALE

       driver.findElement(By.xpath("//input[@value='2']")).click();

       //Sign Up botton
       driver.findElement(By.name("websubmit")).click();


    }
}

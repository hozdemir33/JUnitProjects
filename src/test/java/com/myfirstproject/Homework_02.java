package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Homework_02 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        //log in button

        driver.findElement(By.id("login-button")).click();

       String actualnn= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
       String expectednn="PRODUCTS";

        //And verify the "Products" is displayed on the page
        Assert.assertEquals("PRODUCTS",actualnn);


       // And Get all the prices on a list

       List<WebElement> totalPrices= driver.findElements(By.xpath("//div[@class='inventory_item_price']"));





       // The verifies the minimum price is greater than $5 The verifies the maximum price is less than $50









    }
}

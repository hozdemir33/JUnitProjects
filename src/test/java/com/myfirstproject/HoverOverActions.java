package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class HoverOverActions extends TestBase {

    @Test
    public void hoverOver1() throws InterruptedException {

        driver.get("https://www.amazon.com");

        WebElement accountId=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Thread.sleep(3000);
        Actions actions= new Actions(driver);
        Thread.sleep(3000);
        actions.contextClick(accountId).perform();

    }

    @Test
    public void hoverOver2(){
      driver.get("https://www.amazon.com");
        WebElement secondElement=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
        Actions actions=new Actions(driver);
        actions.contextClick(secondElement).perform();

    }
}

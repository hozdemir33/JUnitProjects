package com.myfirstproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class KeysUPdownActions extends TestBase {

    @Test
    public void KeyUpDown1() throws InterruptedException {

        driver.get("https://www.amazon.com");

         //        Send iPhone X prices => convert small letter capital vice versa.
         //        Highlight the search box by double clicking
         //        searchBox.sendKeys("iPhone X prices");

        WebElement elementSearch=driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.keyDown(elementSearch, Keys.SHIFT).sendKeys("iphone xr prices").keyUp(elementSearch,Keys.SHIFT).sendKeys(Keys.ENTER).perform();

    }

    @Test
    public void KeyUpDown2() throws InterruptedException {
        driver.get("https://www.google.com");
        WebElement searchElement=  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        Thread.sleep(3000);
        actions.keyDown(searchElement,Keys.SHIFT).sendKeys("hello yusuf and burak:)").
                keyUp(searchElement,Keys.SHIFT).sendKeys(Keys.ENTER).
                perform();

    }

    @Test
    public void KeyUpDown3() {

        driver.get("https://www.yahoo.com/");
        WebElement elements3= driver.findElement(By.id("ybar-sbq"));
        Actions actions=new Actions(driver);
        actions.keyDown(elements3,Keys.SHIFT).sendKeys("hello monicopnoitonoiijn jeokmdm").
                keyUp(elements3, Keys.SHIFT).sendKeys(Keys.ENTER).
                perform();

    }

    @Test
    public void KeyupDown4(){
        driver.get("https://www.nvenergy.com/");
        WebElement elementSearch4=driver.findElement(By.xpath("/html/body/ion-app/ng-component/div[2]/div/nve-header/div[2]/div/div/nve-search/div[2]/nve-swift-search-box/div/div[2]/input"));

        Actions actions=new Actions(driver);
        actions.keyDown(elementSearch4,Keys.SHIFT).sendKeys("hello nv energy we do not need to have any poweroutages").
                keyUp(elementSearch4,Keys.SHIFT).sendKeys(Keys.ENTER).perform();

    }
}

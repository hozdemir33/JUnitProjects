package HomeworkPractices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class PracticeSynschronzation extends TestBase {


    @Test
    public void test1(){

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //        Click on remove button
           driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
       //        And verify the message is equal to “It's gone!”

      String actualMesage=  driver.findElement(By.id("message")).getText();
      String expectedMesaage="It's gone!";

     //skipping the wait time-BY USING THE WEBDRIVERWAIT

          WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

          WebElement goneMessage  =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
          String meesage=goneMessage.getText();
          Assert.assertEquals("It's gone!",meesage);
          //       Then click on Add button

         driver.findElement(By.xpath("//button[@type='button'][1]")).click();
//
//        //        And verify the message is equal to “It's back!”

                WebElement nn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));

                String nmo=nn.getText();

                Assert.assertEquals("It's back!",nmo);//PERFECT IT WORKED....




    }
}

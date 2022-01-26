package com.myfirstproject;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class screenshotpractice extends TestBase {

    @Test
    public void screenShot() throws IOException, InterruptedException {

        driver.get("https://commons.wikimedia.org/wiki/File:Adidas_Logo.svg");

          WebElement addidasLogo= driver.findElement(By.xpath("//*[@id=\"file\"]/a/img"));
          Thread.sleep(3000);
          File finalpath=  addidasLogo.getScreenshotAs(OutputType.FILE);
          Thread.sleep(3000);
          File addidasLogoImage=addidasLogo.getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(addidasLogoImage,finalpath);

    }
}

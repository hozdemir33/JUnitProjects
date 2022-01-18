package com.myfirstproject;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class Day09_ScreenshotSel4 extends TestBase {

    @Test
    public void takeScreenShotTest() throws IOException {

        driver.get("https://www.google.com");

        //get the screenshot of the only the Google LOGO

        WebElement googleLogo=driver.findElement(By.xpath("//img[@class='lnXdpd']"));

        File finalPath = googleLogo.getScreenshotAs(OutputType.FILE);

        File googleLogoImage=googleLogo.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(googleLogoImage,finalPath);


    }
}

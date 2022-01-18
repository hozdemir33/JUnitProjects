package com.myfirstproject;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.time.Duration;

public class Day06_NewTabsSel4 {

    @Test
    public void newTabs() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    //1.open google in the tab 1
     driver.get("https://www.google.com");
     String googleWindowHandle= driver.getWindowHandle();

     //2. open amazon in the tab 2
        // open a new EMPTY Tab
        WebDriver amazonTab= driver.switchTo().newWindow(WindowType.TAB);
        amazonTab.get("https://www.amazon.com");
        String amazonWindowHandle=driver.getWindowHandle();


        //3. open linkedin in a new tab

        //create a new empty tab and swithch to that tab autmatically
        WebDriver linkedINTab=driver.switchTo().newWindow(WindowType.TAB);
        linkedINTab.get("https://www.linkedin.com");


        //4th one CNBC.COM IN A NEW TAB

             WebDriver newTAB4= driver.switchTo().newWindow(WindowType.TAB);
               newTAB4.get("https://www.cnbc.com/");


        
        //getting the window handle of that window b/c i am working on multiple tabs

        String linkedInWindowHandle=driver.getWindowHandle();



//      Switching back to google tab
        Thread.sleep(3000);
        driver.switchTo().window(googleWindowHandle);
        System.out.println("Google URL => "+driver.getCurrentUrl());

//      Switching back to amazon tab
        Thread.sleep(3000);
        driver.switchTo().window(amazonWindowHandle);
        System.out.println("Amazon URL => "+driver.getCurrentUrl());
//      Switching back to linkedin tab
        Thread.sleep(3000);
        driver.switchTo().window(linkedInWindowHandle);
        System.out.println("Linkedin URL => "+driver.getCurrentUrl());
    }
}
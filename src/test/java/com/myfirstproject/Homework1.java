package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework1 {

        WebDriver driver;
        Faker faker=new Faker();
        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");

        }
        @Test
    public void practice1() throws InterruptedException {
      //sign in botton
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

     //email and then click sign in
            driver.findElement(By.id("email_create")).sendKeys("mirsat@gmail.com");
            //5.Verify the Text : CREATE AN ACCOUNT


           String actualCreateBotton= driver.getTitle();
           String expectedCreatBotton="Create an account";
           if(actualCreateBotton.equals(expectedCreatBotton)){
               System.out.println("pass");
           } else{
               System.out.println("failed");
           }

           //6. Verify the Text : YOUR PERSONAL INFORMATION
            //click on create an account botton

            driver.findElement(By.name("SubmitCreate")).click();
         Thread.sleep(3000);
         String actualPersonalInformation=  driver.getPageSource();
         String expectedPersonalInformation="Your personal information";

         if(actualPersonalInformation.equals(expectedPersonalInformation)){
             System.out.println("pass");
         } else{
             System.out.println("fail");
         }

         //7th step. verifying the 'title'
           String actualtitle= driver.getPageSource();
           String expectedttitle="Title";
           if(actualtitle.equals(expectedttitle)){
               System.out.println("pass");
           } else{
               System.out.println("fail");
           }

           //8. Select your title
           driver.findElement(By.id("id_gender1")).click();

            //chose title Mr.


           //first name
            driver.findElement(By.id("customer_firstname")).sendKeys(faker.name().firstName());
           //last name
            driver.findElement(By.id("customer_lastname")).sendKeys(faker.name().lastName());
            //11.enter email is already done
            //12. Enter your password
            driver.findElement(By.id("passwd")).sendKeys("Mazza1!");

            //13. ENTER DATE OF BIRTH

          // select  'day'

            WebElement days= driver.findElement(By.id("days"));
            Select selecteddays=new Select(days);
            selecteddays.selectByIndex(10);

            //select 'month'
            WebElement month= driver.findElement(By.id("months"));
            Select selectedMonth=new Select(month);
            selectedMonth.selectByIndex(10);

            // select 'year'
            WebElement year= driver.findElement(By.id("years"));
            Select selectedYear=new Select(year);
            selectedYear.selectByIndex(10);

           //14. Click on Sign up for our newsletter!

            driver.findElement(By.id("newsletter")).click();

            //15. Enter your first name

            driver.findElement(By.id("firstname")).sendKeys(faker.name().firstName());

            //16. Enter your last lane

            driver.findElement(By.id("lastname")).sendKeys(faker.name().lastName());

          //  17. Enter your company
            driver.findElement(By.id("company")).sendKeys("Hamdullahefendisutmamulleri");

            //  18. Enter your Address 19. Enter your City

            driver.findElement(By.id("address1")).sendKeys("9871 caccuun st");

            //SELECT THE CITY
            driver.findElement(By.id("city")).sendKeys("JACKSONVILLE");

            //20. SELECT STATE
          WebElement state= driver.findElement(By.id("id_state"));
          Select selectedState= new Select(state);
          selectedState.selectByVisibleText("Utah");

          //zip code:

            driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("89340");
           Thread.sleep(3000);
            //country

             WebElement country   = driver.findElement(By.id("id_country"));
             Select selectedCountry=new Select(country);
             selectedCountry.selectByValue("21");

             //additional infor

            driver.findElement(By.xpath("//*[@id='other']")).sendKeys("Selenium is fun");

             //23. Enter additional information//skipped this step was not sure


            //  24. Enter home phone

            driver.findElement(By.id("phone")).sendKeys(faker.phoneNumber().cellPhone());
            Thread.sleep(2000);

            //  25. Enter mobile phone
            driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("755787322");
            Thread.sleep(3000);

            //address

            driver.findElement(By.xpath("//*[@id='alias']")).sendKeys(faker.address().streetAddress());


            //Create Botton

            driver.findElement(By.xpath("//*[@id='submitAccount']")).click();

            // Then verify MY ACCOUNT is displayed on the home page-SEE BELOW iMAGE

                 boolean title= driver.getPageSource().contains("title");
                 Assert.assertTrue(title);

        }
        @After
    public void tearDown(){

            driver.quit();
        }

}

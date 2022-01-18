package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day08_AuthenticationTest extends TestBase {

    @Test
    public void basicAuth(){

        // Authentication is done for verification
        //   https://username:password@URL

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//log in

        ////        Verifying the login is successful

            String congratMessage= driver.findElement(By.xpath("//p")).getText();
            Assert.assertTrue(congratMessage.contains("Congratulations!"));

    }
}

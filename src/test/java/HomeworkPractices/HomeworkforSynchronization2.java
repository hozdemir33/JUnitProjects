package HomeworkPractices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class HomeworkforSynchronization2 extends TestBase {

     /*
Create a class:Synchronization2. Create a method: isEnabled--done
Go to https://the-internet.herokuapp.com/dynamic_controls--done
Click enable Button--done
And verify the message is equal to “It's enabled!” --done

And verify the textbox is enabled (I can type in the box)

And click on Disable button

And verify the message is equal to “It's disabled!”

And verify the textbox is disabled (I cannot type in the box)

NOTE: .isEnabled(); is used to check if an element is enabled or not

//SOLUTION WILL BE SHARED.

     */

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

       // Click enable Button
         driver.findElement(By.xpath("//*[@id='input-example']/button")).click();


      //  And verify the message is equal to “It's enabled!”
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement KL =   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            String nn= KL.getText();

            Assert.assertEquals("It's enabled!",nn);


            //And verify the textbox is enabled (I can type in the box)

             boolean verfbox= driver.findElement(By.xpath("//*[@id='input-example']/input")).isEnabled();
             Assert.assertTrue(verfbox);

      //  And click on Disable button

//        And click on Disable button

        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();

        //        And verify the message is equal to "It's disabled!"

        WebElement verify = driver.findElement(By.id("message"));
        String verifyText = verify.getText();
        Assert.assertEquals("It's disabled!",verifyText);

        //        And verify the textbox is disabled (I cannot type in the box)

        boolean texBox = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).isEnabled();
         Assert.assertFalse(texBox);


    }
}

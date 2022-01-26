package com.myfirstproject;


import org.checkerframework.framework.qual.EnsuresQualifier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class Homework3 extends TestBase {

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://www.amazon.com");

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        System.out.println(dropdown);

        //Print the first selected option and

        Select selectFirstSelectedOption = new Select(dropdown);
        Thread.sleep(3000);
        // assert if it equals “All Departments”
        Assert.assertEquals("All Departments", selectFirstSelectedOption.getFirstSelectedOption().getText());

        //  Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you
        //   select you to need to use the get first selected option method)

        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
        select.selectByIndex(3);
        WebElement nn = select.getFirstSelectedOption();
        Thread.sleep(3000);
        String mn = nn.getText();
        Assert.assertNotEquals("Amazon Devices", mn);

        //print all dropdown options

        Select selectd = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));

        List<WebElement> sn = selectd.getOptions();
        int siz = sn.size();
        String options = null;
        for (int i = 0; i < siz; i++) {
            options = sn.get(i).getText();
            System.out.println(options);
        }

        //● Print the total number of options in the dropdown

        Select options1 = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
        List<WebElement> countsOptions = options1.getOptions();
        int size = countsOptions.size();
        String nanoOptions = null;
        for (int i = 0; i < size; i++) {
            nanoOptions = countsOptions.get(i).getText();

        }
        System.out.println(nanoOptions);//could not locate the total num

        //  Check if Appliances is a drop-down option. Print true if “Appliances” is an option. Print false
        //   otherwise.

        Select newSelectionAppliances = new Select(dropdown);
        newSelectionAppliances.selectByIndex(7);
        WebElement koko = newSelectionAppliances.getFirstSelectedOption();
        String nunu = koko.getText();

        if (koko.isDisplayed()) {
            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");

        }
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}


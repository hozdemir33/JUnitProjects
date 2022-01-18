package HomeworkPractices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import javax.swing.text.TableView;
import java.util.List;

public class day11WebTablesPractices extends TestBase {


    @Test
    public void webTables(){

       driver.get("https://the-internet.herokuapp.com/tables");

       //print the table

        WebElement entireTable= driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(entireTable.getText());

        //("***Print Table Rows***");

       List<WebElement> numOfrows=  driver.findElements(By.xpath("//table[@id='table1']//tr"));

       int rowNum=1;
       for(WebElement eachRow: numOfrows){
           System.out.println(eachRow+eachRow.getText());
           rowNum++;


           //get the 3rd row

        WebElement thirdrow=   driver.findElement(By.xpath("//table[@id='table1']//tr[3]"));
           System.out.println(thirdrow.getText());

           //PRINT All Cell Data cells

                   List< WebElement >allcellDara    =       driver.findElements(By.xpath("(//table[@id='table1'])//tr/td"));


       }

    }

}

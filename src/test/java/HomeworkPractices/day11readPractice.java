package HomeworkPractices;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class day11readPractice  extends TestBase {

    @Test

    public void read() throws IOException {

        String path="src/test/java/resources/Capitals.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);


        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //        Open the first worksheet

             Sheet sheet1= workbook.getSheetAt(0);

        //       Go to first row

              Row row1 = sheet1.getRow(0);

        //       Go to first cell on that FIRST ROW and print
                 Cell cell1= row1.getCell(0);
                // System.out.println(cell1.toString());//COUNTRY

        //       Go to the second cell on that first row and print [ GO TO THE FIRST ROW AND THEN GET THE SECOND CELL ]
                 Cell cell2=  row1.getCell(1);
               //  System.out.println(cell2.toString());//CAPITAL

        //       Go to 2nd row first cell and assert if the data equal to USA

                  String row2Cell1= sheet1.getRow(1).getCell(0).toString();//USA

                //  Assert.assertEquals("USA",row2Cell1);

        //        Go to 3rd row 2nd cell-chain the row and cell

                String row3Cell2=  sheet1.getRow(2).getCell(1).toString();
              //  System.out.println(row3Cell2);//Paris

        //  Find the number of row // this is important-- interview question how do you get the total num of rows?

                  int numOfRows=  sheet1.getPhysicalNumberOfRows();
                  System.out.println(numOfRows);//11

        int lastRowNumber = sheet1.getLastRowNum();
        System.out.println(lastRowNumber+1);//11


        //   Print country, capitol key value pairs as map object
        //        {USA=D.C,France=Paris,England=London,..}

        Map<String,String> countryCapitals=new HashMap<>();
        //        using loop to get each cell data and store in the map

        for(int rowNumber=1; rowNumber<lastRowNumber;rowNumber++){

            String countries = sheet1.getRow(rowNumber).getCell(0).toString();
            String capitals = sheet1.getRow(rowNumber).getCell(1).toString();

            countryCapitals.put(countries,capitals);

        }
        System.out.println(countryCapitals);

    }
}

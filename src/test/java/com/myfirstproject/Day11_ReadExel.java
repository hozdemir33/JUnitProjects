package com.myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day11_ReadExel {

    @Test
    public void readExel() throws IOException {
        String path = "./src/test/java/resources/Capitals.xlsx";

        //        Open the file
        FileInputStream fileInputStream = new FileInputStream(path);

        //        Open the workbook using fileinputstream

        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //        Open the first worksheet
        Sheet sheet1 = workbook.getSheetAt(0);

        //        Go to first row
        Row row1 = sheet1.getRow(0);


        //        Go to the first cell on that first row and print
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);  //System.out.println(workbook.getSheetAt(0).getRow(0).getCell(1));

        //        Go to the second cell on that first row and print
        Cell cell2 = row1.getCell(1);   // What is the datatype? Just Cell can we cover to string? yes toString()
        System.out.println(cell2.toString());  //same thing System.out.println(cell2);

        // Go to 2nd row first cell  and assert if the data equal to USA
        // Cell row2Cell1= sheet1.getRow(1).getCell(0).toString(); from Cell to toString() to make it String class
        String row2Cell1 = sheet1.getRow(1).getCell(0).toString();
        Assert.assertEquals("USA", row2Cell1); // assertion does not accept Cell object.

        //        Go to 3rd row 2nd cell-chain the row and cell
        String row3Cell2 = sheet1.getRow(2).getCell(1).toString();
        System.out.println(row3Cell2); //Paris

        //  Find the number of row // this is important-- interview question how do you get the total num of rows?
        //index starts from 0 so add 1 to match the row number

         int lastRowNumber = sheet1.getLastRowNum();
         System.out.println(lastRowNumber+1);//11

        //        Find the number of used row

        //not empty

        // index starts from 1 so no need to add 1 to match

        int numberOfRowUsed = sheet1.getPhysicalNumberOfRows();
        System.out.println(numberOfRowUsed);//11

        //   Print country, capitol key value pairs as map object
        //        {USA=D.C,France=Paris,England=London,..}
      Map<String,String> countryCapitals = new HashMap<>();
//        using loop to get each cell data and store in the map
        for (int rowNumber = 1; rowNumber < lastRowNumber; rowNumber++) {
//            usa     = sheet1.getRow(1).getCell(0);
//            france  = sheet1.getRow(2).getCell(0);
//            england = sheet1.getRow(3).getCell(0);
//            turkey  = sheet1.getRow(4).getCell(0);
//            D.C     = sheet1.getRow(1).getCell(1);
//            paris   = sheet1.getRow(2).getCell(1);
//            london  = sheet1.getRow(3).getCell(1);
//            ankara  = sheet1.getRow(4).getCell(1);
            String countries = sheet1.getRow(rowNumber).getCell(0).toString();
            String capitals = sheet1.getRow(rowNumber).getCell(1).toString();

//            System.out.println("Countries : "+countries);
//            System.out.println("Capitals  : "+capitals);

            countryCapitals.put(countries,capitals);

        }

        System.out.println(countryCapitals);

    }
}

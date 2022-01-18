package com.myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day11_WriteExcel {
    //how can we write the data on excel file

    @Test
    public void writeExcel() throws IOException {
//        Store the path of the file as string and open the file
        String path = "src/test/java/resources/Capitals.xlsx";
//        Open the workbook
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //        Open the first worksheet
        Sheet sheet1 = workbook.getSheetAt(0);
        System.out.println(sheet1);

        //        Go to the first row
        Row row1 = sheet1.getRow(0);

        //        CREATE a cell on the 3rd column (2nd index) on the first row
        Cell row1Cell3 = row1.createCell(2);

        //        Write “POPULATION” on that cell
        row1Cell3.setCellValue("POPULATION");

        //        Create a cell on the 2nd row 3rd cell(index2), and write 150000
        sheet1.getRow(1).createCell(2).setCellValue("150000");
        //        Create a cell on the 3rd row 3rd cell(index2), and write 250000
        sheet1.getRow(2).createCell(2).setCellValue("250000");
        //        Create a cell on the 4th row 3rd cell(index2), and write 54000
        sheet1.getRow(3).createCell(2).setCellValue("54000");


             //more practices
        //        Create a cell on the 5th row 3rd cell(index2), and write 67000
        sheet1.getRow(5).createCell(2).setCellValue("67000");
        //        Create a cell on the 6th row 3rd cell(index2), and write 4444444
        sheet1.getRow(6).createCell(2).setCellValue("444444");
        //       Create a cell on the 6th row 3rd cell(index2), and write 5454
        sheet1.getRow(7).createCell(2).setCellValue("5454");
        //      Create a cell on the 8th row 3rd cell(index2), and write 98098
        sheet1.getRow(8).createCell(2).setCellValue("98098");


                  // Write and save the workbook
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
                  // Close the file
        fileOutputStream.close();
        fileInputStream.close();
                 //   Close the workbook
        workbook.close();

    }
}

package com.syntax.Class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\badoo\\OneDrive\\Desktop\\Batch12\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheetAt(0);//or getSheet("Sheet1")
        Row row=sheet.createRow(6);
        row.createCell(0).setCellValue("Asel");
        row.createCell(1).setCellValue("Kiyatova");
        row.createCell(2).setCellValue("16");
        row.createCell(3).setCellValue("Almaty");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
    }
}

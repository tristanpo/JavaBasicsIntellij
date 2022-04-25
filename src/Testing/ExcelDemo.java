package Testing;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\badoo\\Downloads\\poi-bin-5.2.2-20220312\\Test.xls";
        FileInputStream  fileInputStream= new FileInputStream(path);
        HSSFWorkbook xssfWorkbook=new HSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet2");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}

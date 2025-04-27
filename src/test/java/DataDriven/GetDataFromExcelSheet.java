/*
package DataDriven;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetDataFromExcelSheet {

    static Workbook workbook;

    static Sheet sheet;

    public static String filePath  = System.getProperty("user.dir") + "/src/test/Resource/TestData.xlsx";


    public static Object[][] getDataFromExcelFile(String sheetName) throws IOException{



        FileInputStream fileInputStream = new FileInputStream(sheetPath);

        workbook = WorkbookFactory.create(fileInputStream);
        sheet= workbook.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for(int i=0;i<sheet.getLastRowNum();i++){

            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){

                data[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }
        return data;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @DataProvider(name = "ExcelData", parallel = true)
    public static Object[][] getData() throws IOException{

        return getDataFromExcelFile("Sheet1");

    }
}
*/
package DataDriven;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.apache.poi.ss.usermodel.*;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;


public class GetDataFromExcelSheet {

    static Workbook workbook;
    static Sheet sheet;

    //public static String sheetPath = System.getProperty("User Directory"+"src/test/Resources/ExcelBook1.xlsx");

    public static String sheetPath = System.getProperty("user.dir") + "/src/test/Resource/TestData.xlsx";
    public Object[][] getDataFromXl(String sheetName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(sheetPath);
        System.out.println(sheetPath);

        workbook = WorkbookFactory.create(fileInputStream);
        sheet = workbook.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i + 1); // Ensure row exists
            if (row != null) { // Check if row is not null
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) { // Check if cell is not null
                        data[i][j] = cell.toString();
                    } else {
                        data[i][j] = ""; // Handle empty cells gracefully
                    }
                }
            }
        }
        return data;
    }

    @DataProvider(name  = "getData")
    public Object[][] getData() throws IOException {
        return getDataFromXl("Sheet1");

    }

}
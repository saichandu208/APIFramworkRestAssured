package Tests.TestCasesPractice;


import DataDriven.GetDataFromExcelSheet;
import org.apache.commons.collections4.Get;
import org.testng.annotations.Test;

public class ExcelData {


    @Test(dataProvider = "getData", dataProviderClass = GetDataFromExcelSheet.class)
    public void loginTestCase(String email, String pwd){

        System.out.println(email);
        System.out.println(pwd);
    }
}

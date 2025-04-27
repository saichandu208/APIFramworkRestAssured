package DataDriven;

/*
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData {
    @DataProvider(name = "Logindata")
        public static Object[][] dataMethod(){

            return new Object[][]{

                    {"Abc@gmail.com", "saichandiu"}};}


    @Test(dataProvider = "Logindata"*/
/*, dataProviderClass = LoginData.class*//*
)
    public void practice(String email, String pwd){

        System.out.println(email);
        System.out.println(pwd);}

}
*/


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class LoginData {

    @DataProvider(name = "LoginData1")
    public Object[][] getData1() {
        return new Object[][]{
                {"sai@123", "98989"},
                {"sai@1234", "98989"}
        };
    }

    @DataProvider(name = "Logindata2")
    public Object[][] getData2() {
        return new Object[][]{
                {819266, 26},
                {819277, 28}
        };
    }


    @Test(dataProvider = "LoginData1")
    public void Testing(String email, String password) {
        System.out.println(email);
        System.out.println(password);
    }

    @Test(dataProvider = "Logindata2")
    public void testData( int empid, int num) {
        System.out.println(empid+" "+num);

    }


}









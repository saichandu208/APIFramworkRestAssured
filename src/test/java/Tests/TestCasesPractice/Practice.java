
package Tests.TestCasesPractice;

import DataDriven.LoginData;
import Utils.PropertyReader;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class Practice {

    /*@Test(dataProvider = "Logindata", dataProviderClass = LoginData.class)
    public void practice(String email, String pwd){

        System.out.println(email);
        System.out.println(pwd);


    }*/

    @Test
    public void login(){
        System.out.println(PropertyReader.readKey("Name"));
        System.out.println(PropertyReader.readKey("pwd"));
    }

}

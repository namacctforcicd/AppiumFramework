package tests;

import lombok.Data;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class DataProviderTest extends MobileBaseTest{

    @Test(dataProvider = "data")
    public void loginTest(String username, String password){

        LoginPage lp = new LoginPage();
        lp.perform_successfulLogin(username,password);
    }

    @DataProvider(name = "data")
    public Object[][] testData() {

        return new Object[][]{
                {"james", "pw1"},
                {"magic", "kareem"},
                {"mike", "pw3"}

    };
    }
}

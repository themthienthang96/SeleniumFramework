package TestCases;

import Utility.Base;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TC1_Admin_Login extends Base {

    @Test
    @Description("Login test with right username and password")
    public void loginSuccess(){
        homePage.setUserName("admin@admin.com");
        homePage.setPassWord("123");
        homePage.clickSubmit();
    }

    @Test
    @Description("Login test with wrong username and password")
    public void loginUnsuccess(){
        homePage.setUserName("testtesttest@gmail.com");
        homePage.setPassWord("123");
        homePage.clickSubmit();
    }
}

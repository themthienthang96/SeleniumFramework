package TestCases;

import Pages.AdminPage;
import Utility.Base;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.junit.Assert;

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
        String validationExpected = "ログインIDまたはパスワードが不正です。";
        homePage.setUserName("testtesttest@gmail.com");
        homePage.setPassWord("123");
        homePage.clickSubmit();
        //System.out.printf(actualExpected);
        Assert.assertEquals(validationExpected,homePage.getValidate());

    }
}

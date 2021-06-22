package Pages;

import Utility.Services;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Services {
    @FindBy(name="#")
    WebElement userName;

    @FindBy(name = "#")
    WebElement passWord;

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void setUserName(String userName){
        driver.findElement(By.name("login_id")).sendKeys(userName);
    }
    public void setPassWord(String passWord){
        driver.findElement(By.name("password")).sendKeys(passWord);
    }
    public AdminPage clickSubmit(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[4]/div/button")).click();
        return new AdminPage(driver);
    }
}

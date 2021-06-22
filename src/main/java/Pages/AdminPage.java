package Pages;

import Utility.Services;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Services{
    public AdminPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void clickCreate(){

    }
}

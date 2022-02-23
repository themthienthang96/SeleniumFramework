package Utility;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;


public class Base{
    private WebDriver driver;
    protected HomePage homePage;
    private String url = "http://terrace.asto-system.biz/login";

    @Parameters({"browser", "headless"})
    @BeforeMethod
    public void BaseTest(String browser, Boolean headless) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
            if (headless == true) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                driver = new ChromeDriver(options);
            } else {
                driver = new ChromeDriver();
            }
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\Framework\\SeleniumFramework-master\\driver\\windows\\geckodriver.exe");
            if (headless == true) {
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(true);
                driver = new FirefoxDriver(options);
            } else {
                driver = new FirefoxDriver();
            }
        }
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }
}

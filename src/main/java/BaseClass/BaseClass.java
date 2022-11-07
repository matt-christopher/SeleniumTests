package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseClass {
    protected static WebDriver driver; //important if shared classes in other projects. Example is

    @BeforeSuite(alwaysRun = true)
    public void setupDriver()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
    }

    @BeforeTest(alwaysRun = true)
    public void setupBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterTest(alwaysRun = true)
    public void closeBrowser()
    {
        driver.close();
    }

    @AfterSuite(alwaysRun = true)
    public void closeDriver()
    {
        driver.close();
    }


}

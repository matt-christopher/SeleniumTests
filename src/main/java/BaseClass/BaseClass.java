package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
    protected static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setupDriver()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
    }

    @Parameters("url")
    @BeforeMethod(alwaysRun = true)
    public void setupBrowser(String url)
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser()
    {
        driver.quit();
    }

}

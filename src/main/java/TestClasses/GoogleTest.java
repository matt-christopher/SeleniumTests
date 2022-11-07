package TestClasses;
import PageObjects.GoogleHome;
import BaseClass.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest extends BaseClass {

    @Parameters({"consoleUrl"})
    @Test(description = "Test01")
    public void Test01(String consoleUrl)
    {
        driver.navigate().to(consoleUrl);
        GoogleHome.clickOnHeader("Gmail");
    }

    @Parameters({"consoleUrl"})
    @Test(description = "Test01")
    public void Test02(String consoleUrl)
    {
        driver.navigate().to(consoleUrl);
        GoogleHome.clickOnHeader("Images");
    }

    @Parameters({"consoleUrl"})
    @Test(description = "Test01")
    public void Test03(String consoleUrl)
    {
        driver.navigate().to(consoleUrl);
    }
}

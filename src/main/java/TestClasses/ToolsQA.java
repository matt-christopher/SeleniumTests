package TestClasses;
import BaseClass.BaseClass;
import PageObjects.Menu;
import PageObjects.TextBoxID;
import PageObjects.TextBoxXpath;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

public class ToolsQA extends BaseClass {

    @Parameters({"FullName", "Email", "CurrentAddress", "PermanentAddress"})
    @Test(description = "This tests the Text Box field using Xpath locators")
    public void Test01(String FullName, String Email, String CurrentAddress, String PermanentAddress)
    {
        Menu.clickMenuItem("Text Box");

        TextBoxXpath.inputTextValue("Full Name", FullName);
        TextBoxXpath.inputTextValue("Email", Email);
        TextBoxXpath.inputLargeTextValue("Current Address", CurrentAddress);
        TextBoxXpath.inputLargeTextValue("Permanent Address", PermanentAddress);

        TextBoxXpath.clickButton("Submit");

        Assert.assertTrue(driver.findElement(By.id("name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.id("name")).getText(),"Name:Matthew Christopher");
    }

    @Parameters({"FullName", "Email", "CurrentAddress", "PermanentAddress"})
    @Test(description = "This tests the Text Box field using ID locators")
    public void Test02(String FullName, String Email, String CurrentAddress, String PermanentAddress)
    {
        Menu.clickMenuItem("Text Box");

        TextBoxID.InputFullName(FullName);
        TextBoxID.InputEmailAddressString(Email);
        TextBoxID.InputCurrentAddress(CurrentAddress);
        TextBoxID.InputPermanentAddress(PermanentAddress);

        TextBoxID.ClickSave();

        Assert.assertTrue(driver.findElement(By.id("name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.id("name")).getText(),"Name:Matthew Christopher");
    }

    @Parameters({"FullName", "Email", "CurrentAddress", "PermanentAddress"})
    @Test(description = "This tests the Text Box field using ID locators")
    public void Test03(String FullName, String Email, String CurrentAddress, String PermanentAddress)
    {
        Menu.clickMenuItem("Text Box");

        TextBoxID.InputInfo(FullName, Email, CurrentAddress, PermanentAddress);

        Assert.assertTrue(driver.findElement(By.id("name")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.id("name")).getText(),"Name:Matthew Christopher");

    }

}

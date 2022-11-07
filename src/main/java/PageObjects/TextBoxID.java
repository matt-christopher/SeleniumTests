package PageObjects;

import BaseClass.BaseClass;
import org.openqa.selenium.By;

public class TextBoxID extends BaseClass {

    private static By FullName = By.id("userName");
    private static By Email = By.id("userEmail");
    private static By CurrentAddress = By.id("currentAddress");
    private static By PermanentAddress = By.id("permanentAddress");
    private static By SubmitButton = By.id("submit");

    public static void InputFullName(String _value)
    {
        driver.findElement(FullName).clear();
        driver.findElement(FullName).sendKeys(_value);
    }

    public static void InputEmailAddressString (String _value)
    {
        driver.findElement(Email).clear();
        driver.findElement(Email).sendKeys(_value);
    }

    public static void InputCurrentAddress(String _value)
    {
        driver.findElement(CurrentAddress).clear();
        driver.findElement(CurrentAddress).sendKeys(_value);
    }

    public static void InputPermanentAddress(String _value)
    {
        driver.findElement(PermanentAddress).clear();
        driver.findElement(PermanentAddress).sendKeys(_value);
    }

    public static void ClickSave()
    {
        driver.findElement(SubmitButton).click();
    }

    public static void InputInfo(String _name, String _email, String _currentAddress, String _permanentAddress)
    {
        driver.findElement(FullName).clear();
        driver.findElement(FullName).sendKeys(_name);
        driver.findElement(Email).clear();
        driver.findElement(Email).sendKeys(_email);
        driver.findElement(CurrentAddress).clear();
        driver.findElement(CurrentAddress).sendKeys(_currentAddress);
        driver.findElement(PermanentAddress).clear();
        driver.findElement(PermanentAddress).sendKeys(_permanentAddress);
        driver.findElement(SubmitButton).click();


    }
}

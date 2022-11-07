package PageObjects;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBoxXpath extends BaseClass {

    public static void inputTextValue(String _fieldName, String _value)
    {
        By FieldName = By.xpath("//label[text() = '"+_fieldName+"']//following:: input[1]");
        driver.findElement(FieldName).clear();
        driver.findElement(FieldName).sendKeys(_value);
    }

    public static void inputLargeTextValue(String _fieldName, String _value)
    {
        By FieldName = By.xpath("//label[text() = '"+_fieldName+"']//following:: textarea[1]");
        driver.findElement(FieldName).clear();
        driver.findElement(FieldName).sendKeys(_value);
    }
    public static void clickButton(String _name)
    {
        By ButtonName = By.xpath("//button[text() = '"+_name+"']");
        driver.findElement(ButtonName).click();
    }




}

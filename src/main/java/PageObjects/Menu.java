package PageObjects;

import BaseClass.BaseClass;
import org.openqa.selenium.By;

public class Menu extends BaseClass {
    public static void clickMenuItem(String _name)
    {
        By LinkName = By.xpath("//span[text() = '"+_name+"']");
        driver.findElement((LinkName)).click();
    }

}

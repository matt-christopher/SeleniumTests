package PageObjects;

import BaseClass.BaseClass;
import org.openqa.selenium.By;

public class GoogleHome extends BaseClass {
    public static void clickOnHeader(String _name)
    {
        By LinkName = By.xpath("//a[text() = '"+_name+"']");
        driver.findElement((LinkName)).click();
    }

}

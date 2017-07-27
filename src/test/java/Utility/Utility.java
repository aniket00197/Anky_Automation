package Utility;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by aniket on 7/2/2017.
 */
public class Utility extends DriverManager{

    public static void enterText(WebElement element, String text)
    {

        element.sendKeys(text);
    }

    public static void clickOnElement(WebElement element)
    {
        element.click();
    }
}


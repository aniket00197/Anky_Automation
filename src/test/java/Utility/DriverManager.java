package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by aniket on 7/2/2017.
 */
public class DriverManager {

    protected static WebDriver driver;

    public DriverManager()
    {
        PageFactory.initElements(driver,this);
    }

    public static void openBrowser()
    {
        System.setProperty("webdriver.gecko.driver","src//test//resources//geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://way2automation.com/way2auto_jquery/dropdown.php");
    }
}

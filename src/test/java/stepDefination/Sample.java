package stepDefination;

import Utility.DriverManager;
import Utility.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by aniket on 6/25/2017.
 */
public class Sample extends DriverManager{
    @FindBy(name="name")
    WebElement Name;

    @FindBy(name="username")
    WebElement userName;

    @FindBy(linkText="Signin")
    WebElement signIn;

    @FindBy(id="txtPassword")
    WebElement password;

    @Given("Go to login window")
    public void open_Orange_HRM_Application() throws Throwable {
        openBrowser();
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        Thread.sleep(3000);
        driver.findElement(By.linkText("Signin")).click();

        // Write code here that turns the phrase above into concrete webdriver.gecko.driver

        //Utility.enterText(password,"Admin");

    }
    @Then("Login into the application")
    public void login_into_the_Application() throws Throwable
    {
        String subWindow=null;
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> iterator=handles.iterator();
        while(iterator.hasNext())
        {
            subWindow=iterator.next();
        }
        driver.switchTo().window(subWindow);
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("aniket00197");


    }
}

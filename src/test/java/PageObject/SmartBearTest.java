package PageObject;

import Data.Config;
import Data.Driver;
import Pages.SmartHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SmartBearTest  {

    SmartHomePage s = new SmartHomePage();
    @BeforeMethod
    public void Before() throws InterruptedException {
        Driver.getDriver().get(Config.getProperty("smartBearUrl"));
    }


    @Test
    public void Test1() throws InterruptedException {
        s.Usernmame.sendKeys("a");
        s.Password.sendKeys("test");
        s.LoginButton.click();

        Assert.assertEquals(s.ErrorMessage.getText(), "Invalid Login or Password.", "Not equal 1");
        Thread.sleep(2000);
    }

    @Test
    public void Test2() throws InterruptedException {
        s.Usernmame.sendKeys("Tester");
        s.Password.sendKeys("tes");
        s.LoginButton.click();

        Assert.assertEquals(s.ErrorMessage.getText(), "Invalid Login or Password.", "Not equal 2");
        Thread.sleep(2000);
    }

    @Test
    public void Test3() throws InterruptedException {
        s.Usernmame.sendKeys("");
        s.Password.sendKeys("test");
        s.LoginButton.click();

        Assert.assertEquals(s.ErrorMessage.getText(), "Invalid Login or Password.", "Not equal 2");
        Thread.sleep(2000);
    }

    @Test
    public void Test4() throws InterruptedException {
        s.Usernmame.sendKeys("Tester");
        s.Password.sendKeys("");
        s.LoginButton.click();

        Assert.assertEquals(s.ErrorMessage.getText(), "Invalid Login or Password.", "Not equal 2");
        Thread.sleep(2000);
    }

}
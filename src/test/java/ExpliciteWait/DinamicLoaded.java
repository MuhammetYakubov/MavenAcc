package ExpliciteWait;

import Data.Driver;
import Pages.DimanicLoadLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

public class DinamicLoaded {


    @Test
    public void LoginPage() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        DimanicLoadLoginPage D = new DimanicLoadLoginPage();

        D.StartButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        WebElement waitUnlit = wait.until(ExpectedConditions.visibilityOf(D.Text));
        Assert.assertTrue(D.Text.isDisplayed());


        D.Username.sendKeys("tomsmith");
        D.Password.sendKeys("SuperSecretPassword");
        D.SubmitButton.click();

        Assert.assertTrue(D.WelcomeText.isDisplayed());
        Driver.quitDriver();
    }
}

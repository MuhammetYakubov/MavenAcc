package PageObject;

import Data.Driver;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectClass extends LoginPage {
    @Test
    public void orangeLoginVerification() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        LoginPage olp = new LoginPage();

        olp.usernameInput.sendKeys("Admin");
        olp.passwordInput.sendKeys("admin123");
        olp.loginButton.click();

        olp.orangeLogin("Admin","admin");
        HomePage ohp = new HomePage();


        Assert.assertTrue(ohp.welcomeText.isDisplayed());

    }
}
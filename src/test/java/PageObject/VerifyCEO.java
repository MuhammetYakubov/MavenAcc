package PageObject;

import Data.Driver;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VerifyCEO {
    @Test
    public void verifyCEO() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        LoginPage olp = new LoginPage();
        //logged in to orangeHRM
        olp.orangeLogin("Admin", "admin123");

        //Create an instance of HomePage
        HomePage ohp = new HomePage();

        //Creating the instance of actions class to be able to hover over
        Actions actions = new Actions(Driver.getDriver());

        //Using the instance of HomePage, passing inside to actions
        actions.moveToElement(ohp.performance).perform();
    }
}

package Actions;

import Data.Driver;
import Trainging.SmartBear;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Data.TestBase;
public class Hoverovering {

    @Test
    public void amazonHover() {

        Driver.getDriver().get("https://amazon.com");
        //1- We locate the webElement
        WebElement signInLink = Driver.getDriver().findElement(By.id("nav-link-accountList"));

        //2- We create the instance of Actions class.
        Actions actions = new Actions(Driver.getDriver());

        //3- We just use the actions object to call any method from Actions class.
        actions.moveToElement(signInLink).perform();
        //actions.perform();
    }

}

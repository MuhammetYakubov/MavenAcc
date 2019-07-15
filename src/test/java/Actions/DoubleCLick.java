package Actions;

import Data.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class DoubleCLick {

    Actions aciion;

    @Test
    public void doubleClick() throws InterruptedException{
        Driver.getDriver().get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");

        WebElement puff = Driver.getDriver().findElement(By.id("puff_header"));

        aciion = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        aciion.doubleClick(puff).perform();
        Thread.sleep(2000);
        Assert.assertTrue(puff.isDisplayed(),"Puff didn't displayed");

        Driver.quitDriver();
    }

}

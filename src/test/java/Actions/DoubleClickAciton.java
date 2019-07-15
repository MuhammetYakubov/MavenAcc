package Actions;

import Data.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class DoubleClickAciton {
    Actions actions;

    @Test
    public void Double() throws InterruptedException {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Thread.sleep(3000);
        WebElement Iframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeResult']"));
        Driver.getDriver().switchTo().frame(Iframe);
        Thread.sleep(2000);

        actions = new Actions(Driver.getDriver());
        WebElement Text = Driver.getDriver().findElement(By.xpath("//p[.='Double-click me to change my text color.']"));
        actions.doubleClick(Text).perform();

        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']")).isDisplayed());

        Driver.quitDriver();
    }
}

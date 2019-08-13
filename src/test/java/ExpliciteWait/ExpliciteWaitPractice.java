package ExpliciteWait;

import Data.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExpliciteWaitPractice {
    @Test
    public void waitingExplicitly(){

        Driver.getDriver().get("https://www.google.com/");
        WebElement googleSearch  = Driver.getDriver().findElement(By.name("q"));
        // 1- I need to create an object from WebDriverWait class
        // 2- Pass two arguments inside: first argument is driver, second is the time that
        // I want to wait until.

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        // 3- Use object that I created from WebDriverWait and create the certain condition
        // that I want to wait for

        WebElement googleWait = wait.until(ExpectedConditions.visibilityOf(googleSearch));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath")));

        googleWait.sendKeys("search for something");
      //  wait.until(ExpectedConditions.vi(By.xpath(""),""));


    }
}

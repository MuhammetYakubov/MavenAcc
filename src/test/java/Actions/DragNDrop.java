package Actions;

import Data.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragNDrop {
    Actions act;
    @Test
    public void DragDrop() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droptarget']"));

        act = new Actions(driver);

        Thread.sleep(2000);
        act.dragAndDrop(source, target).perform();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[.='You did great!']")).isDisplayed());
    }




}

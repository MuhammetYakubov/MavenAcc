package TestingNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void Iframe() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void Test1() {
        driver.get("http://practice.cybertekschool.com/iframe");
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iFrame);


        Assert.assertTrue(driver.findElement(By.xpath("//body[@id='tinymce']")).isDisplayed(), "bro sorry its not displayed");

        driver.switchTo().parentFrame();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='example']/h3")).isDisplayed(), "Broo sorry again not displayed");
        driver.close();
    }
}

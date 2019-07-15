package WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Windwo {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void windowHandelTest(){
        String mainHandle = driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(mainHandle);
        System.out.println(driver.getTitle());

        //getWindowHandles() will return all of the current open windows’ handles.
        Set<String> windowHandles = driver.getWindowHandles();


        for(String handle : driver.getWindowHandles()){

            if(!handle.equals(mainHandle)){
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
            }
        }
}





    }


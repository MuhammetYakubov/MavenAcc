package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectDropDownMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");


        WebElement month = driver.findElement(By.id("month"));
        Select monthDropDown = new Select(month);
        monthDropDown.selectByIndex(1);
        Thread.sleep(3000);
        monthDropDown.selectByValue("8");
        Thread.sleep(3000);
        monthDropDown.selectByVisibleText("April");
        System.out.println(monthDropDown.getFirstSelectedOption().getText());



        WebElement day = driver.findElement(By.id("day"));
        Select dayDropDown = new Select(day);
        Thread.sleep(3000);
        System.out.println(dayDropDown.getFirstSelectedOption().getText());


        WebElement year = driver.findElement(By.id("year"));
        Select yearDropDown = new Select(year);
        System.out.println(yearDropDown.getFirstSelectedOption().getText());


        List<WebElement> monthsList = monthDropDown.getOptions();
        for (WebElement i:monthsList){
            System.out.println(i.getText());
        }
          driver.close();
    }
}

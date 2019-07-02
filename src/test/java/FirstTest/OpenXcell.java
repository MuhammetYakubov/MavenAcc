package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenXcell {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        driver.get("https://www.openxcell.com/");
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println(links.size());

        int empty = 0;
        for (WebElement link:links){
            if(link.getText().isEmpty()) {
              empty++;
            }
            System.out.println(link.getText());
        }
        System.out.println(empty);
        driver.close();
    }
}

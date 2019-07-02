package FirstTest;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTest {
    public static void main(String[] args) {
        System.out.println("Hello, Maven");
        Faker fake = new Faker();
        System.out.println(fake.name().name());
        System.out.println(fake.address());


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys(fake.name().name()+ Keys.ENTER);

        
    }
}

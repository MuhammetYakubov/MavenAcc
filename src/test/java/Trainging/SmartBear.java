package Trainging;

import FirstTest.CD;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Faker fake = new Faker();
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        List<WebElement> Text = driver.findElements(By.xpath("//a"));
        System.out.println(Text.size());

        for (WebElement i : Text) {
            System.out.println(i.getText());
        }

        driver.findElement(By.linkText("Order")).click();
        Select Product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        Product.selectByIndex(1);
        Thread.sleep(1000);

        WebElement Quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        Quantity.sendKeys("2");
        Quantity.click();
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(fake.name().fullName());
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(fake.address().streetName());
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(fake.address().city());
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(fake.address().state());
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(fake.address().zipCode().replace("-",""));
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(fake.finance().creditCard().replace("-",""));
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("01/02/2014");
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        Thread.sleep(1000);


        System.out.println("You successfuly created new order: "+CD.passOrFail(driver.findElement(By.xpath("//strong")).getText().equals("New order has been successfully added.")));

        driver.findElement(By.linkText("View all orders")).click();

        System.out.println("Susan McLaren has order on date \"1/05/2010\": "+CD.passOrFail(driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]")).getText().equals("01/05/2010")));

NamesAndCities(driver, "Adam Smith");

      //  driver.close();
    }

    public static void NamesAndCities(WebDriver driver, String givenName){

        List<WebElement> AllName= driver.findElements(By.xpath("//td//tr/td[2]"));

        List<WebElement> AllCities = driver.findElements(By.xpath("//td//tr/td[7]"));

        for (WebElement i : AllName){
            if (i.getText().equalsIgnoreCase(givenName)) {
                System.out.println(givenName + " exists in the table. Name verification PASSED!");
                return;
            }
        }
        System.out.println(givenName+" doesn't exist in the list.Name verification FAILED!");

        for (WebElement i: AllCities){
            if(i.getText().equalsIgnoreCase(givenName)){
                return;
            }
        }
        System.out.println(givenName+ " doesn't exist in the list.City verification FAILED!");
    }
}

package Pages;

import Data.Driver;
import Trainging.SmartBear;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartHomePage {

    WebDriver driver;
    public  SmartHomePage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement Usernmame;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement Password;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$login_button']")
    public  WebElement LoginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement ErrorMessage;
}


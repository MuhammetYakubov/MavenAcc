package Pages;

import Data.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DimanicLoadLoginPage {


    public DimanicLoadLoginPage(){


        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement StartButton;

    @FindBy(xpath = "//h4[.='Hello World!']")
    public WebElement Text;

    @FindBy(xpath = "//input[@placeholder='Enter username']")
    public  WebElement Username;

    @FindBy(xpath = "//input[@placeholder='Enter password']")
    public WebElement Password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement SubmitButton;

    @FindBy(xpath = "//h4[starts-with(.,'Welcome to the Secure Area.')]")
    public WebElement WelcomeText;

}

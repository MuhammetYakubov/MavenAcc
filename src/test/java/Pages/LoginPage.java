package Pages;

import Data.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "txtUsername")
    public WebElement usernameInput;

    @FindBy(id = "txtPassword")
    public WebElement passwordInput;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    public void orangeLogin(String username, String password) {
     usernameInput.sendKeys(username);
     passwordInput.sendKeys(password);
     loginButton.click();
    }

}

package Pages;

import Data.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="welcome")
    public WebElement welcomeText;

    @FindBy(id="menu__Performance")
    public WebElement performance;

    @FindBy(id="menu_performance_Configure")
    public WebElement configure;

    @FindBy(id = "menu_performance_searchKpi")
    public WebElement kpi;

}

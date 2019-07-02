package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EsensTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement SearchBox = driver.findElement(By.id("searchDropdownBox"));
        Select searchDropDown = new Select(SearchBox);
        System.out.println(searchDropDown.getFirstSelectedOption().getText());
        Thread.sleep(3000);

        List<WebElement> ListMonth = searchDropDown.getOptions();
        System.out.println(ListMonth.size());
        Thread.sleep(3000);

        //link.getText().equals("");
        for (WebElement i:ListMonth){
            if(!i.getText().isEmpty()){

            }
        }

        searchDropDown.selectByValue("search-alias=courses");
        if(searchDropDown.getFirstSelectedOption().equals("co"))



        driver.close();

    }
}

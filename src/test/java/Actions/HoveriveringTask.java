package Actions;

import Data.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoveriveringTask {
    @Test
    public void hoverTest() throws InterruptedException {

        //1- Get the webApp
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //2- Locating all the webElements that we will be doing any action on.
        //driver.findElement()
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        //3- Creating the object of Actions class

        Actions actions = new Actions(Driver.getDriver());

        //4- Using the actions object
        Thread.sleep(1500);
        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed(), "This will be displayed in the console if assertion failed.");
        Thread.sleep(1500);
        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());
        Thread.sleep(1500);
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());

    }
}

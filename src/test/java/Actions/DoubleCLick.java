package Actions;

import Data.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleCLick {

    Actions aciion;

    @Test
    public void doubleClick() throws InterruptedException {
        Driver.getDriver().get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");

        WebElement puff = Driver.getDriver().findElement(By.id("puff_header"));

        aciion = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        aciion.doubleClick(puff).perform();
        Thread.sleep(2000);
        Assert.assertFalse(puff.isDisplayed(), "Puff displayed");

        Driver.quitDriver();
    }


    @Test
    public void tset() {
        long start = System.currentTimeMillis();

        char[] s = new char[1000000];
        String word = new String(s);
        String word1 = "Muhammet";

        System.out.println(reverseWithNewString(word));

        long end = System.currentTimeMillis();
        long duration = end - start;


    }

    public static String reverseWithNewString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

}

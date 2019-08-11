package Actions;

import Data.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void uploadTest() throws InterruptedException{
        //1- get page
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        //2- Locate the chooseFile inputButton.
        WebElement chooseFileInput = Driver.getDriver().findElement(By.id("file-upload"));
        Thread.sleep(2000);

        chooseFileInput.sendKeys("C:\\Users\\Muhammet\\Desktop\\cup.txt");
        Thread.sleep(2000);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement uploadedFolderBox = Driver.getDriver().findElement(By.id("uploaded-files"));
        String expectedFileName = "cup.txt";

        String actualFileName = uploadedFolderBox.getText();
        Assert.assertEquals(expectedFileName, actualFileName);
    }
}

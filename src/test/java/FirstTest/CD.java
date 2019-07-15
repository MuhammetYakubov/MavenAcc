package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CD {

     /*
            SetChromeDriver Method sets the property for the webdriver. It uses the driver variable and refers it to
            a chromedriver. This "link" paramter is the given url that the driver will go to. The method will also
            maximize the window.
     */

        public static void SetChromeMethod(String link){

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

            driver = new ChromeDriver();

            driver.manage().window().maximize();
            // driver.manage().window().fullscreen();

            driver.get(link);
        }

        // driver is a WebDriver reference that can be used as the reference to the driver in any class

        public static WebDriver driver;


    /*
            FindAndSendAndEnter method will go to some field and send some keys the method takes three parameters: find, value, send.
            find: the type of locator being used
            value: the value that of the locator
            send: the information that is being sent
     */

        public static void FindAndSendAndEnter(String locator, String value, String send) {

            if(locator.equals("id")) {
                driver.findElement(By.id(value)).sendKeys(send + Keys.ENTER);
            } else if(locator.equals("name")) {
                driver.findElement(By.name(value)).sendKeys(send + Keys.ENTER);
            } else if(locator.equals("linktext")) {
                driver.findElement(By.linkText(value)).sendKeys(send + Keys.ENTER);
            } else if(locator.equals("partial")) {
                driver.findElement(By.partialLinkText(value)).sendKeys(send + Keys.ENTER);
            } else if(locator.equals("tag")) {
                driver.findElement(By.tagName(value)).sendKeys(send + Keys.ENTER);
            } else if(locator.equals("css")) {
                driver.findElement(By.cssSelector(value)).sendKeys(send + Keys.ENTER);
            } else if(locator.equals("className")) {
                driver.findElement(By.className(value)).sendKeys(send + Keys.ENTER);
            } else if(locator.equals("xpath")) {
                driver.findElement(By.xpath(value)).sendKeys(send + Keys.ENTER);
            } else {
                System.out.println("Invalid locator");
                Done();
            }

        }

        public static void FindAndSendKeys(String locator, String value, String send) {
            if (locator.equalsIgnoreCase("id")) {
                driver.findElement(By.id(value)).sendKeys(send);
            } else if (locator.equalsIgnoreCase("xpath")) {
                driver.findElement(By.xpath("value")).sendKeys(send);
            } else if (locator.equalsIgnoreCase("name")) {
                driver.findElement(By.name(value)).sendKeys(send);
            } else if (locator.equalsIgnoreCase("link")) {
                driver.findElement(By.linkText(value)).sendKeys(send);
            } else if (locator.equalsIgnoreCase("partial")) {
                driver.findElement(By.partialLinkText(value)).sendKeys(send);
            } else if (locator.equalsIgnoreCase("css")) {
                driver.findElement(By.cssSelector(value)).sendKeys(send);
            } else if (locator.equalsIgnoreCase("tag")) {
                driver.findElement(By.tagName(value)).sendKeys(send);
            } else if (locator.equalsIgnoreCase("className")) {
                driver.findElement(By.className(value)).sendKeys(send);
            } else {
                System.out.println("Invalid locator");
                Done();
            }
        }


        public static boolean FindAndDisplay(String locator, String value) {
            if (locator.equalsIgnoreCase("id")) {
                return driver.findElement(By.id(value)).isDisplayed();
            } else if (locator.equalsIgnoreCase("xpath")) {
                return driver.findElement(By.xpath("value")).isDisplayed();
            } else if (locator.equalsIgnoreCase("name")) {
                return driver.findElement(By.name(value)).isDisplayed();
            } else if (locator.equalsIgnoreCase("link")) {
                return driver.findElement(By.linkText(value)).isDisplayed();
            } else if (locator.equalsIgnoreCase("partial")) {
                return driver.findElement(By.partialLinkText(value)).isDisplayed();
            } else if (locator.equalsIgnoreCase("css")) {
                return driver.findElement(By.cssSelector(value)).isDisplayed();
            } else if (locator.equalsIgnoreCase("tag")) {
                return driver.findElement(By.tagName(value)).isDisplayed();
            } else if (locator.equalsIgnoreCase("className")) {
                return driver.findElement(By.className(value)).isDisplayed();
            } else {
                System.out.println("Invalid locator");
                Done();
                return false;
            }
        }

        public static void FindAndClick(String locator, String value){
            if(locator.equalsIgnoreCase("id")){
                driver.findElement(By.id(value)).click();
            }else if(locator.equalsIgnoreCase("xpath")){
                driver.findElement(By.xpath("value")).click();
            }else if(locator.equalsIgnoreCase("name")){
                driver.findElement(By.name(value)).click();
            }else if(locator.equalsIgnoreCase("link")){
                driver.findElement(By.linkText(value)).click();
            }else if(locator.equalsIgnoreCase("partial")){
                driver.findElement(By.partialLinkText(value)).click();
            }else if(locator.equalsIgnoreCase("css")){
                driver.findElement(By.cssSelector(value)).click();
            }else if(locator.equalsIgnoreCase("tag")){
                driver.findElement(By.tagName(value)).click();
            }else if(locator.equalsIgnoreCase("className")){
                driver.findElement(By.className(value)).click();
            }else{
                System.out.println("Invalid locator");
                Done();
            }
        }

        public static String passOrFail(boolean b) {
            if(b) {
                return "Passed";
            } else {
                return "Failed";
            }
        }


        public static void Done(){
            driver.quit();
        }

    }



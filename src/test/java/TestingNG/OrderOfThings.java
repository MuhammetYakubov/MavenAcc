package TestingNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method running");
    }

//    @Test
//    public void bFirstTest(){
//        System.out.println("First test is runnig");
//    }
//
//    @Test
//    public void aSecondTest(){
//        System.out.println("Second test is running");
//    }
//
//    @Test
//    public void cThirdTest(){
//        System.out.println("Third Test is running");
//    }

    @Ignore
    @Test(priority = 2)
    public void FirstTest(){
        System.out.println("First test is runnig");
    }


    @Test(priority = 1)
    public void SecondTest(){
        System.out.println("Second test is running");
    }

    @Test(priority = 3)
    public void ThirdTest(){
        System.out.println("Third Test is running");
    }
}

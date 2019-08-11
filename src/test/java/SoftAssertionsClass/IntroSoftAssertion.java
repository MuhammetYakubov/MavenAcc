package SoftAssertionsClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IntroSoftAssertion {
    @Test
    public void test1(){

        System.out.println("Test 1 is starting...");

        Assert.assertEquals(4,5);

        System.out.println("Test 1 middle...");

        Assert.assertTrue(false);

        System.out.println("Test1 ending...");

    }

    @Test
    public void test2(){
        System.out.println("Test 2 is starting...");
    }

    @Test
    public void test3(){
        System.out.println("Test 3 is starting...");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(4,5, "Line 33 assertion is failed");
        System.out.println("Test 3 middle...");
        softAssert.assertTrue(false);
        System.out.println("Test 3 ending...");

        softAssert.assertAll();

    }

}

package TestingNG;
import org.testng.Assert;
import org.testng.annotations.*;
public class TestingNGFirstTest {

        @BeforeClass
        public void setUp(){
            System.out.println("BeforeClass running...");
        }

        @AfterClass
        public void tearDown(){
            System.out.println("AfterClass running...");
        }

        @BeforeMethod
        public void beforeMethod(){
            System.out.println("BeforeMethod running...");
        }

        @AfterMethod
        public void afterMethod(){
            System.out.println("AfterMethod running...");
        }

        @Test
        public void firstTest(){
            System.out.println("This is the first test running.");

            Assert.assertEquals("a", "a", "First test a-b is failed.");
            Assert.assertEquals(5,55, "Age verification FAILED.");

        }

        @Test
        public void secondTest(){
            System.out.println("This is the second test running.");
        }

        @Test
        public void titleTest(){
            String actualTitle = "Google - Apples";
            String expectedTitleContains = "apples";

            Assert.assertTrue(actualTitle.contains(expectedTitleContains), "Actual title does not contain expected value.");

        }

        @Test
        public void onPurposeFail(){

            Assert.fail("This is on-purpose fail");

        }
}

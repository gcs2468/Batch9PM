package testngclasses;

import org.testng.Reporter;
import org.testng.annotations.*;


public class TestNGDemo {

    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("I am @BeforeMethod annotated method", true);
    }

    @AfterMethod
    public void afterMethod() {
        Reporter.log("I am @AfterMethod annotated method", true);
    }

    @Test
    public void m4() {
        Reporter.log("I am @Test annotated method m4", true);
    }

    @Test
    public void m5() {
        Reporter.log("I am @Test annotated method m5", true);
    }

    @BeforeClass
    void beforeClass() {
        Reporter.log("I am @BeforeClass annotated method", true);
    }

    @AfterClass
    void afterClass() {
        Reporter.log("I am @AfterClass annotated method", true);
    }

    @BeforeTest
    void beforeTest() {
        Reporter.log("I am @BeforeTest annotated method", true);
    }

    @AfterTest
    void afterTest() {
        Reporter.log("I am @AfterTest annotated method", true);
    }

    @BeforeSuite
    void beforeSuite() {
        Reporter.log("I am @BeforeSuite annotated method", true);
    }

    @AfterSuite
    void afterSuite() {
        Reporter.log("I am @AfterSuite annotated method", true);
    }

}

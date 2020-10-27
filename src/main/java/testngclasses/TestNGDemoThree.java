package testngclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNGDemoThree {

    @Parameters({"uName","psswd"})
    @Test(priority = 1, dataProvider = "LoginData", dataProviderClass = DataProviderDemo.class) //, timeOut = 2000, groups = {"A","B"}
    public void login(@Optional("IamOptional") String userName, @Optional("IamOptional") String password) { // @Optional("IamOptional") String userName, String password
        try {
            Reporter.log("User Name is :: "+userName+" and password is :: "+password, true);
            //Assert.fail("Intentionally failing");
            //Thread.sleep(5000);
        } catch (Exception e) {
            Reporter.log(e.getMessage());
        }
        Reporter.log("I am @Test annotated Login in TestNGDemoThree");
    }

    @Test(priority = 2) //, dependsOnMethods = {"login"} , groups = "B", dependsOnGroups = "A"
    public void inboxItems() throws InterruptedException {
        Thread.sleep(5000);
        Reporter.log("I am @Test annotated inboxItems in TestNGDemoThree");
    }

    @Test(priority = 3) // , dependsOnMethods = {"login", "inboxItems"}
    public void dropMail() throws InterruptedException {
        //Assert.fail("Intentionally failing");
        Thread.sleep(5000);
        Reporter.log("I am @Test annotated dropMail in TestNGDemoThree");
    }

    @Test(priority = 4) // , enabled = false
    public void sentItems() throws InterruptedException {
        Thread.sleep(5000);
        Reporter.log("I am @Test annotated sentItems in TestNGDemoThree");
    }

    @Test(priority = 5)
    public void logout() {
        Reporter.log("I am @Test annotated Logout in TestNGDemoThree");
    }



}

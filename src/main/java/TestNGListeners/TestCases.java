package TestNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IReporter;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

//@Listeners(TestNGListeners.ListenerTest.class)

public class TestCases {

    WebDriver driver;

    @Test
    public void LoginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);

        SeleniumUtils.takeScreenshot(driver, "C:\\Users\\Gomasa\\Desktop\\Images\\");


        driver.close();
    }

    //Forcefully failed this test as verify listener.
    @Test
    public void TestToFail()
    {
        Reporter.log("This method to test fail", true);
        Assert.assertTrue(false);
    }


}

package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class OrangeHrmTest {

    WebDriver driver;

    @Test(priority = 1)
    public void validateLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        Thread.sleep(5000);

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);

        String dashBoardText = driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();

        Assert.assertEquals(dashBoardText, "Dashboard");

        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

        driver.close();

    }

    @Test(priority = 2)
    public void validateSystemUsersText() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        Thread.sleep(5000);

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);

        WebElement admimLink = driver.findElement(By.xpath("//b[text()='Admin']"));

        admimLink.click();

        driver.findElement(By.xpath("//a[text()='User Management']")).click();

        driver.findElement(By.xpath("//a[text()='Users']")).click();

        String systemUsersText = driver.findElement(By.xpath("//h1[text()='System Users']")).getText();

        Assert.assertEquals(systemUsersText, "System Users");

        driver.findElement(By.id("welcome")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

        driver.close();

    }


}

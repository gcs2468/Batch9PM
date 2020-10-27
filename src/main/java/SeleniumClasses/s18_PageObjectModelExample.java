package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s18_PageObjectModelExample {

    WebDriver driver;

    String url = "https://opensource-demo.orangehrmlive.com/";

    public void orangeHrmLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);

        // Login to orange HRM appln

        WebElement txtUsername = driver.findElement(By.id("txtUsername"));
        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        WebElement btnLogin = driver.findElement(By.id("btnLogin"));

        txtUsername.sendKeys("Admin");
        txtPassword.sendKeys("admin123");
        btnLogin.click();
        Thread.sleep(5000);

        WebElement welcome_text = driver.findElement(By.id("welcome"));

        if(welcome_text.isDisplayed()){
            System.out.println("Logged in successfully");
            welcome_text.click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[text()='Logout']")).click();
        } else {
            System.out.println("Login failed");
        }

        Thread.sleep(5000);

        driver.quit();

    }


    public static void main(String[] args) throws InterruptedException {

        s18_PageObjectModelExample obj = new s18_PageObjectModelExample();
        obj.orangeHrmLogin();

    }





}

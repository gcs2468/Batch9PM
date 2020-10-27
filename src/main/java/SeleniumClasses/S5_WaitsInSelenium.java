package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class S5_WaitsInSelenium {

    WebDriver driver;

    void launchBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
        //Thread.sleep(5000);
       /* WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='email']")));
*/
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Create an account']")));


        WebElement uId = driver.findElement(By.name("email")); // NoSuchElementException
        System.out.println(uId.getAttribute("type"));

        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
        S5_WaitsInSelenium obj = new S5_WaitsInSelenium();
        obj.launchBrowser();
    }

}

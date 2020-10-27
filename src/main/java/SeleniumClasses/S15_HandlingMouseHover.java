package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S15_HandlingMouseHover {

    WebDriver driver;

    String url = "http://demo.guru99.com/test/drag_drop.html";

    void getBrowser() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);

        WebElement amt5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
        WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));

        Actions actions = new Actions(driver);

        // Move to element
        actions.moveToElement(amt5000).build().perform();
        Thread.sleep(5000);
        actions.moveToElement(sales).build().perform();

        Thread.sleep(5000);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        S15_HandlingMouseHover obj = new S15_HandlingMouseHover();
        obj.getBrowser();
    }


}

package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S16_HandlingDragAndDrop {

    WebDriver driver;

    String url = "http://demo.guru99.com/test/drag_drop.html";

    void getBrowser() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);

        WebElement amt5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
        WebElement amountDeposit = driver.findElement(By.xpath("//ol[@id='amt7']/li"));

        WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
        WebElement creditSideAccount = driver.findElement(By.xpath("//ol[@id='loan']"));

        Actions actions = new Actions(driver);

        // Drag and drop using clickAndHold method
        actions.clickAndHold(amt5000).moveToElement(amountDeposit).release(amountDeposit).build().perform();

        Thread.sleep(5000);

        // Drag and drop using dragAndDrop method
        actions.dragAndDrop(sales, creditSideAccount).build().perform();

        Thread.sleep(5000);
        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
        S16_HandlingDragAndDrop obj = new S16_HandlingDragAndDrop();
        obj.getBrowser();
    }


}

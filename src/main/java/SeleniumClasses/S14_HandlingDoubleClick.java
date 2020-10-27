package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S14_HandlingDoubleClick {

    WebDriver driver;

    String url = "https://artoftesting.com/sampleSiteForSelenium.html";

    void getBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);

        WebElement dblClkBtn = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));

        Actions actions = new Actions(driver);

        actions.doubleClick(dblClkBtn).build().perform(); // To do double click

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(5000);

        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
        S14_HandlingDoubleClick obj = new S14_HandlingDoubleClick();
        obj.getBrowser();
    }

}

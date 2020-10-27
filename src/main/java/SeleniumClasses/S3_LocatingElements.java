package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class S3_LocatingElements {

    WebDriver driver;

    void launchBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://newtours.demoaut.com/");
        Thread.sleep(000);

        // findElement
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("demo");

        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();

        // findElements
        List<WebElement> eleList = driver.findElements(By.xpath("//input[contains(@name,'Name123')]"));
        System.out.println("Number of elements :: "+eleList.size());


        //Thread.sleep(5000);
        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {

        S3_LocatingElements obj = new S3_LocatingElements();
        obj.launchBrowser();

    }


}

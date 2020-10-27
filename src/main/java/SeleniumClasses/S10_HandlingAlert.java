package SeleniumClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S10_HandlingAlert {

    WebDriver driver;


    public void launchChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://testautomationpractice.blogspot.com/");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[text()='Click Me']")).click();

        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();

        //Thread.sleep(5000);

        System.out.println("Alert message is :: "+alert.getText()); // To capture text of alert and print on console

        //alert.accept(); // To click OK Button

        alert.dismiss(); // To click on Cancel button

        //Thread.sleep(5000);
        //alert.sendKeys("Alert message"); // To enter message in alert text box

        System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());

        Thread.sleep(5000);

        driver.close();
    }


    public static void main(String[] args) throws InterruptedException {
        S10_HandlingAlert obj = new S10_HandlingAlert();
        obj.launchChromeBrowser();
    }


}

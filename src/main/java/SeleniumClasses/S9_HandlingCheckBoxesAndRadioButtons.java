package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S9_HandlingCheckBoxesAndRadioButtons {

    WebDriver driver;

    void launchChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://artoftesting.com/sampleSiteForSelenium.html");

        Thread.sleep(3000);

        // Scroll down
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0, 300)");

        // Radio button handling
        WebElement male = driver.findElement(By.xpath("//input[@id='male']"));

        Thread.sleep(5000);

        male.click();
        System.out.println("Male radio button status is :: "+male.isSelected());

        Thread.sleep(5000);

        // Checkboxes handling
		WebElement automation = driver.findElement(By.xpath("//input[@class='Automation']"));

        automation.click();
        System.out.println("Automation check box status is :: "+automation.isSelected());

        Thread.sleep(5000);
        driver.close();
    }


    public static void main(String[] args) throws InterruptedException {
        S9_HandlingCheckBoxesAndRadioButtons obj = new S9_HandlingCheckBoxesAndRadioButtons();
        obj.launchChromeBrowser();
    }


}

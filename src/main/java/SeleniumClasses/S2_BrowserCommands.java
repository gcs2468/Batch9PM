package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S2_BrowserCommands {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(10000);

        driver.findElement(By.className("inputtext login_form_input_box"));

        // Browser Commands
        /*String title = driver.getTitle();
        System.out.println("Title of the browser :: " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is :: " + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("Page source code is :: " + pageSource);*/

        /*driver.navigate().to("http://newtours.demoaut.com/");
        Thread.sleep(10000);

        driver.navigate().back();
        Thread.sleep(10000);

        driver.navigate().forward();
        Thread.sleep(10000);

        driver.navigate().refresh();

        Thread.sleep(10000);*/
        driver.quit();

    }


}

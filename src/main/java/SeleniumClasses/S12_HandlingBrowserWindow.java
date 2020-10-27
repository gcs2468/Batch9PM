package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class S12_HandlingBrowserWindow {

    WebDriver driver;
    String parentId = null;
    String childId = null;

    void getBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/popup.php");

        Thread.sleep(3000);

        parentId = driver.getWindowHandle();

        System.out.println("Parent window handle is :: " + parentId);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Thread.sleep(3000);

        Set<String> handles = driver.getWindowHandles();

       for(String str : handles){
           System.out.println(str);
       }

        handles.remove(parentId);

        for(String str : handles){
            childId = str;
        }

        System.out.println("Child window handle is :: " + childId);

        driver.switchTo().window(childId);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@name='btnLogin']"));

        if (submitBtn.isDisplayed()) {
            System.out.println("In child window");
        } else {
            System.out.println("In parent window");
        }

        /*driver.switchTo().window(parentId);

        if ( driver.findElement(By.xpath("//a[text()='Click Here']")).isDisplayed() ) {
            System.out.println("In parent window");
        } else {
            System.out.println("In child window");
        }*/

        Thread.sleep(5000);

        //driver.close(); // current active browser window
        driver.quit(); // closes all browser windows

    }

    public static void main(String[] args) throws InterruptedException {

        S12_HandlingBrowserWindow obj = new S12_HandlingBrowserWindow();
        obj.getBrowser();

    }


}

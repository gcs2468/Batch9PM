package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class S17_HandlingKeyBoard {

    WebDriver driver;

    String url = "https://www.facebook.com/";

    void getBrowser() throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);

        WebElement userId = driver.findElement(By.xpath("//input[@id='email']"));
        userId.click();

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(userId, "chandra").keyUp(Keys.SHIFT).build().perform(); // To enter text in upper case

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);

        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);

        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);

        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        Thread.sleep(5000);
        driver.close();

    }

    public static void main(String[] args) throws InterruptedException, AWTException {
        S17_HandlingKeyBoard obj = new S17_HandlingKeyBoard();
        obj.getBrowser();
    }

}

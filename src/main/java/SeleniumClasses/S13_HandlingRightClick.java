package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

public class S13_HandlingRightClick {

    WebDriver driver;

    String url = "http://demo.guru99.com/test/drag_drop.html";

    void getBrowser() throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);

        WebElement newTours = driver.findElement(By.xpath("//a[text()='New Tours']"));

        Actions actions = new Actions(driver);

        actions.contextClick(newTours).build().perform();

        Thread.sleep(3000);

        // To click on Open link in new tab
        Robot robot = new Robot(); //  java.awt

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(10000);
        driver.quit();
    }

    /*public static void main(String[] args) throws InterruptedException, AWTException {
        S13_HandlingRightClick obj = new S13_HandlingRightClick();
        obj.getBrowser();
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> deque = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println(max);
    }


}

package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class S7_HandlingDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement date = driver.findElement(By.xpath("//select[@id='day']"));

        Select selectDate = new Select(date);

        selectDate.selectByVisibleText("15");

        Thread.sleep(5000);

        selectDate.selectByIndex(20);

        Thread.sleep(5000);

        selectDate.selectByValue("15");

        Thread.sleep(5000);

        List<WebElement> list = selectDate.getOptions();
        System.out.println("Number of options :: " + list.size()); //32

        for (WebElement ele : list) {
            System.out.println("Option is :: " + ele.getText());
        }

        Thread.sleep(5000);

        driver.close();
    }

}

package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class S12_HandlingWebTable {

    WebDriver driver;

    void getBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
        Thread.sleep(3000);

        // To capture header column names
        List<WebElement> headerColList = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));

        for(int i = 1; i <= headerColList.size(); i++) {
            String headrName = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th[" + i + "]")).getText();
            System.out.println("Header column name at column number " + i + " is :: " + headrName);
        }
        System.out.println();

        // To capture table data
        List<WebElement> rowsList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

        for (int row = 1; row <= rowsList.size(); row++) {

            List<WebElement> colList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + row + "]/td"));

            for (int col = 1; col <= colList.size(); col++) {

                String colData = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + row + "]/td[" + col + "]")).getText();
                if (colData.contains("Prime Customer Serv")) {
                    driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + row + "]/td[" + 1 + "]")).click();
                    Thread.sleep(15000);
                    driver.navigate().back();
                }

                System.out.println("Data in row " + row + " and in col " + col + " is :: " + colData);
            }
            System.out.println();
        }

        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        S12_HandlingWebTable obj = new S12_HandlingWebTable();
        obj.getBrowser();
    }

}

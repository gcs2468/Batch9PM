package testngclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestClass {

    WebDriver driver = null;

    @Test(priority=1)
    public void verifyLoginPageTitle() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // to launch browser
        driver.manage().window().maximize();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
        String title = driver.getTitle();
        assertEquals( "ARR", title);
        driver.close();
    }

    @Test(priority=2)
    public void verifyInputAndSubmitButtononMainScreen(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // to launch browser
        driver.manage().window().maximize();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");

        assertEquals(true, driver.findElement(By.xpath("//input[@id='search-input']")).isDisplayed());

        assertEquals("search-input", driver.findElement(By.xpath("//input[@id='search-input']")).getAttribute("id"));

        assertEquals(true, driver.findElement(By.xpath("//button[@id='search-button']")).isDisplayed());

        assertEquals("search-button", driver.findElement(By.xpath("//button[@id='search-button']")).getAttribute("id"));
        driver.close();
    }

    @Test(priority=3)
    public void verifyEmptyIsForbidden(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // to launch browser
        driver.manage().window().maximize();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");

        driver.findElement(By.xpath("//button[@id='search-button']")).click();
        assertEquals(true, driver.findElement(By.xpath("//div[text()='Provide some query']")).isDisplayed());
        assertEquals("error-empty-query", driver.findElement(By.xpath("//div[text()='Provide some query']")).getAttribute("id"));
        driver.close();
    }

    @Test(priority=4)
    public void verifyAtleastOneIslandByQueryingIsla(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // to launch browser
        driver.manage().window().maximize();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");

        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("isla");
        driver.findElement(By.xpath("//button[@id='search-button']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        assertEquals(true, driver.findElements(By.xpath("//ul[@id='search-results']//li")).size() != 0 );
        driver.close();
    }

    @Test
    public void verifyResultsMatchQuery(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // to launch browser
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("port");
        driver.findElement(By.xpath("//button[@id='search-button']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        assertEquals("Port Royal", driver.findElement(By.xpath("//li[text()='Port Royal']")).getText());
        driver.close();
    }

    @Test(priority=6)
    public void verifyNoResultsForCastle(){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // to launch browser
        driver.manage().window().maximize();
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");

        driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("castle");
        driver.findElement(By.xpath("//button[@id='search-button']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        assertEquals("error-no-results", driver.findElement(By.xpath("//div[text()='No results']")).getAttribute("id") );
        driver.close();
    }


}

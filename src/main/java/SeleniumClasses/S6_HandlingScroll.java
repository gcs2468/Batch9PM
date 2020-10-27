package SeleniumClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6_HandlingScroll {

	WebDriver driver;

	void launchChromeBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("scrollBy(0, 500)"); // scroll page up (x=0 pixels, y=500 pixels)

		Thread.sleep(10000);

		jse.executeScript("scrollBy(0, -500)"); // scroll page down

		Thread.sleep(10000);

		driver.close();
	}

	public static void main(String[] args)  throws InterruptedException {
		S6_HandlingScroll obj = new S6_HandlingScroll();
		obj.launchChromeBrowser();
	}

}

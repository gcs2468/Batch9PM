package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class S8_HandlingLinks {

	WebDriver driver;
	void launchChromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links :: "+list.size());

		for (WebElement ele : list) {
			System.out.println("Link text is ::"+ele.getText()+" and href is :: "+ele.getAttribute("href"));
			System.out.println("Tag name :: "+ele.getTagName());
			System.out.println();
		}

		WebElement link1 = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));

		System.out.println("Link text :: "+link1.getText());

		System.out.println("Link tagname :: "+link1.getTagName());  // a

		System.out.println("href attribute :: "+link1.getAttribute("href"));

		link1.click();

		Thread.sleep(5000);

		driver.close();
	}

	public static void main(String[] args)  throws InterruptedException {
		S8_HandlingLinks obj = new S8_HandlingLinks();
		obj.launchChromeBrowser();
	}

	

}

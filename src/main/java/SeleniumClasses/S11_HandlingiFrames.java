package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S11_HandlingiFrames {

	WebDriver driver;

	void launchChromeBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");

		Thread.sleep(5000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0, 2400)");

		WebElement frame = driver.findElement(By.id("a077aa5e"));

		driver.switchTo().frame(frame);

		driver.switchTo().frame("a077aa5e");

		String srcText = driver.findElement(By.xpath("/html/body/a/img")).getAttribute("src");

		System.out.println("src attribute value is :: " + srcText);

		//driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//button[@class='btn']")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		driver.close();

	}

	public static void main(String[] args)  throws InterruptedException {
		S11_HandlingiFrames obj = new S11_HandlingiFrames();
		obj.launchChromeBrowser();
	}



}

package SeleniumClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class S1_LaunchBrowser {

    WebDriver driver;

    void launchBrowser(String browser) throws InterruptedException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver(); // to launch browser
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverserver.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);

        driver.close();

    }

    void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    void launchFirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    void launchIEBrowser() {
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }

    public static void main(String[] args) throws InterruptedException {

        S1_LaunchBrowser obj = new S1_LaunchBrowser();
        obj.launchBrowser("chrome");
        //obj.launchChromeBrowser();
        //obj.launchFirefoxBrowser();
        //obj.launchIEBrowser();

    }


}

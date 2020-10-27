package SeleniumClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class S4_WebElementCommands {

    WebDriver driver;

    void launchBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // to launch browser

        driver.manage().window().maximize();

        // To launch application

        driver.get("https://www.facebook.com/");

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement uId = driver.findElement(By.id("email"));
        WebElement login = driver.findElement(By.xpath("//input[@id='pass']/following::input[1]"));
        WebElement creatText = driver.findElement(By.xpath("//span[text()='Create an account']"));

        uId.sendKeys("SeleniumJava");
        //Thread.sleep(5000);
        uId.clear();

        String tagName = uId.getTagName();
        System.out.println("Tag name is :: "+tagName);

        String typeAttrbt = uId.getAttribute("type");
        System.out.println("Type attribute value is :: "+typeAttrbt);

        String createAnAccountText = creatText.getText();
        System.out.println("Create An Account Text is :: "+createAnAccountText);

        Dimension d  = creatText.getSize();
        System.out.println("Height is :: "+d.height);
        System.out.println("Width is :: "+d.width);

        Point p = creatText.getLocation();
        System.out.println("X - is ::"+p.x);
        System.out.println("Y - is :: "+p.y);

        Rectangle r = creatText.getRect();
        System.out.println("Height is :: "+r.height);
        System.out.println("Width is :: "+r.width);
        System.out.println("X - is ::"+r.x);
        System.out.println("Y - is :: "+r.y);

        String fontFamily = creatText.getCssValue("font-family");
        System.out.println("Font family is :: "+fontFamily);

        String fontsize = creatText.getCssValue("font-size");
        System.out.println("Font size is :: "+fontsize);

        String color = creatText.getCssValue("color");
        System.out.println("Font color is :: "+color);

        String fontweight = creatText.getCssValue("font-weight");
        System.out.println("Font weight is :: "+fontweight);

        System.out.println("isDisplayed status :: "+login.isDisplayed());
        System.out.println("isEnabled status :: "+login.isEnabled());

        login.click();
        // wait for some time so that the page loaded.
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
        String errorMessageText = errorMessage.getText();

        if(errorMessageText.contains("The email address or phone number that you've entered doesn't match any account.")){
            System.out.println("I am in error message page");
        } else {
            System.out.println("I am not into error message page");
        }

        //Thread.sleep(5000);


        //   //a[text()='Sign up for an account.']
        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
        S4_WebElementCommands obj = new S4_WebElementCommands();
        obj.launchBrowser();
    }


}

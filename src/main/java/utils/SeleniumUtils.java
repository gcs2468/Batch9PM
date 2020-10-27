package utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class SeleniumUtils {

    public static void takeScreenshot(WebDriver webdriver, String filePath) {
        try {
        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot = ((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile = new File(filePath + "Picture_" + System.nanoTime() + ".jpg");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*public String takeScreenshot(WebDriver driver) {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File(
                Constants.SCREENSHOT_DIR + "Screenshot_" + Commons.getCurrentTimeStamp() + ".png");
        try {
            org.apache.commons.io.FileUtils.copyFile(source, dest);

        } catch (IOException e) {
            //   TestBase.debug("IOException occurred while saving screenshot", e);
        }
        String path = dest.getAbsolutePath();
        //logger.info("Screen shot path : " + path);
        return dest.getAbsolutePath();
    }*/




}

package common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScfreenshotAndNAvigate {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        // Take the screen shot as file format using getscreenshotas method
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // now copy the screenshot to desired location using copyFile method
        FileUtils.copyFile(srcFile,new File("/Users/mozzamelhossain/IdeaProjects/AetnaDemo/generic/src/main/java/ExcellSheet/amazon.png"));

        driver.quit();
    }
}

package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileFromDesktop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("/Users/mozzamelhossain/Desktop/Selenium/test.docx");
       driver.quit();
    }
}

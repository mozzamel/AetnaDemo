package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IframeHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.freecrm.com/index.html");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("mozzamel1987");
        driver.findElement(By.name("password")).sendKeys("7866dcba");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.switchTo().frame("mainpanel");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        driver.quit();
    }
}

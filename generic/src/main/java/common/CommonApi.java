package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonApi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.aetna.com/");

        System.out.println(driver.getTitle());
        if (driver.getTitle().contains("Health Insurance Plans & Dental Coverage")) {
            System.out.println("Title is correct ");
        } else {
            System.out.println("title is not correct");
        }
        driver.findElement(By.name("Login")).click();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath(".//*[@id='login-register-btn']")).click();
        Thread.sleep(1000);

        driver.quit();


    }
}
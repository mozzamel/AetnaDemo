package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonApi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       driver.manage().window().maximize();
        driver.get("https://www.aetna.com/");
        System.out.println(driver.getTitle());
              if (driver.getTitle().contains("Health Insurance Plans & Dental Coverage")){
                  System.out.println("Title is correct ");
              }
              else {
                  System.out.println( "title is not correct");
              }
        System.out.println(driver.getPageSource());

              driver.findElement(By.xpath("//*[@id='-1551763390']/img")).click();
        System.out.println(driver.getCurrentUrl());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(int i =0; i<links.size();i++){
            System.out.println(links.size());
        }
        driver.quit();
    }

    


}
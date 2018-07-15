package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindTheAllLink {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    //  using list interface storing all webelement into links object and we know
        // all links are representing a tag
        List<WebElement> links = driver.findElements(By.tagName("a"));
        // with the help of for each loop iterating all link into ele webelement then get the link
        for(WebElement ele: links){
            System.out.println(ele.getAttribute("href"));
            System.out.println(ele.getText());
            System.out.println(ele.getSize());

        }
    }

}
package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.popuptest.com/goodpopups.html");
        Thread.sleep(8000);
        driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
        // set of object value are store on based of string
        Set<String> handler = driver.getWindowHandles();// get handels methods gives us one set of object of window
        Iterator<String> it =  handler.iterator();
        String parentWindow = it.next();
        System.out.println(parentWindow);
        String childWindow = it.next();
        System.out.println(childWindow);
        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}

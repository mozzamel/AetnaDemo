package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DynamicWebelement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.freecrm.com/index.html");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("mozzamel1987");
        driver.findElement(By.name("password")).sendKeys("7866dcba");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.switchTo().frame("mainpanel");
        Assert.assertEquals("mainpanel","mainpanel");

            Thread.sleep(5000);

        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
    // .//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]

       // method :1
        String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
        String after_xpath = "]/td[2]";
        for (int i = 4; i<=7;i++){
        String name =  driver.findElement(By.xpath(before_xpath+ i+ after_xpath)).getText();
        System.out.println(name);
        if (name.contains("md hossain ")){
            driver.findElement(By.xpath(".//*[@id='vContactsForm']/table/tbody/tr[4]/td[1]")).click();
        }


        }
    }
}

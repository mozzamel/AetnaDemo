package common;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJavaScriptPopUpHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","generic/driver/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
       //driver.switchTo().alert().accept();// we could d o in short cut way


        String text = alert.getText();
        if (text.contains("Please enter a valid user name")){
            System.out.println("correct alert message");
        }else {
            System.out.println("incorrect alert message");
        }
        alert.dismiss();
        driver.quit();

    }
}

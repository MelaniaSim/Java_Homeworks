package week2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        WebElement elem = driver.findElement(By.id("twotabsearchtextbox"));
        elem.clear();
        elem.sendKeys("iphone");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value = 'Go']")).click();
        Thread.sleep(1000);

    }
}

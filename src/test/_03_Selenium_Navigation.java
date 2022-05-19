package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _03_Selenium_Navigation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String expectedUrl = "https://www.amazon.com/";

        String actualTitle = driver.getTitle();
        String actualURL = driver.getCurrentUrl();

        if (actualTitle.equals(expectedTitle)) System.out.println("Title validation: PASSED\n");
        else System.out.println("Title validation: FAILED\n");

        if (actualURL.equals(expectedUrl)) System.out.println("Url validation: PASSED");
        else System.out.println("Url validation: FAILED");

        driver.quit();
        System.out.println("\nEnd of Program!");

    }
}

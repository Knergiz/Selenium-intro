package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.apple.com/");

        System.out.println("Title of page: " + driver.getTitle());

        if (driver.getTitle().equals("Apple")) System.out.println("Title = PASSED\n");
        else System.out.println("Title = FAILED\n");

        System.out.println("Current Url: " + driver.getCurrentUrl());

        if (driver.getCurrentUrl().equals("https://www.apple.com/")) System.out.println("Url = PASSED");
        else System.out.println("Url = FAILED");

        driver.quit();
        System.out.println("\nEnd of program!");

    }
}

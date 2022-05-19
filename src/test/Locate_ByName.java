package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Locate_ByName {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.name("q"));

        if (input.isDisplayed()) System.out.println("Validate input: PASSED");
        else System.out.println("Validate input: FAILED");

    }
}

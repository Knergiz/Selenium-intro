package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class _11_Locator_xpath {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");

        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));



        Driver.quitDriver();



    }
}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _12_sendKeys_click_methods {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement searchBar = driver.findElement(By.xpath("//div[@class='search-input']"));
        WebElement button = driver.findElement(By.xpath("//button"));

        searchBar.sendKeys("tesla");
        button.click();

        if (driver.findElement(By.xpath("//h1")).getText().equals("Tesla")) System.out.println("PASSED");
        else System.out.println("FAILED");

        driver.quit();



    }
}

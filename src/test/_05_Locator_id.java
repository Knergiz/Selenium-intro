package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));
        System.out.println("Validate logo is displaying: " + logo.isDisplayed());

        WebElement companyName = driver.findElement(By.className("color_18"));
        System.out.println("Validate company name is displaying: " + companyName.isDisplayed());

        WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf1"));
        System.out.println("Validate company quote is displaying: " + companyQuote.isDisplayed());



        Driver.quitDriver();
    }
}

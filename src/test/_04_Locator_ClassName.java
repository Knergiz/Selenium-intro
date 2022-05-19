package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Locator_ClassName {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement googleImage = driver.findElement(By.className("lnXdpd"));

        if (googleImage.isDisplayed()) System.out.println("Google image validation: PASSED");
        else System.out.println("Google image validation: FAILED");

        Driver.quitDriver();
    }
}

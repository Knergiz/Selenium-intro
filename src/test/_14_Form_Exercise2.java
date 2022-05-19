package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _14_Form_Exercise2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement firstName = driver.findElement(By.xpath("//input[contains(@name, 'first name')]"));
        WebElement lastName = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement email = driver.findElement(By.id("input_comp-khwb0zsz"));

        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        email.sendKeys("john.doe@gmail.com");

        //first name validation
        if (firstName.getAttribute("value").equals("John")) System.out.println("First name validation: PASSED");
        else System.out.println("First name validation: FAILED");

        //last name validation
        if (lastName.getAttribute("value").equals("Doe")) System.out.println("Last name validation: PASSED");
        else System.out.println("Last name validation: FAILED");

        //email name validation
        if (email.getAttribute("value").equals("john.doe@gmail.com")) System.out.println("Email validation: PASSED");
        else System.out.println("Email validation: FAILED");

        driver.quit();
        System.out.println("End of program");

    }
}

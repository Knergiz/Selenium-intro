package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _13_Form_Excercise {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement header = driver.findElement(By.id("comp-keehv7pd1"));
        WebElement paragraph = driver.findElement(By.id("comp-keei0711"));
        WebElement firstName = driver.findElement(By.xpath("//input[contains(@name, 'first name')]"));
        WebElement lastName = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement email = driver.findElement(By.id("input_comp-khwb0zsz"));
        WebElement button = driver.findElement(By.id("comp-khwayqh22"));

        if (header.isDisplayed() && header.getText().equals("Subscribe")) System.out.println("Header validation: PASSED");
        else System.out.println("Header validation: FAILED");

        if (paragraph.isDisplayed() && paragraph.getText().equals("Stay up to date!")) System.out.println("Paragraph validation: PASSED");
        else System.out.println("Paragraph validation: FAILED");

        if (firstName.isEnabled() && firstName.isDisplayed() && firstName.getAttribute("placeholder").equals("Enter your first name"))
            System.out.println("First name validation: PASSED");
        else System.out.println("First name validation: FAILED");

        if (lastName.isEnabled() && lastName.isDisplayed() && lastName.getAttribute("placeholder").equals("Enter your last name"))
            System.out.println("Last name validation: PASSED");
        else System.out.println("Last name validation: FAILED");

        if (email.isEnabled() && email.isDisplayed() && email.getAttribute("placeholder").equals("Add your email")) System.out.println("Email validation: PASSED");
        else System.out.println("Email validation: FAILED");

        if (button.isEnabled() && button.isDisplayed() && button.getText().equals("SUBSCRIBE")) System.out.println("Button validation: PASSED");
        else System.out.println("Button validation: FAILED");

        driver.quit();
        System.out.println("End of program");

    }

}

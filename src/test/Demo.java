package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {

        // setting up drivers
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DJKre\\IdeaProjects\\selenium_intro\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // drivers all set up!

        // going to site of choice
        driver.get("https://www.google.com/");

        // validate that title is Google
        System.out.println("The title of the page is: " + driver.getTitle());

        if (driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation Failed");

        driver.quit();

        System.out.println("End of the program");

    }
}

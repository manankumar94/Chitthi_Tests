package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();

        driver.get("https://chitthhii.netlify.app/");

        WebElement registerLink = driver.findElement(By.id("https://chitthhii.netlify.app/register")); 
        registerLink.click();

        WebElement usernameField = driver.findElement(By.id("Username")); 
        WebElement emailField = driver.findElement(By.id("Email"));       
        WebElement passwordField = driver.findElement(By.id("Password")); 
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword")); 
        WebElement registerButton = driver.findElement(By.id("register")); 

        usernameField.sendKeys("testuser123");
        emailField.sendKeys("testuser123@example.com");
        passwordField.sendKeys("password123");
        confirmPasswordField.sendKeys("password123");
        registerButton.click();

        String expectedUrl = "https://chitthhii.netlify.app"; 
        if (driver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("Register Test Passed");
        } else {
            System.out.println("Register Test Failed");
        }

        driver.quit();
    }
}

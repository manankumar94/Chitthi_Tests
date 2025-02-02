package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chitthhii.netlify.app/register");

        WebElement Username = driver.findElement(By.id("Username"));
        WebElement Email = driver.findElement(By.id("Email"));
        WebElement Password = driver.findElement(By.id("Password"));
        WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));

        String username = driver.findElement(By.id("username")).getAttribute("value");  
        String email = driver.findElement(By.id("email")).getAttribute("value");  
        String password = driver.findElement(By.id("password")).getAttribute("value");  
        String confirmPassword = password;  
        usernameField.sendKeys(username);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);

   
        WebElement registerButton = driver.findElement(By.id("register"));
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

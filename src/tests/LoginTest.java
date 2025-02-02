package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    
        driver.get("https://chitthhii.netlify.app/login");

        String username = driver.findElement(By.id("username")).getText(); 
        String password = driver.findElement(By.id("password")).getText(); 

        WebElement Username = driver.findElement(By.id("Username"));
        WebElement Password = driver.findElement(By.id("Password"));
        WebElement loginButton = driver.findElement(By.id("login"));

   
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

     
        String expectedUrl = "https://chitthhii.netlify.app"; 
        if (driver.getCurrentUrl().equals(expectedUrl)) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }

        driver.quit();
    }
}

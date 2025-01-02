package com.example.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAutomationTest {
    @Test
    public void testLogin() {
        // Set up the WebDriver
        System.out.println("ChromeDriver Path: " + System.getenv("CHROMEDRIVER_PATH"));
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveena G\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to the login page
            driver.get("https://github.com/login");
            // Locate the username and password fields
            WebElement usernameField = driver.findElement(By.id("login_field"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.name("commit"));
            // Perform login
            usernameField.sendKeys("heyitsmeh1");
            passwordField.sendKeys("Hey12345h");
            loginButton.click();
            // Validate successful login
            String expectedTitle = "GitHub";
            String actualTitle = driver.getTitle();
            assertEquals(expectedTitle, actualTitle);
        } finally {
            // Close the browser
            driver.quit();
        }
    }
    
}

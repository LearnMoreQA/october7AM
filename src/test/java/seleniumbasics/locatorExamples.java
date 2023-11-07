package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorExamples {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        WebElement element = driver.findElement(By.id("username"));
        element.sendKeys("testuser");
        driver.findElement(By.name("pw")).sendKeys("pass123"); // Method Chaining
        driver.findElement(By.id("Login")).click();
        String actualText = driver.findElement(By.id("error")).getText();
        String expectedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

        if(actualText.equals(expectedText)){ // Boolean = true
            System.out.println("Test Case PASSED");
        }else{
            System.out.println("Test Case FAILED");
        }
    }
}

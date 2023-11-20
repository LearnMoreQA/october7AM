package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {
    WebDriver driver;

    @Given("User navigates to salesforce url")
    public void navigateToUrl(){
        driver = new ChromeDriver(); //  Webdriver driver --> Local Variable (With in a Method)
        driver.get("https://login.salesforce.com/?locale=in");
    }
    @When("User enters the valid credentials")
    public void enterValidCredentials() {
        WebElement element = driver.findElement(By.id("username"));
        element.sendKeys("sidabec707-ktuu@force.com");
        driver.findElement(By.name("pw")).sendKeys("Admin@123");
    }
    @And("User clicks on login button")
    public void clickLoginButton() {
        driver.findElement(By.id("Login")).click();
    }
    @Then("User should navigated to home page")
    public void verifyHomePage() {
        boolean isHomePageDisplayed = driver.findElement(By.xpath("//span[text()='Home']")).isDisplayed();
        Assert.assertEquals("Home Page Displayed Successfully",true ,isHomePageDisplayed);
    }

}

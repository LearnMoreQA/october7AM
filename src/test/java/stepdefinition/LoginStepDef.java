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

    @Given("User navigates to saucedemo url")
    public void navigateToUrl(){
        driver = new ChromeDriver(); //  Webdriver driver --> Local Variable (With in a Method)
        driver.get("https://www.saucedemo.com/v1/index.html");
    }
    @When("User enters the valid credentials")
    public void enterValidCredentials() {
        userEntersUsernameAndPassword("standard_user","secret_sauce");
    }
    @And("User clicks on login button")
    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("User should navigated to home page")
    public void verifyHomePage() {
        boolean isHomePageDisplayed = driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed();
        Assert.assertEquals("Home Page Displayed Successfully",true ,isHomePageDisplayed);
    }

    @When("User enters the username as {string} and password as {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        WebElement element = driver.findElement(By.id("user-name"));
        element.sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }


}

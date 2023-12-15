package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMoreSD {
    WebDriver driver=new ChromeDriver();;
    @Given("User Navigates to {string} URL")
    public void navigateToUrl(String URL) {
        driver.get(URL);
        if (driver.findElement(By.xpath("//div[text()=\"Search Flight\"]/parent::div")).isDisplayed()){
            System.out.println("Page is loaded");
        }
    }
    @When("User click on {string} button")
    public void SelectRadioButton(String Trip) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//div[text()='"+Trip.toLowerCase()+"']")).click();
    }
    @When("User selects From location as {string} and To location as {string}")
    public void FromToDropDown(String From, String To) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//div[text()='From']/following-sibling::div/input")).sendKeys(From.substring(0,2));
        driver.findElement(By.xpath("//div[text()='Cities']/parent::div/following-sibling::div/child::div/child::div/child::div/child::div[text()='"+From+"']")).click();
        driver.findElement(By.xpath("//div[text()='To']/following-sibling::div/input")).sendKeys(To.substring(0,2));
        driver.findElement(By.xpath("//div[text()='Cities']/parent::div/following-sibling::div/child::div/child::div/child::div/child::div[text()='"+To+"']")).click();
    }
}

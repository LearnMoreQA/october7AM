package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsStepDef_Mathan {
    WebDriver driver=new ChromeDriver();
    @Given("User Navigates to alerts URL")
    public void user_navigates_to_url() {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
    }

    @When("user clicks on {string} button and verifies {string} message")
    public void user_clicks_on_button_and_verifies_message(String button, String string2) {
       driver.findElement(By.name(button)).click();
       Boolean ComFlag=driver.switchTo().alert().getText().equals("I am alert");
        Assert.assertEquals("Expected alert message is displayed",true,ComFlag);
    }

    @When("user accepts the alert")
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}

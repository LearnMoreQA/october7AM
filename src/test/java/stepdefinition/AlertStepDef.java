package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;

public class AlertStepDef {
    WebDriver driver;

    @Given("user navigates to url")
    public void user_navigates_to_url() throws IOException {
        driver = new ChromeDriver();
        String  appUrl = ConfigReader.readProperty().getProperty("url");
        driver.get(appUrl);
    }
    @When("User clicks on {string} Button in Alert")
    public void user_clicks_on_ok_button_in_alert(String buttonType) throws InterruptedException {
        switch (buttonType){
            case "ok" -> {
                driver.findElement(By.name("alert")).click();
                Thread.sleep(3000);
                driver.switchTo().alert().accept();
            }
            case "cancel" -> {
                driver.findElement(By.name("confirmation")).click();
                Thread.sleep(3000);
                driver.switchTo().alert().dismiss();
            }
            default -> System.out.println("Invalid Button Type");
        }

    }
    @Then("User verifies the Title of the Page")
    public void user_verifies_the_title_of_the_page() {
        String actualValue = driver.findElement(By.className("title")).getText();
        Assert.assertEquals("","Practice Alerts",actualValue);
    }

    @When("User Enters the {string} in Prompt Popup")
    public void userEntersTheInPromptPopup(String text) {
        driver.findElement(By.name("prompt")).click();
        driver.switchTo().alert().sendKeys(text);
    }

    @And("User clicks on ok Button in Prompt Alert")
    public void userClicksOnOkButtonInPromptAlert() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}

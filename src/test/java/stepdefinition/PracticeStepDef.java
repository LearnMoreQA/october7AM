package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeStepDef {




    @Given("User navigates to Learnmoreqa url")
    public void navigatetourl() {
        driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/dropdown.html");
    }
    @Given("User selects Ruby from dropdown")
    public void Selectdropdown() {
    }
    @Then("User verifies the dropdown selection")
    public void Verifydropdown() {

    }
}

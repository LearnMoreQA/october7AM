package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;
import reuseable.BaseClass;

import java.io.IOException;

public class BankStepDef {
    WebDriver driver;
    BaseClass reuse;

    LoginPage login;

    RegisterPage register;

    public BankStepDef(){
        reuse = new BaseClass();
        login = new LoginPage(driver);
        register = new RegisterPage(driver);
    }


    @Given("User navigates to Application Url")
    public void user_navigates_to_application_url() throws IOException {
        driver = reuse.getUrl();
    }
    @When("User clicks on Register Link")
    public void user_clicks_on_register_link() {
        login.clickRegisterLink();
    }
    @When("User fills the Register Form")
    public void user_fills_the_register_form() {
        register.enterFistName();
        register.enterlastName();
    }
    @Then("User verifies the Success Message")
    public void user_verifies_the_success_message() {

    }


}

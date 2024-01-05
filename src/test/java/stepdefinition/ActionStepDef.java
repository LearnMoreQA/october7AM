package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ActionPage;
import pageobjects.RegisterPage;

public class ActionStepDef {

    private ActionPage actionPage;

    @When("User clicks on {string}")
    public void contextClick(String actionType){
        actionPage = new ActionPage().clickOnRightClickBtn(actionType);
    }

    @Then("User verifies the message")
    public void userVerifiesTheMessage() {
        actionPage.verifyActionMessage();
    }

    @Given("User enter All the Input Fields")
    public void userEnterAllTheInputFields() {
        new RegisterPage().enterRegisterForm();
    }
}

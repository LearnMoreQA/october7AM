package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ActionPage;
import pageobjects.RegisterPage;
import utils.ReadExcel;

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
       String fname = ReadExcel.getData("FormData",0,1,0);
        String lname = ReadExcel.getData("FormData",0,1,1);
        String email = ReadExcel.getData("FormData",0,1,2);
        String mobNo = ReadExcel.getData("FormData",0,1,3);
        String addr = ReadExcel.getData("FormData",0,1,4);
       new RegisterPage().enterRegisterForm(fname,lname,email,mobNo,addr);
    }
}

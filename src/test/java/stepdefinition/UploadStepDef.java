package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.UploadPage;

public class UploadStepDef {

    @When("User enters the file path")
    public void enterFilePath(){
        new UploadPage().enterFilePath().verifyFilePath();
    }

    @Then("User verifies the file path")
    public void userVerifiesTheFilePath() {
    }
}

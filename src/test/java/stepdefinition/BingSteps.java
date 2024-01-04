package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.BingPage;

public class BingSteps {

    BingPage bing;

    @When("User enters the Keyword")
    public void enterKey(){
        bing = new BingPage();
        bing.enterKeyWord();
    }

    @And("User Clears the Keyword")
    public void clearKey(){
        bing.clearKeyWord();
    }
}

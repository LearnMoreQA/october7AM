package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pageobjects.Amazon.ResultPage;
import pageobjects.Amazon.SearchPage;
import utils.DriverUtils;

public class AmazonSteps {

    private SearchPage searchPage;

    private ResultPage resultPage;

    public AmazonSteps(){
        searchPage = new SearchPage();
        resultPage = new ResultPage();
    }

    @Given("User enter and clicks on {string} product")
    public void userEnterAndClickProduct(String keyword) {
        searchPage.enterProductKeyword(keyword + Keys.ENTER);
        resultPage.clickProduct(keyword);
    }

    @Then("User verifies the {string} Product name")
    public void userVerifiesTheProductName(String productName) {
        String actual = DriverUtils.getInstance().getDriver().getTitle();
        System.out.println(actual);
        Assert.assertTrue(actual.contains(productName));
    }

    @And("User switched to new window")
    public void userSwitchedToNewWindow() {
        resultPage.navigateToChildWindow();
    }

    @When("User navigates to Advertisement")
    public void userNavigatesToAdvertisement() {
        resultPage.navigateToFrame();
    }

    @And("User Clicks on Add to Cart Button")
    public void userClicksOnAddToCartButton() {
        resultPage.clickCartBtn();
    }

    @Then("User verifies the {string} message")
    public void userVerifiesTheMessage(String msg) {
        resultPage.verifyAddedMsg(msg);
    }

    @Then("User verifies Product Title is Present")
    public void userVerifiesProductTitleIsPresent() {
        resultPage.isBookTitleDisplayed();
    }

    @Given("User enter the {string} product")
    public void userEnterTheProduct(String keyword) {
        searchPage.enterProductKeyword(keyword + Keys.ENTER);
    }
}

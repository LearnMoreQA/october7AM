package stepdefinition;

import io.cucumber.java.en.When;
import pageobjects.CalendarPage;

public class CalendarStepDef {

    @When("User clicks on future Date")
    public void clickFutureDate(){
        new CalendarPage().clickOnDatePicker().clickFutureDate();
    }
}

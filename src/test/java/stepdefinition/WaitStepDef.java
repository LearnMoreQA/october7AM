package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.TodoPage;

public class WaitStepDef {

    private TodoPage todo;

    public WaitStepDef(){
        todo = new TodoPage();
    }

    @When("User enters the Task and Click Add Button")
    public void user_enters_the_task_and_click_add_button() {
        todo.enterTask().clickAddBtn();
    }
    @Then("User verifies the Task")
    public void user_verifies_the_task() {
        todo.verifyTask();
        todo.clickDeleteBtn();
    }
}

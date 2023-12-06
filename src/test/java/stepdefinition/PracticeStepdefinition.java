package stepdefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PracticeStepdefinition {


    WebDriver driver;

 Select select;

    @Given("User navigates to Learnmoreqa url")
    public void navigatetourl() {
        driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/dropdown.html");
    }
    @When("User selects {string} from dropdown")
    public void userSelectsFromDropdown(String option) {


        WebElement dropdown = driver.findElement(By.id("selectDropdown"));
        select = new Select(dropdown);
        select.selectByVisibleText(option);
        //select.selectByValue(option);
        // select.selectByIndex(2);
    }

    @Then("User verifies the {string} from dropdown selection")
    public void userVerifiesTheFromDropdownSelection(String option) {
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption + " Option is Selected",
                "Ruby",selectedOption);

    }


    }


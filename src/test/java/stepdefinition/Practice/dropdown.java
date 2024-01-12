package stepdefinition.Practice;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {


    WebDriver driver;

    Select select;

    @Given("User navigates to Learnmoreqa url")
    public void navigatetourl() {
        driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/dropdown.html");
    }

    @Given("User selects Ruby from dropdown")
    public void selectdropdown(String option) {


        WebElement dropdown = driver.findElement(By.id("selectDropdown"));
        select = new Select(dropdown);
        select.selectByVisibleText(option);
        //select.selectByValue(option);
        // select.selectByIndex(2);
    }

    @Then("User verifies the dropdown selection")
    public void verifydropdown(String option) {


        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption + " Option is Selected",
                "Ruby", selectedOption);

    }
}



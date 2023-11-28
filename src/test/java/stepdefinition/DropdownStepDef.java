package stepdefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownStepDef {

    WebDriver driver;

    Select select;

    @Given("User navigates to spicejet url")
    public void navigateToUrl() {
        driver = new ChromeDriver(); //  Webdriver driver --> Local Variable (With in a Method)
        driver.get("https://www.saucedemo.com/v1/index.html");
    }
    @When("User selects the {string} Currency")
    public void selectCurrency(String currency) {
       List<WebElement> currencyEle = driver.findElements(
               By.xpath("//div[text()='Currency']/parent::div/following-sibling::div/descendant::div[@data-focusable='true']/child::div"));

    }
    @Then("User verifies the {string} Currency")
    public void verifyCurrency(String currency) {

    }

    @Given("User navigate and Logged to swaglabs url")
    public void navigatesSwagLabsUrl() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
    @When("User Selects the {string} condition")
    public void selectCondition(String option) {
        WebElement dropdownEle = driver.findElement(By.className("product_sort_container"));
        select = new Select(dropdownEle);
        select.selectByVisibleText(option);
        //select.selectByValue(option);
        //select.selectByIndex(2);
    }
    @Then("User verifies the selected option of {string}")
    public void verifySelectedOption(String option) {
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption + " Dropdown Value Selected Successfully",option,selectedOption);
    }

}

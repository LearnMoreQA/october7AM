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
        driver.get("https://www.spicejet.com/");
    }
    @When("User selects the {string} Currency")
    public void selectCurrency(String currencyOption) {
        WebElement currencyDropdownEle = driver.findElement(By.xpath("//div[text()='Currency']/parent::div"));
        currencyDropdownEle.click();
       List<WebElement> currencyEle = currencyDropdownEle.findElements(
               By.xpath("following-sibling::div/descendant::div[@data-focusable='true']/child::div"));

       for (WebElement currency : currencyEle){
           if(currency.getText().equals(currencyOption)){
               currency.click();
           }
       }
    }
    @Then("User verifies the {string} Currency")
    public void verifyCurrency(String currency) {
        WebElement cuEle = driver.findElement(By.xpath("//div[text()='Currency']/following-sibling::div/child::div[text()='"+currency+"']"));
        System.out.println(cuEle);
        Assert.assertEquals(currency + " Option is Selected",true,cuEle.isDisplayed());
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

    @Given("User navigates to demoqa url")
    public void user_navigates_to_demoqa_url() {
        driver = new ChromeDriver(); //  Webdriver driver --> Local Variable (With in a Method)
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
    }
    @When("User selects the {string} color")
    public void user_selects_the_color(String colorOption) {
        WebElement menuEle = driver.findElement(By.id("oldSelectMenu"));
        select = new Select(menuEle);
        select.selectByVisibleText(colorOption);
    }
    @When("User Deselects the color")
    public void user_deselects_the_color() {
        select.deselectByVisibleText("Red");
    }
    @Then("User verifies the {string} color")
    public void user_verifies_the_color(String string) {

    }

    public void selectPlaceDropdown(String place){
        List<WebElement> citiesEle = driver.findElements(
                By.xpath("//div[text()='Cities']/parent::div/following-sibling::div/descendant::div//div//div//div[contains(@class,'r-ubezar')]"));
        for (WebElement city : citiesEle){
            if(city.getText().equals(place)){
                city.click();
            }
        }
    }


    @When("User Enters the From Place as {string}")
    public void user_enters_the_from_place_as(String source) {
        WebElement FromEle = driver.findElement(By.xpath("//div[text()='From']/following-sibling::div//input"));
        FromEle.click();
        FromEle.sendKeys(source);
        selectPlaceDropdown(source);
    }
    @When("User Enters the To Place as {string}")
    public void user_enters_the_to_place_as(String destination) {
        WebElement ToEle = driver.findElement(By.xpath("//div[text()='To']/following-sibling::div//input"));
        ToEle.clear();
        //ToEle.click();
        ToEle.sendKeys(destination);
        selectPlaceDropdown(destination);
    }
    @Then("User verifies the From as {string} and To Place as {string}")
    public void user_verifies_the_from_and_to_place(String from,String to) {
        String actualFrom = driver.findElement(By.xpath("//div[text()='From']/following-sibling::div/child::input")).getAttribute("value"); // Agra (AGR)
        String actualTo = driver.findElement(By.xpath("//div[text()='To']/following-sibling::div/child::input")).getAttribute("value"); // Jaipur (JAI)
    }




}

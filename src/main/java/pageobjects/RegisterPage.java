package pageobjects;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

public class RegisterPage extends BaseClass {

    public RegisterPage(){
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    public void enterFistName(){
        enterText(firstName,"Test");
    }

    public void enterlastName(){
        enterText(lastName,"User");
    }

}

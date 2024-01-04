package pageobjects;

import mehodfactory.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

public class LoginPage extends BaseClass {

    public LoginPage(){
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    public void clickRegisterLink(){
       // clickOnElement(registerLink);
        clickOnElementUsingJs(registerLink);
    }


}

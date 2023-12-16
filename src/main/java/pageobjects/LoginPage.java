package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    public void clickRegisterLink(){
        clickOnElement(registerLink);
    }

    public void clickOnElement(WebElement ele){

    }


}

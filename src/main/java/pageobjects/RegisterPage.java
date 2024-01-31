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

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "userNumber")
    private WebElement mobileNumber;

    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    private WebElement address;

    public void enterRegisterForm(String fname,String lname,String mail,String mobNo,String addr){
        enterText(firstName,fname);
        enterText(lastName,lname);
        enterText(email,mail);
        enterText(mobileNumber,mobNo);
        enterText(address,addr);
    }




}

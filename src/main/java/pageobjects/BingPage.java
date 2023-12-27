package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

import java.security.Key;

public class BingPage extends BaseClass {

    public BingPage(){
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }

    @FindBy(name = "q")
    private WebElement input;

    public void enterKeyWord(){
        enterText(input,"Erode");
    }
    public void clearKeyWord(){
        clearText(input);
    }

}

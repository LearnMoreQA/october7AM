package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

public class ActionPage extends BaseClass {

    public ActionPage(){
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }

    @FindBy(id = "Right Click")
    private WebElement rightClickBtn;

    @FindBy(id = "actionMsg")
    private WebElement actMsg;

    public ActionPage clickOnRightClickBtn(String actionType){
        mouseAction(rightClickBtn,actionType);
        return this;
    }

    public void verifyActionMessage(){
        verifyText(actMsg,"I was Right Clicked");
    }



}

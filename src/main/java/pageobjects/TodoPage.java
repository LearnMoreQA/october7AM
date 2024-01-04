package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

public class TodoPage extends BaseClass {

    public TodoPage(){
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }

    @FindBy(id = "new-todo")
    private WebElement todoInput;

    @FindBy(id = "add-btn")
    private WebElement addBtn;

    @FindBy(xpath = "//span[text()='walk']")
    private WebElement taskOne;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement deleteBtn;

    public TodoPage enterTask(){
        enterText(todoInput,"walk");
       return this;
    }

    public TodoPage clickAddBtn(){
        clickOnElement(addBtn);
        return this;
    }

    public void verifyTask(){
        Assert.assertEquals("",true,verifyElementDisplayed(taskOne));
    }

    public TodoPage clickDeleteBtn(){
        clickOnElement(deleteBtn);
        return this;
    }



}

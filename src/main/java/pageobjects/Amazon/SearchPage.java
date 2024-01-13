package pageobjects.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

public class SearchPage extends BaseClass {

    public SearchPage(){
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;


    public void enterProductKeyword(String keyword){
        enterText(searchBox,keyword);
    }


}

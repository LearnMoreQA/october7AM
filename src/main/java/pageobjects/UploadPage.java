package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

public class UploadPage extends BaseClass {

    public UploadPage(){
            PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
        }


        @FindBy(id = "uploadfile_0")
    private WebElement uploadBtn;


    public UploadPage enterFilePath(){
        enterText(uploadBtn,System.getProperty("user.dir")+ "/src/main/resources/upload/sample.pdf");
        return this;
    }

    public void verifyFilePath(){
        System.out.println( uploadBtn.getText());
    }

}

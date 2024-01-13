package pageobjects.Amazon;

import io.cucumber.java.be.I;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import reuseable.BaseClass;
import utils.DriverUtils;

import java.time.Duration;
import java.util.List;

public class ResultPage extends BaseClass {

    public ResultPage(){
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }

    @FindBy(xpath = "//div[@data-cy='title-recipe']/descendant::a/child::span")
    private List<WebElement> products;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//div[@id='attachDisplayAddBaseAlert']/child::div/h4")
    private WebElement addedEle;

    @FindBy(xpath = "//div[@data-current-screen='banner-md']/div[contains(@class,'grid-buy-box')]//span[@data-testid='productTitle']")
    private WebElement bookTitle;

    @FindBy(xpath = "//span[text()='Need help?']")
    private WebElement help;

    @FindBy(xpath = "(//div[@class='amzn-safe-frame-container'])[1]")
    private WebElement footer;

    @FindBy(xpath = "//div[@id='ape_Search_auto-bottom-advertising-0_portal-batch-fast-btf-loom_placement']/iframe")
    private WebElement innerIframe;

    public void clickProduct(String expectedText){
        clickFromListOfElement(products,expectedText);
    }

    public void navigateToChildWindow(){
        switchToChildWindow();
    }

    public void navigateToFrame(){
        scrollToElement(help);
        fluentWaitForVisible(footer);
        System.out.println(DriverUtils.getInstance().getDriver().findElements(By.tagName("iframe")).size());
        switchToIframeWithIndex(0);
        switchToIframeWithElement(innerIframe);
        backToPartentFrame();
        System.out.println("Parent Iframe ID :"+getAttributeValue(innerIframe,"id"));
        backToDefault();
        String title = getPageTitle();
        System.out.println("Page Title : "+title);
    }

    public void clickCartBtn(){
        clickOnElementUsingJs(addToCartBtn);
    }

    public void verifyAddedMsg(String expectedMsg){
        WebElement addEle = fluentWaitForVisible(addedEle);
        verifyText(addEle,expectedMsg);
    }

    public void isBookTitleDisplayed(){
        Assert.assertTrue(bookTitle.isDisplayed());
        System.out.println(bookTitle.getText());
    }

}

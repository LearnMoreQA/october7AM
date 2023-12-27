package reuseable;

import mehodfactory.DriverActions;
import mehodfactory.ElementActions;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.DriverUtils;

import java.time.Duration;

public class BaseClass implements DriverActions, ElementActions {

    // DriverUtils.getInstance() == new DriverUtils();

    public void getUrl() {
        DriverUtils.getInstance().getDriver().get(ConfigReader.getInstance().getUrl());
    }

    public void clickOnElement(WebElement ele){
        try{
            ele.click();
        }catch (Exception e){
            Assert.fail(e.toString());
        }
    }

    public void clearText(WebElement ele){
        ele.clear();
    }
    public void enterText(WebElement ele,String textValue){
        explicitlyWaitForVisible(ele);
        try {
            ele.sendKeys(textValue);
        }catch (Exception e){
            Assert.fail(e.toString());
        }
    }

    public void clickOnElementUsingJs(WebElement element){
       JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getInstance().getDriver();
       js.executeScript("arguments[0].click()",element);
    }

    public void enterTextUsingJs(WebElement element,String value){
        JavascriptExecutor js = (JavascriptExecutor) DriverUtils.getInstance().getDriver();
        js.executeScript("arguments[0].value=arguments[1]",element,value);
    }

    public void explicitlyWaitForVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverUtils.getInstance().getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public boolean verifyElementDisplayed(WebElement element){
        explicitlyWaitForVisible(element);
        return element.isDisplayed();
    }

}

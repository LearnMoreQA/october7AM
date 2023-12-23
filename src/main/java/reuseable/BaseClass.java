package reuseable;

import mehodfactory.DriverActions;
import mehodfactory.ElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.DriverUtils;

import java.io.IOException;
import java.time.Duration;

public class BaseClass implements DriverActions, ElementActions {

    // DriverUtils.getInstance() == new DriverUtils();

    public void getUrl() {
        DriverUtils.getInstance().getDriver().get(ConfigReader.getInstance().getUrl());
    }

    public void clickOnElement(WebElement ele){
        ele.click();
    }

    public void enterText(WebElement ele,String textValue){
      explicitlyWaitForVisible(ele);
      ele.sendKeys(textValue);
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

}

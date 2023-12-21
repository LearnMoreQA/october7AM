package reuseable;

import mehodfactory.DriverActions;
import mehodfactory.ElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.DriverUtils;

import java.io.IOException;

public class BaseClass implements DriverActions, ElementActions {

    // DriverUtils.getInstance() == new DriverUtils();

    public void getUrl() {
        DriverUtils.getInstance().getDriver().get(ConfigReader.getInstance().getUrl());
    }

    public void clickOnElement(WebElement ele){
        ele.click();
    }

    public void enterText(WebElement ele,String textValue){
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

}

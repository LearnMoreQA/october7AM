package reuseable;

import mehodfactory.DriverActions;
import mehodfactory.ElementActions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.DriverUtils;

import javax.swing.*;
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

    public void enterTextWithEnterKey(WebElement ele,String textValue){
        explicitlyWaitForVisible(ele);
        try {
            ele.sendKeys(textValue + Keys.ENTER);
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

    public void mouseAction(WebElement element,String actionType){
        Actions action = new Actions(DriverUtils.getInstance().getDriver());
        switch (actionType){
            case "click" -> action.click(element).build().perform();
            case "click and hold" -> action.clickAndHold(element).build().perform();
            case "double click" -> action.doubleClick(element).build().perform();
            case "right click" -> action.contextClick(element).build().perform();
            case "move to element" -> action.moveToElement(element).build().perform();
            default -> throw new RuntimeException("Invalid Action Type.");
        }
    }

    public void verifyText(WebElement element, String expectedText){
        String actualText = element.getText().trim();
        Assert.assertEquals("Both Text is  Matched",expectedText,actualText);
    }


    public String getElementText(WebElement element){
        return element.getText().trim();
    }


}

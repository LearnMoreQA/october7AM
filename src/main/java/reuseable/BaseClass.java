package reuseable;

import mehodfactory.DriverActions;
import mehodfactory.ElementActions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.DriverUtils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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


    public void clickFromListOfElement(List<WebElement> elements,String expectedText){
        for (WebElement element : elements){
            System.out.println(element.getText());
            if(element.getText().equals(expectedText)){
                element.click();
                break;
            }
        }
    }

    public void switchToChildWindow(){
        String parent =DriverUtils.getInstance().getDriver().getWindowHandle();

        System.out.println(parent);

        Set<String> child =DriverUtils.getInstance().getDriver().getWindowHandles();

        for (String childWindow: child) {
            if (!parent.equals(childWindow)) {
                DriverUtils.getInstance().getDriver().switchTo().window(childWindow);
                System.out.println("Switched to Child Window" );
            }
        }

    }

    public String getAttributeValue(WebElement element,String attribute){
       return element.getAttribute(attribute);
    }


    public void switchToIframeWithIndex(int index){
        DriverUtils.getInstance().getDriver().switchTo().frame(index);
        System.out.println("Switched to Iframe");
    }

    public void backToPartentFrame(){
        DriverUtils.getInstance().getDriver().switchTo().parentFrame();
    }

    public void backToDefault(){
        DriverUtils.getInstance().getDriver().switchTo().defaultContent();
    }


    public void switchToIframeWithElement(WebElement element){
        DriverUtils.getInstance().getDriver().switchTo().frame(element);
        System.out.println("Switched to Inner Iframe");
    }

    public WebElement fluentWaitForVisible(WebElement element){
        Wait<WebDriver> wait = new FluentWait<>(DriverUtils.getInstance().getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }



    public void scrollToElement(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) DriverUtils.getInstance().getDriver());
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }


    public String getPageTitle(){
       return DriverUtils.getInstance().getDriver().getTitle();
    }

}

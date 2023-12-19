package reuseable;

import mehodfactory.DriverActions;
import mehodfactory.ElementActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;

public class BaseClass implements DriverActions, ElementActions {

    WebDriver driver;


    public WebDriver getUrl() throws IOException {
        driver = new ChromeDriver();
        driver.get(ConfigReader.readProperty().getProperty("url"));
        return driver;
    }

    public void clickOnElement(WebElement ele){
        ele.click();
    }

    public void enterText(WebElement ele,String textValue){
       ele.sendKeys(textValue);
    }

    public void clickOnElementUsingJs(WebElement element){
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click()",element);
    }

    public void enterTextUsingJs(WebElement element,String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1]",element,value);
    }

}

package reuseable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;

public class BaseClass {

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
}

package mehodfactory;

import org.openqa.selenium.WebElement;

public interface ElementActions {

    void clickOnElement(WebElement ele);

    void enterText(WebElement ele, String text);

    boolean verifyElementDisplayed(WebElement ele);


}

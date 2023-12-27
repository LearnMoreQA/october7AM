package mehodfactory;



public interface ElementActions {

    void clickOnElement(WebElement ele);

    void enterText(WebElement ele, String text);

    boolean verifyElementDisplayed(WebElement ele);


}

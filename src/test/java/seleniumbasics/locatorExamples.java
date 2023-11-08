package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorExamples {

    WebDriver driver; // Global Variable


    public void loginMethod(){
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        WebElement element = driver.findElement(By.id("username"));
        element.sendKeys("testuser");
        driver.findElement(By.name("pw")).sendKeys("pass123"); // Method Chaining
        driver.findElement(By.id("Login")).click();
        String actualText = driver.findElement(By.id("error")).getText();
        String expectedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

        if(actualText.equals(expectedText)){ // Boolean = true
            System.out.println("Test Case PASSED");
        }else{
            System.out.println("Test Case FAILED");
        }
    }

    public void clickForgotPassword(){
        driver = new ChromeDriver(); //  Webdriver driver --> Local Variable (With in a Method)
        driver.get("https://login.salesforce.com/?locale=in");
        //driver.findElement(By.linkText("Forgot Your Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
    }

    public void enterUserNameInForgotPwd(){
        WebElement labelEle = driver.findElement(By.tagName("label"));
        boolean isLabelDisplayed = labelEle.isDisplayed();
        if (isLabelDisplayed){ // if (true)
            System.out.println(labelEle.getText() + " is Displayed");
        }
    }

    public void validateResetText(){
        WebElement resetEle = driver.findElement(By.className("username"));
        if(resetEle.isDisplayed()){
            System.out.println(resetEle.getText() + " is Present");
        }
    }


    public static void main(String[] args) {
        locatorExamples objRef = new locatorExamples();
        objRef.clickForgotPassword();
        objRef.enterUserNameInForgotPwd();
        objRef.validateResetText();
    }

}

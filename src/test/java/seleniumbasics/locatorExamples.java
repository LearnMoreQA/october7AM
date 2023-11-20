package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorExamples {

    WebDriver driver; // Global Variable

    WebElement chkbox;

<<<<<<< HEAD
    public void navigateToUrl(){
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver(); //  Webdriver driver --> Local Variable (With in a Method)
        driver.get("https://login.salesforce.com/?locale=in");
    }

    public void clickCheckbox(){
        chkbox = driver.findElement(By.xpath("//div/child::input[@id='rememberUn']"));
        chkbox.click();
    }

    public void verifyCheckbox(){
        if(chkbox.isSelected()){
            System.out.println("Checkbox is Checked. Test Case PASSED");
        }else{
            System.out.println("Test Case FAILED");
        }
    }
=======
public void navigateToUrl(){
    //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
    driver = new ChromeDriver(); //  Webdriver driver --> Local Variable (With in a Method)
    driver.get("https://login.salesforce.com/?locale=in");
}

public void clickCheckbox(){
    chkbox = driver.findElement(By.xpath("//div/child::input[@id='rememberUn']"));
    chkbox.click();
}

public void verifyCheckbox(){
    if(chkbox.isSelected()){
        System.out.println("Checkbox is Checked. Test Case PASSED");
    }else{
        System.out.println("Test Case FAILED");
    }
}
>>>>>>> main

    public void loginMethod(){
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
        //driver.findElement(By.linkText("Forgot Your Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
    }

    public void isDisplayUserNameInForgotPwd(){
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

    public void enterUserName(){
        WebElement un = driver.findElement(By.cssSelector("input[name='un']"));
        un.sendKeys("TestUser");
    }

    public void clickContinueBtn(){
        WebElement continueBtn = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueBtn.click();
    }

    public void clickTryForFreeLink(){
        driver.findElement(By.partialLinkText("Try")).click();
    }

    public void fillTrialPage(){
        driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Test");
        boolean isFirstPointDisplayed = driver.findElement(By.xpath("//li[text()='Pre-loaded data or upload your own']")).isDisplayed();
        if (isFirstPointDisplayed){
            System.out.println("First Point Displayed Successfully");
        }else{
            System.out.println("First Point is not Displayed");
        }
        driver.findElement(By.xpath("//input[contains(@id,'UserLastName')]")).sendKeys("User");
    }


    public static void main(String[] args) {
        locatorExamples objRef = new locatorExamples();
        objRef.navigateToUrl();
        objRef.clickCheckbox();
        objRef.verifyCheckbox();
        //objRef.loginMethod();
        //objRef.clickForgotPassword();
        //objRef.isDisplayUserNameInForgotPwd();
        //objRef.validateResetText();
        //objRef.enterUserName();
        //objRef.clickContinueBtn();
<<<<<<< HEAD
        //objRef.clickTryForFreeLink();
=======
       //objRef.clickTryForFreeLink();
>>>>>>> main
        //objRef.fillTrialPage();
    }

}

package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateInvalidLoginMsg {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.findElement(By.id("username")).sendKeys("LearnMore");
        driver.findElement(By.id("password")).sendKeys("abcd123");
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        String errorMsg=driver.findElement(By.id("errorMessage")).getText();
        if (errorMsg.equals("Invalid Credentials.Please Check Once")){
            System.out.println("Test case PASS");
        }
        else{
            System.out.println("Test case FAIL");
        }
    }
}

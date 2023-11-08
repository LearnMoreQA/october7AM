import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice {



        public static void main (String[]args)
        {

            WebDriver driver = new ChromeDriver();
            driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
            driver.findElement(By.id("username")).sendKeys("Learnmore");
            driver.findElement(By.id("password")).sendKeys("learnmore@23");
            driver.findElement(By.id("LoginBtn")).click();
            String actualText = driver.findElement(By.id("errorMessage")).getText();
            String expectedText = "Invalid Credentials.Please Check Once";

            if(actualText.equals(expectedText)){
                System.out.println("TC PASS");
            }else System.out.println("TC FAIL");
        }
}





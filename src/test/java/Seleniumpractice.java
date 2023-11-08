import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice {
WebDriver driver;



    //Login method
    public void login()
{
    driver = new ChromeDriver();
    driver.get("https://learnmoreplayground.blogspot.com/");
    driver.findElement(By.id("username")).sendKeys("Learnmore");
    driver.findElement(By.id("password")).sendKeys("learnmore@23");
            /*//WebElement button = driver.findElement(By.tagName("label"));
           // driver.findElement(By.tagName(buttononclick)).click();
            String actualText = driver.findElement(By.id("errorMessage")).getText();
            String expectedText = "Invalid Credentials.Please Check Once";

            if(actualText.equals(expectedText)){
                System.out.println("TC PASS");
            }else System.out.println("TC FAIL");*/
}


//

    public void linktext()
    {
    driver.findElement(By.partialLinkText("Page")).click();
    }
        public static void main (String[]args)
        {
            Seleniumpractice objcall = new Seleniumpractice();
            objcall.login();
            objcall.linktext();





        }
}





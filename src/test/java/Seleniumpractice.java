import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice {

    WebDriver driver;


    public void login() {

    driver = new ChromeDriver();
    driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
   // driver.findElement(By.partialLinkText("Page")).click();
    driver.findElement(By.id("username")).sendKeys("LearnMore");
    driver.findElement(By.id("password")).sendKeys("learnmore@123");
    WebElement button=driver.findElement(By.tagName("button"));
    button.click();
        }
//css selector
        public void welcometextcheck() {
        WebElement welcome = driver.findElement(By.cssSelector(".login-label"));
        if (welcome.isDisplayed()) {
            System.out.println(welcome.getText() + " is Present");
        }
    }

    //xpath
    public void eventmgtpage()
    {
        driver.findElement(By.
    }






    public static void main (String[]args)
        {
            Seleniumpractice objCall = new Seleniumpractice();
            objCall.login();
            objCall.welcometextcheck();
            objCall.eventmgtpage();
        }
    }










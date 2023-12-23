package utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverUtils {

    private WebDriver driver;

    private static DriverUtils instance;

    // Singlton Design Pattern - Private Constructor, Static Method, Non-Static Method

    private DriverUtils(){
        // Driver Initialization
        String browser = ConfigReader.getInstance().getBrowser();
       switch(browser){
           case "chrome" -> driver = new ChromeDriver();
           case "firefox" -> driver = new FirefoxDriver();
           case "edge" -> driver = new EdgeDriver();
           default -> Assert.fail("Provided Incorrect Browser");
       }
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static DriverUtils getInstance(){
        if (instance == null){
            instance = new DriverUtils();
        }
        return instance;
    }

    public WebDriver getDriver(){
        return driver;
    }




}

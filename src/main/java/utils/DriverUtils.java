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

    public WebDriver setDriver(WebDriver driver){
        return this.driver = driver;
    }




}

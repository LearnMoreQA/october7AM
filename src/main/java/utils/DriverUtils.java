package utils;

import org.openqa.selenium.WebDriver;

public class DriverUtils {

    private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

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
        return tldriver.get();
    }

    public ThreadLocal<WebDriver> setDriver(WebDriver driver){
        tldriver.set(driver);
        System.out.println("Test Thread ID: "+Thread.currentThread().getId());
        return tldriver;
    }
}

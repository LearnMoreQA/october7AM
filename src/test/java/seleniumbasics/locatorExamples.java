package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorExamples {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
    }
}

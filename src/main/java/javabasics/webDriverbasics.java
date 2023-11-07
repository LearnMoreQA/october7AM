package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverbasics {
    public static void main(String[] args) {
    //System.setProperty("webdriver.chrome.driver","D:\Workspace\october7AM\src\main\resources\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://login.salesforce.com/?locale=in");
    }

}

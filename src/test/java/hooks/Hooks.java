package hooks;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ConfigReader;
import utils.DriverUtils;

import java.time.Duration;

public class Hooks {

    @Before
    public void navigateToUrl(){
        String browser = ConfigReader.getInstance().getBrowser();
        switch(browser){
            case "chrome" -> DriverUtils.getInstance().setDriver(new ChromeDriver());
            case "firefox" -> DriverUtils.getInstance().setDriver(new FirefoxDriver());
            case "edge" -> DriverUtils.getInstance().setDriver(new EdgeDriver());
            default -> Assert.fail("Provided Incorrect Browser");
        }
        DriverUtils.getInstance().getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // Wait for Page Loading
        DriverUtils.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Wait for Find Element
        String  appUrl = ConfigReader.getInstance().getUrl();
        DriverUtils.getInstance().getDriver().get(appUrl);
        DriverUtils.getInstance().getDriver().manage().window().maximize();
    }

   @After
    public void closeBrowser(){
        //DriverUtils.getInstance().getDriver().close(); // It will focus on the Current Browser
       DriverUtils.getInstance().getDriver().quit(); // It will Close all the driver Instance/Object or Browser
   }

   @AfterStep
    public void captureScreenShot(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverUtils.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", null);
        }
   }
}

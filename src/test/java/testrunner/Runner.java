package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/Alerts_Mathan.feature", glue = "stepDefinition", tags="@Alerts")
public class Runner {

}

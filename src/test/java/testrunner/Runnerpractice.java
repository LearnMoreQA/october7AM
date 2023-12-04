package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurepractice",
        glue = "stepdefinition",tags = "@dropdown-practice")
public class Runnerpractice {
}


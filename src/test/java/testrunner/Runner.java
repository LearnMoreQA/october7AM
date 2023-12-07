package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/featurepractice",
        glue = "stepdefinition",tags = "@Dynamicdropdown")

@CucumberOptions(features = "src/test/resources/feature",
        glue = "stepdefinition",tags = "@PromptAlert")

public class Runner {
}

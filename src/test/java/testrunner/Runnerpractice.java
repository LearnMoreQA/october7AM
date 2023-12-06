package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurepractice",
        glue = "stepdefinition",tags = "@Dropdown1205")
public class Runnerpractice {

}


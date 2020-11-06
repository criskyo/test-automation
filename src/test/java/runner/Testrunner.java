package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import seleniumgluecode.Test;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumgluecode"),
        tags={"@scenario3"}
)

public class Testrunner {
}

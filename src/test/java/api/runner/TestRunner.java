package api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/api/features/login.feature", glue = {"api/Steps"},
plugin= {"json:target/cucumber.json"})
public class TestRunner {
}

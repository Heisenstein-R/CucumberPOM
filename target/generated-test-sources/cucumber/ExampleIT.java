import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/91938/eclipse-workspace/CucumberPOM/src/test/resources/features/example.feature:8"},
plugin = {"json:target/cucumber-reports/1.json"},
monochrome = false,
glue = { "CucumberPOM" })
public class ExampleIT {
}

package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/feature/homePage.feature" }, glue = { "stepDefinitions",
		"hooks" }, plugin = { "pretty", "html:target/html", "json:target/report.json" })
public class EmpDirTestrunner {

}

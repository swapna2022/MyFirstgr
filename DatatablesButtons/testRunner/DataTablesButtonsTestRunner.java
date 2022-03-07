package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\dataTablesButtonsFeature\\DataTableButtons.feature", glue = {
		"StepDefinitions" }, plugin = { "pretty", "html:target/html", "json:target/report.json" })
public class DataTablesButtonsTestRunner {

}

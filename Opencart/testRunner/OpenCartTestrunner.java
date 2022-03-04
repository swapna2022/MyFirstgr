package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\openCartFeature\\openCart.feature", glue = {
		"stepDefinitions" }, plugin = { "pretty", "html:target/html", "json:target/report.json" })
public class OpenCartTestrunner {

}

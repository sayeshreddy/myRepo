package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"stepdefinations"},
monochrome=true,
plugin= {"pretty","junit:target/JSONReports/rep2.xml"})
public class TestRunner {
}

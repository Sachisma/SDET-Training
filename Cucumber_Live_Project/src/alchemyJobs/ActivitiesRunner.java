package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Features",
glue = {"stepDefinitions"},
tags = "@jobAlchemy",
monochrome = true,
plugin = {"html:reports/html_test-reports"}

)

public class ActivitiesRunner {
//empty
}
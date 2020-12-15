package orangeHRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Features",
glue = {"stepDefinitions"},
tags = "@TestCaseTwos",
monochrome = true,
plugin = {"html:reports1/html_test-reports"}

)

public class ActivitiesRunner {
//empty
}
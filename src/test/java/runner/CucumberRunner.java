package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/amazonfeature/Amazon.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class CucumberRunner 
{
}


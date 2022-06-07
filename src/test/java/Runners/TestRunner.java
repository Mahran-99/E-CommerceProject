package Runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\Features",
        glue = "stepDefinitions",
        tags = "@regression"
)

public class TestRunner {
}

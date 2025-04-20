package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src/test/resource/features",
                 glue={"org.StepDef"},
                 plugin={"pretty","json:target/cucumber.json"},
                 monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests {
}

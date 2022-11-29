package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (
        features="src\\test\\resources\\Features" ,glue={"StepDefinitions"},
        dryRun = false,
        monochrome = true,
        plugin ={"pretty","html:target/cucumber-reports/reports2.html"},
        tags="@tag1"
    		   )
public class runner {

}

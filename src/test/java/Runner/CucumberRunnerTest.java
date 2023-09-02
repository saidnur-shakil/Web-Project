package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/addCustomer.feature"},
        glue = {"StepDefinition"},   monochrome = true,
        dryRun = false
        )
@Test
public class CucumberRunnerTest extends AbstractTestNGCucumberTests{
        }
package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", 
        		"html:target/test-report", 
        		"junit:target/cucumber-junit-report.xml", 
        		"json:target/cucumber.json"
		},
        features = {"src/test/resources/features"},
        glue = {"StepDefinition"},
        tags = {"@Scenario1"},
        monochrome = true,
        dryRun = false
        
)
public class runner {

}

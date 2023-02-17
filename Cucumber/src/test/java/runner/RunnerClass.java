package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature/Sample.feature",
		glue = "sampleProject",
		dryRun= false,
		monochrome = true,
				publish = true,
		plugin = {"pretty","html:target/cucumber/reprot_New.html"}
)
public class RunnerClass
{
	
}





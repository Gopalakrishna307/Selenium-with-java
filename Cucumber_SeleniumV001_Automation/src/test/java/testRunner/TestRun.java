package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
	(
			features=".//Features/Register.feature",
			glue="stepDefinitions",
			dryRun=false,
			monochrome = true,//it will  be remove unnessary  charater
			plugin = {"pretty","html:test-output.html"
			}
	)

public class TestRun {
	

}

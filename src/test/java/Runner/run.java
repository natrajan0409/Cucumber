package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java",
glue= {"Stepdefinition"},
//format= {"pretty","html:test-output"}, 
//monochrome = true,
//dryRun = false
tags = {"@Sample"})


public class run {
		
	
}



package com.MP.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features  = "src/test/resources",
		glue ="com.MP.HomeSteps",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
				"html:Reports/index.html",
				"json:Reports/data.json",
				"junit:Reports/Value.",
				
				
		},
		tags = "@smoke"
		
		
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}




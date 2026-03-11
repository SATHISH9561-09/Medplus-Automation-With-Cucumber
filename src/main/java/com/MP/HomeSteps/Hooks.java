package com.MP.HomeSteps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.MP.Base.BaseStarts;
import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks extends BaseStarts {
	
	@Before(order = 0)
	public void openBrowsers() {
		launchApllication();
		
	}
	
	
	@Before(order = 1)
	
	public void navitoLink() {
		
		NavigateTheUrl();
	}
	 
	@After
public void closeBrowser() {
		CloseApplication();
	
}
		
/*	
@BeforeAll
public static void beforeStart() {
	System.out.println("Executing the Steps");
}

@AfterAll
public static void AfterEnd() {
	System.err.println("Excuting Steps");
}*/

	
	public void beforeEachesStep(Scenario sc) {
		System.out.println("Excuting Steps"+sc.getGherkinName());
		
	}
	
	public void AfterEachSteps(Scenario sc) {
		
		System.err.println("Excuting Steps"+sc.getGherkinName());
		
	}
	
	
	
	
	
	
	
}

package com.MP.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class BaseStarts {
	

	public static WebDriver driver;
	public void launchApllication() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}

public void NavigateTheUrl() {
	driver.get("https://www.medplusmart.com/");
}

public void CloseApplication() {
	
	driver.quit();
}
	


}

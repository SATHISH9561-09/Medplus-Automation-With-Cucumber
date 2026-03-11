package com.MP.HomeSteps;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.MP.Base.BaseStarts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Home_Steps {
	

		public WebDriver driver =BaseStarts.driver;
		public String expectedTitle ="Online Pharmacy Store in India. Best value on medicines-MedPlus";
	/*	
		@Given("Openening Chorme Browser")
		public void openening_chorme_browser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		}
		@When("Navigate to Medplus Url")
		public void navigate_to_medplus_url() {
			driver.get("https://www.medplusmart.com/");
		   
		}
		*/
		@Then("Validated the Title")
		public void validated_the_titlebf() {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
		}
		
			@When("Click Search Textbar")
			public void click_search_textbar() {
				driver.findElement(By.xpath("//div[@class='search-input-placeholder font-16 text-secondary pointer d-flex w-100']")).click();
			    
			}

			@Then("Enter {string} in Search")
			public void enter_in_search(String DrugsNames){
				
				driver.findElement(By.xpath("//input[@class='font-16 form-control form-control-lg text-secondary ']")).sendKeys(DrugsNames);
				driver.findElement(By.xpath("//button[@class='btn btn-sm rounded-pill cancel-button icon-hover mr-1 p-3']")).click();
				
				
			    
			}

			@When("Enter {string} in the SearchBox")
			public void enter_in_the_search_box(String DrugsNames) throws InterruptedException {
				
				
				driver.findElement(By.xpath("//input[@class='font-16 form-control form-control-lg text-secondary ']")).sendKeys(DrugsNames);
				driver.findElement(By.xpath("//button[@class='btn btn-sm rounded-pill cancel-button icon-hover mr-1 p-3']")).click();
			//	driver.navigate().back();
				
				
				Thread.sleep(2000);
			    
				
				
			}
		
	/*	
		@Then("Close the Browser")
		public void close_the_browser() {
			
			driver.quit();
		 
			
		}
		*/}

package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		stepNotifications = true,
		features = "C:\\Users\\91938\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\FreeCRM.feature",
		glue = {"com\\qa\\stepdefinitions"},
		plugin = {"pretty", "html:Reports\\report1.html"},
//		tags = "@Regression and @SmokeTest" , 
//		tags = "not @Regression" ,
//		tags = "not @E2E" ,
		monochrome = true,
		dryRun = false
		
		
		)



public class TestRunner {
	
}

package com.google.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/SearchInGoogle.feature", 
glue="com.google.www.StepsDefinitions",
plugin = { "pretty", 
		"html:C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures"
		} ) // With this I generate my html report.
public class SearchInGoogleRunner {

	
	
}

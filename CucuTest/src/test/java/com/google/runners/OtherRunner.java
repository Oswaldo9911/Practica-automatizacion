package com.google.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feats/OtherFeature.feature", 
glue="com.google.StepsDefinitions",
plugin = { "pretty", 
		"html:C:\\Users\\SBMEDADMIN\\Pictures\\Saved Pictures"
		} ) // With this I generate my html report.
public class OtherRunner {

}

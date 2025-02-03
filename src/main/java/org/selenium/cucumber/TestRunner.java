package org.selenium.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\main\\java\\org\\selenium\\cucumber\\feature",glue="org/selenium/cucumber/stepdefinations",monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}

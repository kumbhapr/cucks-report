package com.vodafone.vois.cucks.api;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions( plugin = { "pretty", "html:target/cucumber-reports"}, tags= {"~@ignore"})
@CucumberOptions( plugin={"json:target/cucumber-report/cucumber.json"}, tags= {"~@ignore"})
public class RunCukesTest {
}

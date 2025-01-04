package com.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/Alare.feature"},
        glue = {"com.cucumber.stepDafinition"}
)
public class RunAlartbox extends AbstractTestNGCucumberTests {
}

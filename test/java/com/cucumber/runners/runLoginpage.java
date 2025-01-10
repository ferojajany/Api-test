package com.cucumber.runners;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/Loginpage.feature"},
        glue = {"com.cucumber.stepdafinition"}
)



public class runLoginpage extends AbstractTestNGCucumberTests {

}

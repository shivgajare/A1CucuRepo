package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="features",glue="com.stepdef")
public class TestRunner {

}

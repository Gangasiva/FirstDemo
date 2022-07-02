package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipselaunch\\CucumberBasics\\src\\test\\resources\\featurfile\\google.feature",
					glue = "com.stepdef")
public class RunnerClass {

}

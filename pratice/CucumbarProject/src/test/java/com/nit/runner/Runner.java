package com.nit.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(features="G://WorkSpeace//seleniunm//suresh715//pratice//CucumbarProject//FeatureFiles//OrangeLoginFuturefile.feature",
glue="com.nit.stepdefinations")
@RunWith(Cucumber.class)
public class Runner {
}

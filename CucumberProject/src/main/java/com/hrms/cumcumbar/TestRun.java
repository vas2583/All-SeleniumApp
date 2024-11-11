package com.hrms.cumcumbar;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"html:target/cucumber-html-report"},
tags={"@TC001VerifyTitle"})
public class TestRun {

}

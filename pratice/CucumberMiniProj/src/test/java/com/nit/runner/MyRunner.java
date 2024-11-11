package com.nit.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features="G://WorkSpeace//seleniunm//suresh715//pratice//CucumberMiniProj//features//OrangeHrmLogin.feature",
glue="com.nit.stepdef",//name="^Validate Logo OF OpenPage$"
 tags="@LoginFuture and not @Regression",
 monochrome=true,plugin= {"pretty","html:target/cucumber-reports.html","json:target/cucumber-repotsjson.json"},
 snippets=SnippetType.UNDERSCORE)
public class MyRunner {

}

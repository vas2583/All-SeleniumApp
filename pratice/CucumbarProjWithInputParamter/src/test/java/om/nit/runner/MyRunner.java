package om.nit.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="G://WorkSpeace//seleniunm//suresh715//pratice//CucumbarProjWithInputParamter//features//orangeLogin.feature",
glue="com.nit.stepdefinations")
public class MyRunner {

}

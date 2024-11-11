package com.hrms.cumcumbar;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	public WebDriver driver;
	@Given("^Open Application$")
	public void openApplication() {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Open");	
	}
	@When("^verifyTitle$")
	public void verifyTitle() {
		if(driver.getTitle().equalsIgnoreCase("OrangeHrm"))
			System.out.println("title verified");
		else
			driver.getTitle();
		
	}
	@Then("^closeApplication$")
	public void closeApp() {
		driver.close();
		System.out.println("Application is Closed");
		
	}

}

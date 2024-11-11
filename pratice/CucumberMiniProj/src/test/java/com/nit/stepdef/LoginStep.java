package com.nit.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("i want to Open Browser")
	public void i_want_to_open_browser() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Given("i want to navigate the OrangeHrms")
	public void i_want_to_navigate_the_orange_hrms() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	
	  @When("get the Logo Of page and Validate")
	  public void get_the_logo_of_page_and_validate() {
		  boolean bo=driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed(); 
		  if(bo==true) { 
			  System.out.println("Logo Is Displayed");
			  }
		   else
	         System.out.println("Logo Is Not Displayed");
	  
	  
	  }
	 
	 

	@Then("i want to close Browser")
	public void i_want_to_close_browser() {
	    driver.close();
	}

	@When("i want Enter the Username {string}")
	public void i_want_enter_the_username(String usn) {
		 driver.findElement(By.name("username")).sendKeys(usn);
	    
	}

	@When("i want Enter the Password {string}")
	public void i_want_enter_the_password(String pwd) {
		 driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("i want Click the Login button")
	public void i_want_click_the_login_button() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("i want to get output {string}")
	public void i_want_to_get_output(String output) {
		if(output.equals("loginSuccess")) {
		 boolean bo=driver.findElement(By.xpath("//span[contains(@class,'oxd-topbar')]//h6")).isDisplayed();
		 if(bo==true) {
			 System.out.println("Login SuccesSFull and we Are in DashBoard");
		 }
		 else
			 System.out.println("login Fali dashBoard IS not Displayed");
		}
		else if(output.equals("loginFail")) {
		 boolean bo=driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
		      if(bo==true) {
		    	  System.out.println("As excepted Error Msg Is Displayed");
			}
		      else
		    	  System.out.println("Unexpected Error is Dispalyed ");
		}
		else
			System.out.println("unexcepted Outcome::"+output);
	}
}






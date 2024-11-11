package com.nit.stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithParameters {
	WebDriver driver;
	@Given("i want open browser")
	public void i_want_open_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }

	@When("i want navigate to OrangeHRM Home Page")
	public void i_want_navigate_to_orange_hrm_home_page() {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("i want Validate logo of The page")
	public void i_want_validate_logo_of_the_page() {
		boolean bo=driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
		 if(bo==true) {
			 System.out.println("Logo Is Displayed");
		 }
		 else
			 System.out.println("Logo Is Not Displayed");	
	
	     }

	@Then("i want Close the browser")
	public void i_want_close_the_browser() {
		try {
			Thread.sleep(2000);
			driver.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
	}

	@When("i want enter valid userName {string}")
	public void i_want_enter_valid_user_name(String usn) {
		 driver.findElement(By.name("username")).sendKeys(usn);
	}

	@When("i wnat Enter the valid password {string}")
	public void i_wnat_enter_the_valid_password(String psd) {
		driver.findElement(By.name("password")).sendKeys(psd);
	}

	@When("i want Click On Login button")
	public void i_want_click_on_login_button() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("i am in MyAccount Page")
	public void i_am_in_my_account_page() {
		 boolean bo=driver.findElement(By.xpath("//span[contains(@class,'oxd-topbar')]//h6")).isDisplayed();
		    if(bo==true) {
		    	System.out.println("our Login IS SussessFull");
		    }
		    else
		    	System.out.println("our login Is Fail");
		   
	}

	@When("i want enter Invalid User Name {string}")
	public void i_want_enter_invalid_user_name(String inusn) {
		driver.findElement(By.name("username")).sendKeys(inusn);
	}

	@When("i wnat Enter the Invalid password {string}")
	public void i_wnat_enter_the_invalid_password(String inpsd) {
		driver.findElement(By.name("password")).sendKeys(inpsd);
	}

	@Then("i am getting Error Message")
	public void i_am_getting_error_message() {
		 String errMsg=driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	       System.out.println(errMsg);
	}

	@When("i dont want enter any Credentials")
	public void i_dont_want_enter_any_credentials() {
	    
	}

	@Then("i am getting RequiredError Msg")
	public void i_am_getting_required_error_msg() {
		boolean bo=driver.findElement(By.xpath("//span[text()='Required']")).isDisplayed();
		 if(bo==true)
			 System.out.println("error Msg Displayed");
		 else
			 System.out.println("error msg not Displayed");
	}


}

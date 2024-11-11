package com.nit.stepdefinations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
public class OrangeLogin {
	WebDriver driver;
	@Given("i want open browser")
	public void i_want_open_browser() {
		WebDriverManager manager=new ChromeDriverManager();
		manager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@When("i want navigate to OrangeHRM Home Page")
	public void i_want_navigate_to_OrangeHRM_Home_Page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Then("i want Validate logo of The page")
	public void validate_logo (){
		
		boolean bo=driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
		 if(bo==true) {
			 System.out.println("Logo Is Displayed");
		 }
		 else
			 System.out.println("Logo Is Not Displayed");	
	}
	@When("i want enter valid User Name")
	public void i_want_enter_valid_user_name() {
	    driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("i wnat Enter the valid password")
	public void i_wnat_enter_the_valid_password() {
	    driver.findElement(By.name("password")).sendKeys("admin123");
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

	@When("i want enter Invalid User Name")
	public void i_want_enter_invalid_user_name() {
		driver.findElement(By.name("username")).sendKeys("Adm");
	}

	@When("i wnat Enter the Invalid password")
	public void i_wnat_enter_the_invalid_password() {
		driver.findElement(By.name("password")).sendKeys("admin");
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
	public void i_am_getting_RequiredError_Msg() {
		boolean bo=driver.findElement(By.xpath("//span[text()='Required']")).isDisplayed();
		 if(bo==true)
			 System.out.println("error Msg Displayed");
		 else
			 System.out.println("error msg not Displayed");
	}

	@Then("i want Close the browser")
	public void i_want_Close_the_browser() {
		try {
		Thread.sleep(2000);
		driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

package stepdefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	WebDriver driver;
	 @Before
	 public void setup() {
		 driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://tutorialsninja.com/demo/");
	 }
	 @After
	   public void tearUp() {
	  driver.quit();
	  }
	 
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();	
	    }
	
	@When("User enters valid email address {string} into  email field")
	public void user_enters_valid_email_address_into_email_field(String emailText) {
		driver.findElement(By.id("input-email")).sendKeys(emailText);
	  }
	
	@And("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	 }
	
	@And("User clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();	
	}
	
	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	  String title=driver.getTitle();
	  if(title.equals("My Account")) {
		  System.out.println("LOgin SuccessFull");
	  }
	}
	
	@When("User enters invalid email address {string} into  email field")
	public void user_enters_invalid_email_address_into_email_field(String invalidEmaliText) {
		driver.findElement(By.id("input-email")).sendKeys(invalidEmaliText);
	 }
	@And("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPassword) {
		driver.findElement(By.id("input-password")).sendKeys(invalidPassword);
	}
	@Then("User should get proper warning message about credentials mismatch")
	public void User_should_get_proper_warning_message_about_credentials_mismatch() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText().contains("No match for E-Mail Address and/or Password."));
	}
	
	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {
		driver.findElement(By.id("input-email")).sendKeys("");   
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
	  driver.findElement(By.id("input-password")).sendKeys(""); 
	}

	}

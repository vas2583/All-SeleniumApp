package com.nit.pages;

import static com.nt.utils.Utility.driver;

import org.openqa.selenium.By;

import com.nt.elementUtils.ElementUtils;
public class LoginPage {
    By text_loginPage=By.xpath("//div[text()='Swag Lab']");
    By edit_usn=By.id("user-name");
    By edit_pswd=By.id("password");
    By btn_login=By.id("login-button");
    String usn="standard_user";
    String pass="secret_sauce";
    
	public void varifyLoginPageLogo()throws Exception{
		if (ElementUtils.checkVisability(text_loginPage)){
		System.out.println("we are verify the LogingPage");
		}
		else {
			System.out.println("We are Not in the Login Page");
			
		}
	}
	public void performLoginActivity()throws Exception {
		//enter userName
		  enterUsn();
		  System.out.println("enter username correctlly");
		 //enter password
		  enterPswd();
		  System.out.println("Enter passwored Correctly");
		//clickOn LoginButton	 
		
		  clickOnLoginBtn();
		  System.out.println("click on Loging Button");
		  
		
		
		
	}
	private void clickOnLoginBtn()throws Exception {
		ElementUtils.clickOperation(btn_login);
		
	}
	private void enterPswd()throws Exception {
		ElementUtils.customeType(edit_pswd,pass);
		
	}
	private void enterUsn() throws Exception {
		ElementUtils.customeType(edit_usn,usn);
		
	}

}

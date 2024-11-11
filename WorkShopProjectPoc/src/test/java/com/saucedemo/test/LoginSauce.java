package com.saucedemo.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nit.pages.Inventory;
import com.nit.pages.LoginPage;
import com.nt.appcommonmethods.CommonMethodApp;
import com.nt.utils.Utility;

public class LoginSauce {
	Properties probs=null;
	FileInputStream fis=null;
	
  @Test
  public void loginSauce()throws IOException,Exception {
	 
	  fis=new FileInputStream("G:\\WorkSpeace\\seleniunm\\suresh715\\WorkShopProjectPoc\\src\\main\\resources\\config\\global.properties");
	  LoginPage loginPage=new LoginPage();
	  Inventory inventory=new Inventory();
	  CommonMethodApp comm=new CommonMethodApp();
	  probs=new Properties();
	  probs.load(fis);
	  //open browser
	    Utility.openBrowser();
	  //navigate to browser
	    Utility.navigateToApp(probs.getProperty("url"));
	  //varify loginpagelogo
	  loginPage.varifyLoginPageLogo();
	  //perfoming login
	    loginPage.performLoginActivity();
	  //validate login
	    inventory.validateLoginFunction();
	    //loguout
	  comm.logout();
	  //close browser
	   Utility.tearUp();
	  
  }
}

package com.nt.scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nt.lib.General;




//Without Any alter Annotations only @Test
  //@Test
/*public void loginFun() {
	gen.openapplication();
	gen.verifyTitel("OrangeHRM");
	gen.loginFuction();
	System.out.println("Login Function is Completed");
	gen.closeApplication();
}*/

public class LoginFunction {

     public static General gen=new General();
     
      @BeforeClass
     public void openApplication() {
    	 gen.openapplication();
    	 System.out.println("Open Application Before Class Test Excecuted");
            }
      @BeforeMethod
      public void verifyTitle() {
    	  gen.verifyTitel("OrangeHRM - New Level of HR Management");
    	 
    	  
      }
      @AfterMethod
      public void logoutApp() {
    	  gen.logout();
    	  System.out.println("Application is Logout");
    	  Reporter.log("app is logout");
      }
     @Test
	 public void loginFun()throws Exception {
		 gen.loginFuction();
		 System.out.println("Login Function is Completed");
		 Reporter.log("Login Function completed");
	   }
	 @AfterClass
	 public void closeApp() {
		 gen.closeApplication();
		 System.out.println("close Application After Class Test Excecuted");
		 Reporter.log("Close Application After calss tEST eExceuted");
		 
	 }
}

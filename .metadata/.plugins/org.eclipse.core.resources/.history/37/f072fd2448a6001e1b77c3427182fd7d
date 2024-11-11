package com.nt.Testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class AutoScript_Using_TestNG {
	General gen;
	
	@BeforeClass
	public void openAPP() {
	gen=new General();
	gen.openApplication();
	}
	@Test(priority=1)
	public void loginApp() {
		gen=new General();
		gen.LoginApp();
	}
	@Test(priority=2)
	public void addEmp() {
		gen=new General();
		gen.enetreEmpDetailsFrame();
		gen.addEmployee();
		gen.exitEmpDetailsFrame();
	}
	@Test(priority=4)
	public void closeApp() {
		gen=new General();
		gen.closeApp();
	  }
	
	@Test(priority=3)
	public void logout() {
		gen=new General();
		gen.LogoutApp();
	}
	

}

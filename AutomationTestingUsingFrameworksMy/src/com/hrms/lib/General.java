package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class General extends Global {
	 //Open Application
	public void openApplication() {
	 driver=new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application is Open");
	}
	//LoginThe Applicaton
	 public void LoginApp() {
		driver.findElement(By.name(txt_loginName)).sendKeys(login_UserName);
		driver.findElement(By.name(txt_loginPassword)).sendKeys(login_Password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login is Sucessfull");	
	 }
	 public void enetreEmpDetailsFrame() {
		 driver.switchTo().frame(emp_details_fame);
		 System.out.println("enetred into Frame");
	 }
	 public void addEmployee() {
		 driver.findElement(By.xpath(btn_add)).click();
		 System.out.println("Add button is clicked::");
		 driver.findElement(By.name(txt_addEmpFirstName)).sendKeys(addEmp_FirstName);
		 driver.findElement(By.name(txt_addEmpLastName)).sendKeys(addEmp_LastName);
		 driver.findElement(By.id(btn_save)).click();
	 }	 
	 public void exitEmpDetailsFrame() {
		 driver.switchTo().defaultContent();
		 System.out.println("exit from frame::");
	 }
	 
	 public void LogoutApp() {
		 driver.findElement(By.linkText(link_logout)).click();
		 System.out.println("Application will be Logout");
	 }
	 
	 public void closeApp() {
		 driver.close();
		 System.out.println("Application is Close");
		  
	 }

}

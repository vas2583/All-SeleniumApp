package com.nt.appcommonmethods;

import static com.nt.utils.Utility.driver;

import org.openqa.selenium.By;

import com.nt.elementUtils.ElementUtils;
public class CommonMethodApp {
    By logout_dots=By.xpath("//button[@id='react-burger-menu-btn']");
    By logoutEle=By.xpath("//a[@id='logout_sidebar_link']");
    
	public  void logout() throws Exception {
		//findElement
		//click on 3 dots
		//click on logot
		ElementUtils.clickOperation(logout_dots);
		ElementUtils.clickOperation(logoutEle);
		
	}

}

package com.nit.pages;

import org.openqa.selenium.By;

import com.nt.elementUtils.ElementUtils;

import static com.nt.utils.Utility.driver;
public class Inventory {
    By text_inventory=By.xpath("//span[text()='Products']");
	public void validateLoginFunction() {
		try {
		if(ElementUtils.checkVisability(text_inventory)) {
		   System.out.println("login successFull");
		}
		else
			System.out.println("login is not done");
	    }
		catch(Exception e) {
			System.out.println("problem on checkVisibility Method");
		}
	}
}

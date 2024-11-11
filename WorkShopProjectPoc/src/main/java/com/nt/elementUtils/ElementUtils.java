package com.nt.elementUtils;

import static com.nt.utils.Utility.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ElementUtils {
	public static WebElement element;

	public static boolean checkVisability(By locator)throws Exception {
		//findElement
		//isDisplayed Method
		
		boolean res=false;
		try {
	     res=locateElement(locator).isDisplayed();
	     System.out.println("we are finding The isDisplayed locator");
		}
		catch(Exception e) {
			System.out.println("we are not finding isDisplayed Locator");
		}
		
		return res;
	}

	private static WebElement locateElement(By locator) throws Exception{
		for(int i=1;i<=10;i++) {
		try {
			element=driver.findElement(locator);
			break;
		    } 
			catch (Exception e) {
			// TODO Auto-generated catch block
			Thread.sleep(2000);
		  }
		}
		
		return element;
		
	}

	public static void clickOperation(By locator) throws Exception {
	      
		locateElement(locator).click();
		
	}

	public static void customeType(By locator, String value)throws Exception {
		locateElement(locator).sendKeys(value);
		
	}

}

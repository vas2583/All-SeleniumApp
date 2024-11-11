package com.nit.sel4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowType1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.irctc.co.in/nget/train-search");
		String irtcTitle=driver.getTitle();
		System.out.println("irtcTitle::"+irtcTitle);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.mithra.com/en/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.cleartrip.com/");
		Set<String> windows=driver.getWindowHandles();
		List<String> li=new ArrayList<>(windows);
	      for(int i=0;i<li.size();i++) {
	    	  driver.switchTo().window(li.get(i));
	    	String title=driver.getTitle();
	    	  if(!irtcTitle.equals(title)) {
	    		  driver.close();
	    	  }
	      }
		
	}

}

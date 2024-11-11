package com.nit.links;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class ParaBankLinks {
	@Test
	public void links() {
		WebDriverManager manager=new ChromeDriverManager();
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/about.htm");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		 int size = links.size();
		   System.out.println(size);
		   
		 List<String> url=new ArrayList<String>();
		 	for(WebElement urls:links) {
		 		String urll=urls.getAttribute("href");
		 		url.add(urll);
		 	}	
		 	
		for(int i=0;i<size;i++) {
			driver.navigate().to(url.get(i));
	  
	       String title=driver.getTitle();
	       System.out.println(i+"  page tile is::"+title);
	       driver.navigate().back();
	   	
		}
		
		
	}
}



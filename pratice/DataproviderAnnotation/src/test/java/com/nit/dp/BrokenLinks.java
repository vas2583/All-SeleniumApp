package com.nit.dp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	@Test
	public void brockenLinks() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> ele=driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		for(WebElement links:ele) {
			String value=links.getAttribute("href");
			if(value==null || value.isEmpty()) {
				System.out.println("Not Posible to FindOut link"+value);
				continue;
			}
			 try {
			URL linkUrl=new URL(value);
			 HttpURLConnection connection=(HttpURLConnection) linkUrl.openConnection();
			 connection.connect();
			 int statuscode=connection.getResponseCode();
			 if(statuscode>=400) {
				 System.out.println(value+"===>Link will BE broken");
			 }
			 else
				 System.out.println(value+"===>Link will not BE broken");
			 
			
		}
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		
		
		
	}

  }
}

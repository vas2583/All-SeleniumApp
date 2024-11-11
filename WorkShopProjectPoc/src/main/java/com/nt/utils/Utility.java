package com.nt.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
     public static WebDriver driver;
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   }
	public static void navigateToApp(String url) {
	   driver.get(url);
	  }
	public static void tearUp() {
		driver.quit();
	}
	
	
	

}

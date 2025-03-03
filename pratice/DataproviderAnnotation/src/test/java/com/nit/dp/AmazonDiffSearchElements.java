package com.nit.dp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonDiffSearchElements {
	@Test(dataProvider="items")
	public void search(String item)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(item);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Back TO HOME pAGE::");
		System.out.println("search Option is Complete:");
		driver.close();
	  }
	
	@DataProvider(name="items")
	public Object[][] input(){
		Object[][] data={{"shoes"},{"sarees"},
				           {"watch"},{"gucci"},
				           {"short"},{"fasttrack"}
				           ,{"chain"},{"candom"}
				           ,{"magicPen"},{"beer"}
		                      };
		return data;
	}

}

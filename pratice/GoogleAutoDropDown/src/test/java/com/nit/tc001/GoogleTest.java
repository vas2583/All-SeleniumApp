package com.nit.tc001;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Samantha Ruth Prabhu
public class GoogleTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the initVal::");
		String initVal=sc.next();
		sc.nextLine();
		System.out.println("enetr the input value::");
		String input=sc.next();
		sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(initVal);
         List<WebElement>li=driver.findElements(By.xpath("//div[@id='Alh6id']//ul//li"));
          for(int i=0;i<li.size();i++) {
        	 String str= li.get(i).getText();
        	 if(input.equalsIgnoreCase(str)) {
        		 li.get(i).click();
        
          }
	}
	}
}



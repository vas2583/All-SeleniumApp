package com.nit.sel4;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.performance.Performance;
import org.openqa.selenium.devtools.v85.performance.model.Metric;

public class GettingPerformance {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//getIng DevTools
		DevTools devTools= driver.getDevTools();
		//creat session
		devTools.createSession();
		//enable Performance
		devTools.send(Performance.enable(Optional.empty()));
		driver.get("https://www.google.com/");
		List<Metric>li=devTools.send(Performance.getMetrics());
		for(Metric matric:li) {
			System.out.println("FirstApp::"+matric.getName()+":"+matric.getValue());
		      }
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  List<Metric>li1=devTools.send(Performance.getMetrics());
			for(Metric matric:li1) {
				System.out.println("SecondApp::"+matric.getName()+":"+matric.getValue());
			}
			 driver.switchTo().newWindow(WindowType.TAB);
			  driver.get("https://www.amazon.in/");
			  List<Metric>li2=devTools.send(Performance.getMetrics());
				for(Metric matric:li1) {
					System.out.println("ThridApp::"+matric.getName()+":"+matric.getValue());
				}
				
			

	}

}

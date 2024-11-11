package com.nit.dp;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
       int count=0;
       int maxRetry=3;
	public boolean retry(ITestResult result) {
		 if (count < maxRetry) {
	            System.out.println("Retrying test " + result.getName() +
	            		" with status"+  result.getStatus() + " for the " + (count + 1) + " time.");
	            count++;
	            return true; 
	        }
	       
	    
	
		return false;
	}
}


		
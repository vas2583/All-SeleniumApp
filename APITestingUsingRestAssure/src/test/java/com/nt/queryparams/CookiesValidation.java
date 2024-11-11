package com.nt.queryparams;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;



public class CookiesValidation {
	@Test
   void cookiesValidation() {
		Response res=(Response) given()
		.when() 
		 .get("https://www.google.com/")
		;

		String s1=res.getCookie("AEC");
		System.out.println("AEC COOKIE VALE::"+s1);
		
		Map<String,String> cookie_value=res.getCookies();
		System.out.println(cookie_value);
		 for(String k:cookie_value.keySet()) {
			 String cookie_value1=res.getCookie(k);
			 System.out.println(k+" "+cookie_value);
			 
			 
		 }
		
		
   }
}

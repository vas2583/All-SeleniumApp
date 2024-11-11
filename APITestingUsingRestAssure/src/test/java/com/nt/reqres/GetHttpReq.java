package com.nt.reqres;


import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetHttpReq {
	/* @Test
	void getUsers() {
		 given()
		 .when()
		    .get("https://reqres.in/api/users?page=2")
		 .then()
		   .statusCode(200)
		   .body("page",equalTo(2))
		   .log().all();
		
	}*/
     @Test(priority=2)
     public void getUserUsingPreConditions() {
    	 given()
    	  .baseUri("https://reqres.in")
    	  .queryParam("page","2")
    	  .when()
    	    .get("api/users")
    	   .then()
    	   .statusCode(200)
    	   .body("page",equalTo(2))
    	   .log().all();
    	 
     }
	

}

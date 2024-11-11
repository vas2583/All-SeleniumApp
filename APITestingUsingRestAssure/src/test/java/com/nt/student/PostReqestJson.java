package com.nt.student;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;


public class PostReqestJson {
	/*	@Test
		void postReqJosn() {
			JSONObject data=new JSONObject();
			data.put("name","anju");
			data.put("location","nuzvid");
			data.put("phonenum","898989898");
			String[] courses= {"dbms","etltool"};
			data.put("courses",courses);
			
			given()
			.contentType("application/json")
			.baseUri("http://localhost:3000")
			.body(data.toString())
			.when() 
			  .post("/students")
			 .then()
			   .statusCode(201)
			   .body("name",equalTo("anju"))
			   .header("Content-Type","application/json")
			   .log().all();
	
		}*/
	//Post REquest using Pojo Class
	@Test
	void postRequestPojo() {
		PostRequestUsinPojo data=new PostRequestUsinPojo();
		  data.setName("pallavi");
		  data.setLocation("vijayawada");
		  data.setPhonenum("798988898");
		  String[] course= {"dbms","ETLTool"};
		  data.setCourses(course);
		  
		  given()
		  .contentType("application/json")
			.baseUri("http://localhost:3000")
			.body(data)
		  .when() 
		   .post("/students")
		  .then()
		   .statusCode(201)
		   .body("name",equalTo("pallavi"))
		   .header("Content-Type","application/json")
		   .log().all();  
	   }

}

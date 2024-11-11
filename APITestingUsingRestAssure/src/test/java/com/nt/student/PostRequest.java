package com.nt.student;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import org.json.JSONObject;

import org.testng.annotations.Test;
public class PostRequest<JSONObject> {
	@Test
	public void postReq() {
		//Post Request using HashMap\
		HashMap data=new HashMap();
		data.put("name","priya");
		data.put("location","guntur");
		data.put("phonenum", "12345678");
		String[] courses= {"java","selenium"};
		data.put("courses", courses);
		String id= given()
		  .contentType("application/json")
		 .baseUri("http://localhost:3000")
		 .body(data)
		 .when()
		  .post("/students")
		  .then()
		   .statusCode(201)
		   .body("name",equalTo("priya"))
		   .body("location",equalTo("guntur"))
		   .body("phonenum",equalTo("12345678"))
		   .body("courses[0]",equalTo("java"))
		   .body("courses[1]",equalTo("selenium"))
		   .header("Content-Type","application/json")
		   .log().all()
		   .extract().jsonPath().getString("id")
		     ;
		  System.out.println(id);	  
	   }
}
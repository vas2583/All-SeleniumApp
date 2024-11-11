package com.nt.student;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class PostRequestUsingExternalFile {

	@Test
	void postRequestExFile()throws Exception {
		File f=new File(".\\body.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject data=new JSONObject(jt);
		
		  
		  given()
		  .contentType("application/json")
			.baseUri("http://localhost:3000")
			.body(data)
		  .when() 
		   .post("/students")
		  .then()
		   .statusCode(201)
		   .body("name",equalTo("kavya"))
		   .header("Content-Type","application/json")
		   .log().all();  
	   }

}

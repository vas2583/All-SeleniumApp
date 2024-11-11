package com.nt.reqres;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class PostHttpReq {
	@Test
	public void postReq() {
		HashMap hm=new HashMap();
		hm.put("name", "marphes");
		hm.put("job","leader");
		
                    String  res=given()
		                .contentType("application/JSON")
		                 .body(hm)
		                  .baseUri("https://reqres.in")
	                    .when()
	                     .post("api/users")
	                     .then()
	                      .statusCode(201)
	                      .log().all()
		                  .extract().jsonPath().getString("id");
                          
		System.out.println("Generated Id:;"+res);
		 
		                    
		
		 
	}

}

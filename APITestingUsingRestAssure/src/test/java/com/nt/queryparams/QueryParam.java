package com.nt.queryparams;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class QueryParam {
	@Test
	void queryParam() {
		given()
		.baseUri("https://reqres.in/api")
		.pathParam("mypath","users")
        .queryParam("page","2")
        .queryParam("id","7")
         .when()
             .get("/{mypath}")
          .then()  
             .statusCode(200)
	         .log().all();
		
	}

}

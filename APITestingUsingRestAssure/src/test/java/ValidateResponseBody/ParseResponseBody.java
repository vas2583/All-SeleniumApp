package ValidateResponseBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParseResponseBody {
	//@Test
	 public void JSONResponse() {
		given()
		 .contentType(ContentType.JSON)
		 .when()
		    .get("http://localhost:3000/store")
		  .then()
		    .statusCode(200)
		    .header("Content-type","application/JSON")
		    .body("boo[3].title",equalTo("The Loard of the kings"));
	 }


@Test(priority=1)
public void JsonResponce1() {
	Response res=given()
	 .contentType(ContentType.JSON)
	 .when()
	  .get("http://localhost:3000/store");
	
	   Assert.assertEquals(res.getStatusCode(),200);
      Assert.assertEquals(res.header("Content-Type"),"application/json");
	  String name= res.jsonPath().get("books[3].title").toString();
	  System.out.println(name);
	  
    }
@Test(priority=2)
public void JsonResponce2() {
	Response res=given()
	 .contentType(ContentType.JSON)
	 .when()
	  .get("http://localhost:3000/store");
	  
	JSONObject jo = new JSONObject(res.getBody().asString());

    // Loop through the array of books and print each title
    for (int i = 0; i < jo.getJSONArray("books").length(); i++) {
        String title = jo.getJSONArray("books").getJSONObject(i).getString("title");
        System.out.println(title);
    }
	
}
}
package curdOperations;



import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class PatchOperation {
@Test
	public void post1() {
		
		 JSONObject jobj=new JSONObject();
		   jobj.put("id", 350);
		   jobj.put("author","Ramesha");
		   jobj.put("title","apitest");
		   
		given()
		.contentType(ContentType.JSON)
		.body(jobj.toString())
		
		.when()
		.patch("http://localhost:3000/posts/350")
		
		.then().log().all();
		
	}
	
	

}

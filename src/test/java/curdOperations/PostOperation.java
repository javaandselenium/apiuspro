package curdOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperation {
	
	@Test
	public void post() {
   JSONObject jobj=new JSONObject();
   jobj.put("id", 350);
   jobj.put("author","Ganesha");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj.toString())
		
		.when()
		.post("http://localhost:3000/posts")
		
		.then().log().all();
		
	}

}

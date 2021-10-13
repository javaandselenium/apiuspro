package gitHubApplication;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchOperation {
	@Test
	public void patch() {
		JSONObject j=new JSONObject();
		j.put("name","Johnrepo");
		j.put("private",true);
		
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j.toString())
		
		.when()
		.patch("https://api.github.com/repos/javaandselenium/Johnrepo")
		
		.then().log().all();
		
		
	}

}

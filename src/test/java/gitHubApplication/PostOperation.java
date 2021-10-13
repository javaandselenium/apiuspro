package gitHubApplication;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostOperation {
	@Test
	public void post() {
		JSONObject j=new JSONObject();
		j.put("name","Johnrepo");
		j.put("description","dummy repro");
		
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j.toString())
		
		.when()
		.post("https://api.github.com/user/repos")
		.then().log().all();
		
		
	}

}

package gitHubApplication;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostOperation2 {
	@Test
	public void post() {
		Project p=new Project("plmkoi","demo repro");
		
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(p)
		
		.when()
		.post("https://api.github.com/user/repos")
		.then().log().all();
		
		
	}

}

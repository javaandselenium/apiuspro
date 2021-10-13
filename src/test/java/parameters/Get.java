package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Get {
	
	@Test
	public void get() {
		given()
		.pathParam("ownerName","javaandselenium")
		.pathParam("repoName","javaweekend")
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		
		.then().log().all();
	}

}

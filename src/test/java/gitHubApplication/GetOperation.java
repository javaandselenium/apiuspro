package gitHubApplication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class GetOperation {
	@Test
	public void get() {
		given()
		.get("https://api.github.com/repos/javaandselenium/wsao1advance")
		
		.then().log().all();
	}

}

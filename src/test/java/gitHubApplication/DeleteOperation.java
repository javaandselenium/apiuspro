package gitHubApplication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class DeleteOperation {
@Test
public void delete() {
	given()
	.auth().oauth2("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")
	
	.when()
	.delete("https://api.github.com/repos/javaandselenium/Johnrepo")
	

	.then().log().all();
	
}
}

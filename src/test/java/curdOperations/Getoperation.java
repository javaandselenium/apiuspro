package curdOperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Getoperation {
	@Test
	public void getProjects() {
		given()
		.get("http://localhost:3000/posts")
		.then()
		.log().all();
	}

}

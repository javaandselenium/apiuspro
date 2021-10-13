package demoApp;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetOperation {

	@Test
	public void get() {
	Response resp = RestAssured.get("http://localhost:3000/posts");	
	ValidatableResponse respval = resp.then();
	respval.log().all();
	}
	
}

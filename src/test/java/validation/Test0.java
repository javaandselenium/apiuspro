package validation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class Test0 {
	@Test
	public void get() {
		given()
		.get("https://api.github.com/repos/javaandselenium/wsao1advance")
		
		.then().log().all()
		.assertThat().header("Content-Type","application/json; charset=utf-8")
		.assertThat().header("Server","GitHub.com");
	
	}
	
	

}

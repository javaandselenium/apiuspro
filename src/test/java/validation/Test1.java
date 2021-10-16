package validation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


public class Test1 {
	@Test
	public void get() {
		given().get("https://api.github.com/repos/javaandselenium/wsao1advance")
.then().log().all()
.and().body(".owner.login",equalTo("javaandselenium"));


	}
}

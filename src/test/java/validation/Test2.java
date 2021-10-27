package validation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Test2 {
	@Test
	public void tc2() {
		given()
		.get("http://localhost:3000/posts")
		.then().log().all()
		
		.and().body("[2].id",equalTo(51))
		.and().body("[2].title",containsString("APItesting"))
		.and().body("[3].author",is("Bharanigr"));
	}

}

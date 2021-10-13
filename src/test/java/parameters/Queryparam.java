package parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Queryparam {
	@Test
	public void demo() {
		given()
		.queryParam("q","api")
		.queryParam("order","asc")
		.get("https://api.github.com/search/repositories")
		
		.then().log().all();
	}

}

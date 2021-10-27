package curdOperations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteOperation {
	@Test
	public void delete() {
		given()
		.delete("http://localhost:3000/posts/3500")
		.then().log().all();
	}

}

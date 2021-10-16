package jacksonSeralization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Serlaization {
	
	@Test
	public void demo() throws JsonGenerationException, JsonMappingException, IOException {
		Project p=new Project("API TEST","Ongoing",1234,5);
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("./project.json"),p);
	}

}

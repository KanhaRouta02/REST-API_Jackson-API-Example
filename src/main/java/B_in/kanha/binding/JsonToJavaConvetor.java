package B_in.kanha.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConvetor {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File file = new File("Student.json");
		
		ObjectMapper mapper = new ObjectMapper();
		Student value = mapper.readValue(file, Student.class);
		System.out.println(value);
	}

}

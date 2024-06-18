package B_in.kanha.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConvetor {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Address address = new Address();
		address.setState("Odisha");
		address.setPin(560067);
		
		Student student = new Student();
		student.setId(101);
		student.setName("Kanha");
		student.setGender("Male");
		student.setAddress(address);
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("Student.json"), student);
		System.out.println("created...");
	}
}

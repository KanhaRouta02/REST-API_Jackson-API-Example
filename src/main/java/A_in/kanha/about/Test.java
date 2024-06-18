package A_in.kanha.about;

//====================================
//JSON (Java Script Object Notation)
//====================================
//
//=> JSON is used to represent data in key-value format
//
//=> JSON is universal format to exchange data over internet
//
//Synax:
//
//{
//
//  "id" : 101,
//  "name" : "Ashok",
//  "gender" : "Male",
//  "phno"  : 463413
//
//  "address" : {
//		"city" : "Hyd",
//        "state" : "TG"
//	}
//
//}
//
//=> As part of REST API development, we need to convert Java Obj data to JSON format and JSON data to Java Object
//
//
//				Java Obj <----------------> JSON 
//
//=> In Java we don't have direct support to convert java to json and vice versa.
//
//=> We have below third party apis to work with JSON data in Java applications
//
//				1) Jackson api
//
//				2) Gson api
//
//
//==============
//Jackson API
//==============
//
//=> ObjectMapper class provided methods to convert java to json and vice versa
//
//
//========================
//Working with JACKSON API
//========================
//
//1) Create maven Project (quick-start)
//
//2) Add Jackson dependency in pom.xml file
//
//		<dependency>
//			<groupId>org.projectlombok</groupId>
//			<artifactId>lombok</artifactId>
//			<version>1.18.26</version>
//		</dependency>
//
//		<dependency>
//			<groupId>com.fasterxml.jackson.core</groupId>
//			<artifactId>jackson-databind</artifactId>
//			<version>2.14.2</version>
//		</dependency>
//
//
//3) Create Binding class to represent data
//
//4) Create Converter classes


public class Test {

}

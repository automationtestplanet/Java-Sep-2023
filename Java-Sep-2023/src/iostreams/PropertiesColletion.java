package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesColletion {

	public static void main(String[] args) throws IOException {
		
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		
		File studentDetailsFile = new File(currentDir+"\\src\\iostreams\\StudentProperties.properties");
		FileInputStream fis = new FileInputStream(studentDetailsFile);
		
		Properties studentProperties = new Properties();
		studentProperties.load(fis);
		
		System.out.println(studentProperties.getProperty("name"));
		System.out.println(studentProperties.getProperty("roll.no"));
		System.out.println(studentProperties.getProperty("phone.no"));
		System.out.println(studentProperties.getProperty("avg.marks"));
		System.out.println(studentProperties.getProperty("present"));
		
		studentProperties.setProperty("class", "10");
		
		FileOutputStream fos = new FileOutputStream(studentDetailsFile);
		studentProperties.store(fos, "Updated properties file");

	}

}

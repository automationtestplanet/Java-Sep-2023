package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInptStreamEx {

	public static void main(String[] args) throws Exception {
		
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		
		File studentDetailsFile = new File(currentDir+"\\src\\iostreams\\StudentDetailsInput.txt");
		FileInputStream fis = new FileInputStream(studentDetailsFile);
		
		int totalBytes = fis.available();
		
		System.out.println(totalBytes);
		
		byte[] studentDataInnBytes = new byte[totalBytes];
		
//		int oneByte = fis.read();		
//		System.out.println(oneByte);
		
		int allBytes= fis.read(studentDataInnBytes);
		
		System.out.println(allBytes);
		
		String str1 = "Hello";
		
		String str2 = new String("  Hello  ");
		
		String studentData = new String(studentDataInnBytes);
		
		System.out.println(studentData);
		
		String[] strArr = studentData.split("\n");
		
		String phoneNumber="";
		
		for(String eachString:strArr) {
			if(eachString.length() >=10) {
				phoneNumber =eachString.trim();
			}
		}
		
		System.out.println("Phone Nmber: " + phoneNumber);
		
		File studentPhoneNumbersFile = new File(currentDir+"\\src\\iostreams\\StudentPhoneNumbers.txt");
		FileOutputStream fos = new FileOutputStream(studentPhoneNumbersFile);
		byte[] studentPhoneNumberInBytes = phoneNumber.getBytes();
		
		fos.write(studentPhoneNumberInBytes);
		fos.flush();
		
	}

}

package string;

import java.util.StringTokenizer;

public class StringOperations {

	public static void main(String[] args) {
		
		
		String str1 = "Java";   // String is immutable -> we cannot change
		
		System.out.println("Hello "+str1);
		System.out.println(str1);		
		str1 = str1.concat(" 11 version");			
		System.out.println(str1);
		
		
		
		System.out.println();
		
		String str2 = new String("Java"); // String is immutable -> we cannot change
		System.out.println("Hello "+str2);			
		System.out.println(str2);
		str2 =  str2.concat(" 17 version");
		System.out.println(str2);
		
		
		System.out.println("----------------------------------------");
		
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println(s1);
		System.out.println(s2);
		
		if 	(s1 == s2.intern())		//  (s1.equals(s2)) // Binary Comparision  -  String Comparision
		{
			System.out.println("Bothe are Same");
		}else {
			System.out.println("Bothe are Not Same");
		}
		
		if 	(s1 == s2)		//  (s1.equals(s2)) // Binary Comparision  -  String Comparision
		{
			System.out.println("Bothe are Same");
		}else {
			System.out.println("Bothe are Not Same");
		}
		
		System.out.println("----------------------------------------");
		String String1 = "Hello This is Java";
		
		System.out.println(String1);
		System.out.println(String1.toUpperCase()); // Upper Case
//		System.out.println(String1);
		System.out.println(String1.toLowerCase()); //Lower Case
		System.out.println(String1.length());   //Length
		
		char[] cahrArr = String1.toCharArray(); // Character Array
		System.out.println(cahrArr);
		for(char eachChar:cahrArr) {
			System.out.println(eachChar);
		}
		
		String string2 = String.valueOf(cahrArr);  // Convert Char Array to String
		System.out.println(string2);
		
		int[] intArr = {1,2,3,4,5,6};
		
		System.out.println(intArr);
		
		String[] stringArr = String1.split(" ");
		
		System.out.println(stringArr);
		
		for(String eachString:stringArr) {
			System.out.println(eachString);
		}
		
//		String string3 = String.valueOf(stringArr);
//		System.out.println(string3);
//		
//		System.out.println(string3.toUpperCase());
		
		System.out.println(String1.charAt(0));  // Each Character based on the index
		System.out.println(String1.charAt(String1.length()-1));
		
		System.out.println(String1.indexOf("i"));  // index based on the character
		System.out.println(String1.lastIndexOf("i")); // last index based on the character
		
		String1 = "Hello This is Java";
		
		System.out.println(String1.replace("i", "I"));
		
		System.out.println(String1.replaceAll("[A-Za-z]", "I"));
		
		String browserStr = "Hello262#%&*$*%THis375375IS37537Java";
		
		System.out.println(browserStr.replaceAll("[^A-Za-z]", ""));
		System.out.println(browserStr.replaceAll("[^0-9]", ""));
		
		System.out.println(browserStr.replaceAll("[A-Za-z0-9]", ""));
		
//		System.out.println(browserStr.replaceAll("[^A-Za-z]{2,2}", ""));
		
		String String4 = "            Hello This is Java                    ";
		System.out.println(String4);
		System.out.println(String4.length());
		
		System.out.println(String4.trim().length());
		
		
		String str = "Hello";
		
		StringBuilder strBuilder = new StringBuilder("Hello");   // methods are not synchronized -> not suitable for multithreading 
		
		StringBuffer strBuffer = new StringBuffer("Hello");  // Methods are synchronized  -> suitable for mutithreading
		
		System.out.println("----------------------Before Append the string---------------------------");
		System.out.println(str);
		System.out.println(strBuilder);
		System.out.println(strBuffer);
		
		str.concat(" Java");
		strBuilder.append("Java");
		strBuffer.append("Java");
		
		System.out.println("-------------------------After Append the string-----------------------------");
		System.out.println(str);
		System.out.println(strBuilder);
		System.out.println(strBuffer);
		
		
		String1 = "Hello This is Java";  //olleH sihT si avaJ ,   //avaJ si sihH olleH,  //Java is This Hello
		
		String1.split(" ");
		StringTokenizer strTokenizer = new StringTokenizer("Hello This is Java"," ");
		
		while(strTokenizer.hasMoreTokens()) {
			System.out.println(strTokenizer.nextToken());
		}
	}
	
	
	synchronized void method1() {
		
	}
	
	// Database Connection

}

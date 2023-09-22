package assignments.kondababu;

public class Assignment1 {
   
	
	
	
// Write a program to print each word from the string ->  "Apple*Banana*Pomegranite*Watermelon"
	
	
	
	public static void main(String[] args) {
		
		String str= "Apple.Banana.Pomegranite.Watermelon";
		String str1="\\.";
		String str2[]=str.split(str1);
		//System.out.println(str);
		System.out.println(str2.length);
		System.out.println("each words are:");
		for (String each : str2) {
			
			
			System.out.println(each);
			
		}
			
		}
		
		
	
}
	
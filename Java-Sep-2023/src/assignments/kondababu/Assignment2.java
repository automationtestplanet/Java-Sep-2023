package assignments.kondababu;

public class Assignment2 {

	// Write a program to print the words in a reverse order in the sentence
	// whithout changing their position
	// ex: "Hello Java" -> o/p: "olleH avaJ"
	public void reverseWord(String str) {
		

		String[] words = str.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord+" " ;
        }
        System.out.println(reverseString );
	}

	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		obj.reverseWord("Hello Java kondababu");

	}

}

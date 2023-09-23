package assignments.sairam;

public class Assignment2 {

	// Write a program to print the last 5 numbers in a reverse order for a given number
	//	Ex: input 10,   o/p -> 10, 9, 8, 7 , 6
	//	Ex: input 20,  o/p -> 20,19,18,17,16
   
public static void main(String[] args) {
	
	int[] numbers = {1,2,3,4,5,6,7,8,9,10};
	int[] numbers2 = {11,12,13,14,15,16,17,18,19,20};
	if(numbers.length < 5) {
		System.out.println("No numbers are print");
		
	}
	
	for(int i = numbers.length - 1; i >= numbers.length - 5; i--) {
			System.out.println(numbers[i]);
			
			
	}
	
	if(numbers2.length < 5) {
		System.out.println("No numbers are print");
		
	}
	
	for(int i1 = numbers2.length -1; i1 >= numbers2.length -5; i1--) {
		System.out.println(numbers2[i1]);
	}
	
}
}
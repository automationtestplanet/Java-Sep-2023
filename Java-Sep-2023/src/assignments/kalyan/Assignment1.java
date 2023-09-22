package assignments.kalyan;

public class Assignment1 {
	
	//Write a program to display the sum of digits of a number 123456789
	// output should be -> 1+2+3+4+5+6+7+8+9 = 45
	
	public static void main(String[] args){
	       String s1="123456789";
	       int sum = 0;
		   for(int i=0; i<s1.length(); i++)
		
		   {
			   
	             sum = sum+Character.getNumericValue(s1.charAt(i));
	             System.out.print(s1.charAt(i));
	             if(i<s1.length()-1) {
	            	 System.out.print("+");
	             }
		   }
		   
	       		   System.out.print("=" + sum);
	       		System.out.print(s1.length());
		}

	}


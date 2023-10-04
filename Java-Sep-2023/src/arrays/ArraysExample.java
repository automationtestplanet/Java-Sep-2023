package arrays;

<<<<<<< Updated upstream
import java.util.Arrays;

public class ArraysExample {


	public static void main(String[] args) {
	
		int a = 100;
		int b = 200;
		int c = 300; 
		
		
		int[] intArr1 = {100,200,300};
		
		System.out.println(intArr1[0]);
		System.out.println(intArr1[1]);
		System.out.println(intArr1[2]);
		
//		int[] intArr2 = {100,200,300, 100.5f};  // integer ARRAY  .it wont accepts other values
		
		String strArr1[] = {"Banana","Apple","Carrot"};
//		String strArr2[] = {"Str1","Str2","Str3", 100, 10.5F,'A'};
		System.out.println("----------------------------String Array values---------------------------");
		Arrays.sort(strArr1);
		System.out.println(strArr1[0]);
		System.out.println(strArr1[1]);
		System.out.println(strArr1[2]);
		
		System.out.println("-------------------------------------------------------");
		
		int a1;
		
		a1 =300;
		
		
		int[] intArr3 = new int[3];
		
		intArr3[0] = 1000;
		intArr3[1] = 2000;
		intArr3[2] = 3000;
		
		System.out.println(intArr3[0]);
		System.out.println(intArr3[1]);
		System.out.println(intArr3[2]);
		
//		intArr3[3] = 4000;  //ArrayIndexOutOfBoundsException: 
		
//		System.out.println(intArr1[3]); //ArrayIndexOutOfBoundsException:
		
		
		ArraysExample arrEx1 = new ArraysExample();
		ArraysExample arrEx2 = new ArraysExample();
		ArraysExample arrEx3 = new ArraysExample();
		
		ArraysExample[] arrEx = new ArraysExample[3];
		
		arrEx[0] = new ArraysExample();
		arrEx[1] = new ArraysExample();
		arrEx[2] = new ArraysExample();
		
		ArraysExample[] arrExx = {arrEx1,arrEx2, new ArraysExample()}; 
		
		int[] intArr4 = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(intArr4[0]);
		System.out.println(intArr4[1]);
		System.out.println(intArr4[2]);
		System.out.println(intArr4[3]);
		System.out.println(intArr4[4]);
		System.out.println(intArr4[5]);
		System.out.println(intArr4[6]);
		System.out.println(intArr4[7]);
		System.out.println(intArr4[8]);
		System.out.println(intArr4[9]);
		
		System.out.println("----------------------------Using For loop---------------");
		System.out.println("Length of an Array: "+ intArr4.length);
		
		for(int i = 0; i < intArr4.length; i++) {
			System.out.println(intArr4[i]+5);
		}
		
		for(int eachValue:intArr4) {
			System.out.println(eachValue);
		}
		
//		Object obj = "String";
		Object[] objArr1 = {true, 10, 100, 'A', 1000, 100.5f, 10000, 1000.56D,"Hello"};
		
		System.out.println("----------------------------With Object ARray---------------");
		Object[] ObjArr2 = {50,30,20,40,10,80,70,100,60,90};
		
		Arrays.sort(ObjArr2);
		
		for(int i = 0; i < intArr4.length; i++) {
			int x = (int)ObjArr2[i];
			System.out.println(x+5);
		}
		
		System.out.println("----------------------------Enhanced For loop ---------------");
		
		for(Object eachValue:ObjArr2) {
			System.out.println(eachValue);
		}
		
		System.out.println("----------------------------2D array ---------------");
		
		int[][] twoDArr = {{100,200,300},{1000,2000,3000}};
		
		int[] innerArr0 = twoDArr[0];
		int[] innerArr2 = twoDArr[1];
		
		int value = twoDArr[1][0];
		
		System.out.println(value);
		
		for(int[] eachArr :twoDArr) {
			for(int eachValue:eachArr) {
				System.out.println(eachValue);				
			}			
		}
	}

}
=======
public class ArraysExample {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		int []Arr1 = {100,200,300}; //will not accept other data type this is homogenious
		System.out.println(Arr1[0]);
		System.out.println(Arr1[1]);
	
	String strArr1[] = {"string1","string2"};
	
	int intArr3[] = new int[3];
	intArr3[0]= 101;
	intArr3[1]= 201;
	intArr3[2]= 201;
	
	System.out.println(intArr3[1]);
	ArraysExample arrEx1 = new ArraysExample();
	ArraysExample[] arrEx = new ArraysExample[3];
	arrEx[0] = new ArraysExample();
	arrEx[1] = new ArraysExample();
	
//	ArraysExample[] arrExx = {arrEx1,arrEx0, new ArraysExample()};
	
	
	
	
	
	}
	
}
>>>>>>> Stashed changes

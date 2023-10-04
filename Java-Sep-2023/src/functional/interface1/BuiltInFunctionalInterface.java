package functional.interface1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface {

	public static void main(String[] args) {

		System.out.println("-------------------Function----------------------------------");
		Function<Integer, String> function1 = new Function<Integer, String>() {
			@Override
			public String apply(Integer val) {
				return "This is Functional Interface";
			}
		};
		System.out.println(function1.apply(100));

		Function<Integer, String> function2 = (val) -> {
			return "This is Functional Interface";
		};
		System.out.println(function2.apply(100));

		System.out.println("-------------------Predicate----------------------------------");
		Predicate<Integer> predicate1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer val) {
				if (val > 100) {
					return true;
				} else {
					return false;
				}
			}
		};
		System.out.println(predicate1.test(90));

		Predicate<Integer> predicate2 = (val) -> {
			if (val > 100) {
				return true;
			} else {
				return false;
			}
		};		
		System.out.println(predicate2.test(90));
		
		System.out.println("-------------------Consumer----------------------------------");
		Consumer<Integer> consumer1 = new Consumer<Integer>() {			
			@Override
			public void accept(Integer val) {
				System.out.println("Number: "+val );
			}
		};		
		consumer1.accept(100);
		
		Consumer<Integer> consumer2 = (val) -> {System.out.println("Number: "+val );};
		consumer2.accept(100);
		
		System.out.println("-------------------Supplier----------------------------------");
		Supplier<String> supplier1 = new Supplier<>() {			
			@Override
			public String get() {
				return "Hello Supplier";
			}
		};
		System.out.println(supplier1.get());
		
		Supplier<String> supplier2 = () -> {return "Hello Supplier";} ;
		System.out.println(supplier2.get());
		
		System.out.println("-------------------Comparator----------------------------------");		
		List<Student> studentList = new ArrayList<>();  // Ctrl + Shift + O
		
		studentList.add(new Student(3, "RAM", "10th"));
		studentList.add(new Student(1, "KALYAN", "10th"));
		studentList.add(new Student(2, "SAI", "10th"));
		
		System.out.println(studentList);
		
		System.out.println("-----------------------Before Sorting-----------------------------");
		studentList.forEach(studentObj -> {System.out.println(studentObj.getRollNo()+" "+studentObj.getName());});
		
		Collections.sort(studentList);
		
		System.out.println("---------------------After Sorting with Comparable Interface------------------------");
		studentList.forEach(studentObj -> {System.out.println(studentObj.getRollNo()+" "+studentObj.getName());});
		
		
		List<Students> studentsList = new ArrayList<>();  // Ctrl + Shift + O
		
		studentsList.add(new Students(30, "ANIL", "11th"));
		studentsList.add(new Students(10, "MOJI", "11th"));
		studentsList.add(new Students(20, "KBABU", "11th"));
		
		System.out.println("-----------------------Before Sorting-----------------------------");
		studentsList.forEach(studentObj -> {System.out.println(studentObj.getRollNo()+" "+studentObj.getName());});
		
		Comparator<Students> comparator1 = new Comparator<Students>() {			
			@Override
			public int compare(Students obj1, Students obj2) {
				if(obj1.getRollNo() > obj2.getRollNo()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Comparator<Students> comparator2 = (obj1,obj2) -> {
			if(obj1.getRollNo() > obj2.getRollNo()) {
				return 1;
			}else {
				return -1;
			}
		};
		
//		Collections.sort(studentsList, comparator1); // studentsList.sort(comparator1);
		
		studentsList.sort(comparator2); //Collections.sort(studentsList, comparator2);
		
		System.out.println("---------------------After Sorting with Comparator Funcational Interface------------------------");
		studentsList.forEach(studentObj -> {System.out.println(studentObj.getRollNo()+" "+studentObj.getName());});

	}

}

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		List arraylist1 = new ArrayList();
		
		System.out.println(arraylist1);  // empty list
		
		arraylist1.add(500);
		arraylist1.add(300);
//		list1.add(600);
		arraylist1.add(200);
		arraylist1.add(400);
		arraylist1.add(100);
		
		System.out.println(arraylist1);  //it is preserving the order
		
		System.out.println(arraylist1.get(0));
		
		System.out.println(arraylist1.size());  // size of list
		
		System.out.println(arraylist1.get(arraylist1.size()-1));
		
		Collections.sort(arraylist1); //sort
		
		System.out.println(arraylist1);
		
		if(arraylist1.contains(500)) {
			System.out.println(arraylist1.get( arraylist1.indexOf(500))); 
		}
		
		arraylist1.add(2, 600);
		
		System.out.println(arraylist1);
		
		arraylist1.add(600);  //allows duplicates
		
		System.out.println(arraylist1);
		
		List linkedList1 = new LinkedList();
		
		linkedList1.add(500);
		linkedList1.add(300);
//		list1.add(600);
		linkedList1.add(200);
		linkedList1.add(400);
		linkedList1.add(100);
		
		System.out.println("---------------------------LinkedList-----------------------");
		System.out.println(linkedList1);
		
		System.out.println("---------------------------Enhanced for loop-----------------------");
		for(Object eachValue:linkedList1) {
			System.out.println(eachValue);
		}
		
		System.out.println("---------------------------For each loop-----------------------");
		linkedList1.forEach(eachVal->{System.out.println(eachVal);});
		
		
		System.out.println("---------------------------Using Iterator-----------------------");
		Iterator itr = linkedList1.iterator();
		
		if(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		itr.next();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		List arraylist2 = new ArrayList();
		
//		System.out.println(arraylist2.get(0));
		
		for(Object eachValue:arraylist2) {
			System.out.println(eachValue);
		}
		
		
		
		System.out.println("---------------------------For each loop with membership operator :: print -----------------------");
		linkedList1.stream().forEach(System.out::println);
	}

}

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
		Set set1 = new HashSet();
		
		System.out.println(set1);  // empty list
		
		set1.add(500);
		set1.add(300);		
		set1.add(200);
		set1.add(400);
		set1.add(100);
		
		System.out.println(set1);  //it is preserving the order
		

		System.out.println("---------------------------Enhanced for loop-----------------------");
		for(Object eachValue:set1) {
			System.out.println(eachValue);
		}
		
		System.out.println("---------------------------For each loop-----------------------");
		set1.forEach(eachVal->{System.out.println(eachVal);});
		
//		System.out.println(set1.get(0)); // No get method is availble
		
		System.out.println("---------------------------Size-----------------------");
		System.out.println(set1.size());  // size of list
//		
	
		System.out.println("---------------------------Contains 500-----------------------");
		System.out.println(set1.contains(500));
	
		System.out.println("---------------------------Add duplicate 500-----------------------");
		set1.add(500);		
		System.out.println(set1); // doesn't allow duplicate
		
		System.out.println("---------------------------Using Iterator-----------------------");
		Iterator itr = set1.iterator();
		
		if(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		itr.next();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		System.out.println("---------------------------LinkedHashSet-----------------------");
		Set set2 = new LinkedHashSet();
		
		set2.add(500);
		set2.add(300);		
		set2.add(200);
		set2.add(400);
		set2.add(100);
		
		System.out.println(set2);  //it is preserving the order
		
		System.out.println("---------------------------TreeSet-----------------------");
		Set set3 = new TreeSet();
		
		set3.add(500);
		set3.add(300);		
		set3.add(200);
		set3.add(400);
		set3.add(100);
		
		System.out.println(set3);  //it store the values in sorted order
	
	}

}

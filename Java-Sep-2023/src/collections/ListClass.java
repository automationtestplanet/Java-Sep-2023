package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
	public static void main (String[] args) {
		List arraylist1 = new ArrayList();
		System.out.println(arraylist1);
		arraylist1.add(100);
		arraylist1.add(400);
		arraylist1.add(300);
		arraylist1.add(700);
		arraylist1.add(500);
		
		
		System.out.println(arraylist1);
		System.out.println(arraylist1.get(0));
		System.out.println(arraylist1.size());
		System.out.println(arraylist1.size()-1);
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		System.out.println(arraylist1.contains(100));
		if(arraylist1.contains(500)) {
			if(arraylist1.contains(500)) {
				System.out.println(arraylist1.get(arraylist1.indexOf(500)));
			}
			arraylist1.add(2,600);
			System.out.println(arraylist1);
			arraylist1.add(600);
			System.out.println(arraylist1);
			
			//linked list
			List linkedList1 = new LinkedList();
			
			linkedList1.add(100);
			linkedList1.add(400);
			linkedList1.add(300);
			linkedList1.add(700);
			linkedList1.add(500);
			System.out.println(linkedList1);
			
			
			System.out.println("--------Linkedlist---------");
			System.out.println(linkedList1);
			//for each loop
			System.out.println("-----------foreach loop-----");
			linkedList1.forEach(eachVal->{System.out.println(eachVal);});
			
			//iterator
			System.out.println("-----------iterator---");
			Iterator itr = linkedList1.iterator();
			if(itr.hasNext()) {
				System.out.println(itr.next());
			}
			itr.next();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		
	}
	
	
	

}

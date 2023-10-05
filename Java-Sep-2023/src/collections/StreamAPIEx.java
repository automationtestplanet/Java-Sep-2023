package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIEx {

	public static void main(String[] args) {
		
		List<Integer> numberLst = new ArrayList<>();		
		numberLst.add(11);
		numberLst.add(12);
		numberLst.add(13);
		numberLst.add(14);
		numberLst.add(15);
		numberLst.add(16);
		numberLst.add(17);
		numberLst.add(18);
		numberLst.add(19);
		numberLst.add(20);
		
		List<Integer> evenNumbesrLst = new ArrayList<>();
		
		for(int eachVal:numberLst) {
			if(eachVal %2 == 0) {
				evenNumbesrLst.add(eachVal);
			}
		}
		
		System.out.println(evenNumbesrLst);		
		
		System.out.println("--------------------------------Filter--------------------");
		List<Integer> evenNumbesrLst2 = numberLst.stream().filter(eachVal -> {
			if(eachVal %2 ==0)
			{return true;}else{return false;}}).collect(Collectors.toList());
		System.out.println(evenNumbesrLst2);
		
		List<Integer> oddNumbesrLst3 = numberLst.stream().filter(eachVal-> eachVal%2==1).collect(Collectors.toList());
		System.out.println(oddNumbesrLst3);
		
		System.out.println("--------------------------------Map--------------------");
		List<Integer> mappedList3 = numberLst.stream().map(eachVal -> eachVal+5).collect(Collectors.toList());
		System.out.println(mappedList3);
		
		System.out.println("--------------------------------Reduce--------------------");
		int sum = numberLst.stream().reduce(0,(val1,val2) -> val1+val2);
		System.out.println(sum);
	}

}

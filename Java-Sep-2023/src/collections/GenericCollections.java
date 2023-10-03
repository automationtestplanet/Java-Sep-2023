package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericCollections {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		
		list1.add(100);
		list1.add("200");
		
//		System.out.println(list1);
//		
//		int result = (int)list1.get(0) + (int)list1.get(1); //Error
//		System.out.println(result);
//		
//		int result2 = (int)list1.get(1); //Error
//		System.out.println(result2);
//		
//		
//		String str = "200";
		
//		int result3 = (int)str; Error
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200); //error
		
		int result = (int)list2.get(0) + (int)list2.get(1); //Error
		System.out.println(result);
		
		int result2 = (int)list2.get(1); //Error
		System.out.println(result2);
		
		
		
		Map<String, Integer> map1 = new HashMap<>();
		
		map1.put("Carrot", 300);
		map1.put("Apple", 100);
		map1.put("Banana", 200);
		
//		map1.put('d', 300);
//		map1.put(10, 300);
		
		System.out.println(map1);

	}

}

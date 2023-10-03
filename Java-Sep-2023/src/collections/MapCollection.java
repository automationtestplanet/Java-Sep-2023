package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {

	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<>();
		
		map1.put("d", 300);
		map1.put("a", 100);
		map1.put("b", 200);
		map1.put("c", 300);
		
		System.out.println(map1);
		
		System.out.println(map1.get("a"));
		
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		
		Set entrySet = map1.entrySet();
		
		System.out.println(entrySet);
		
		Set <Map.Entry<String, Integer> > entry = entrySet;
		
		System.out.println("---------------------------Enhanced for loop-----------------------");
		
		for(Map.Entry<String,Integer> eachObject: map1.entrySet()) {
			System.out.println(eachObject);
			System.out.println(eachObject.getKey());
			System.out.println(eachObject.getValue());
		}
		
		System.out.println("---------------------------For each loop-----------------------");
		map1.forEach((k,v) ->{System.out.println(k + " "+ v );});
		
		System.out.println("---------------------------EachEntry-----------------------");
		entrySet.forEach(eachEntry -> System.out.println(eachEntry));
		
	}

}

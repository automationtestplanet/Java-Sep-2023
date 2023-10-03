package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class ListCollection {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(100);
		System.out.println(list1.get(0));
		System.out.println((int)list1.get(0)+5);
		
		
		Set set1 = new HashSet();
		set1.add(100);
		Map map1 = new HashMap();
		map1.put("a",400);
		map1.put("b",401);
		System.out.println(map1.get("a"));
		
		

	}

}

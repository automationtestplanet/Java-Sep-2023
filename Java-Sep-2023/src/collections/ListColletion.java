package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ListColletion {

	public static void main(String[] args) throws IOException {
		
		List list1 = new ArrayList();
		list1.add(100);
		System.out.println(list1.get(0));
		
		System.out.println((int)list1.get(0)+5);
		
		Set set1 = new HashSet();
		set1.add(100);
		
//		System.out.println(set1.get(0));
//		
//		System.out.println((int)set1.get(0)+5);
		
		Map map1 = new HashMap();
		map1.put("a", 100);
		map1.put("b", 200);
		map1.put("c", 300);
		
		System.out.println(map1.get("c"));
		
		
		Properties prop1 = new Properties();  // if want to assign the values from extrenal files
		
		FileInputStream fis = new FileInputStream(new File("/"));
		prop1.load(fis);
		
		
		

	}

}

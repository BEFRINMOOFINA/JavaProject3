package Arrayy;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, String> hash_map = new HashMap<>();//creating a hash table
		//insert record-put
		hash_map.put("1", "Monday");
		hash_map.put("2", "Tuesday");
		hash_map.put("3", "Wednesday");
		hash_map.put("4", "Thursday");
		hash_map.put("5", "Friday");
		hash_map.put("6", "Saturday");
		hash_map.put("7", "Sunday");
		hash_map.put("8", "Sunday");
		hash_map.remove("6");
	       //System.out.println("After del 6 ;"+hash_table);
		hash_map.putIfAbsent("9", "day"); 
		hash_map.putIfAbsent("6", "Friday");
		hash_map.put("13", null);
		System.out.println(hash_map);
	}
}
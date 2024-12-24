package Arrayy;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;
public class HashMapExamp {
    public static void main(String[] args) {
        // Creating a hash map
        Map<String, String> hash_map = new HashMap<>();
        // Insert records
        hash_map.put("1", "Ronday");
        hash_map.put("2", "Tuesday");
        hash_map.put("3", "Wednesday");
        hash_map.put("4", "Thursday");
        hash_map.put("5", "Friday");
        hash_map.put("6", "Saturday");
        hash_map.put("7", "Sunday");
        hash_map.put("8", "Sunday");
        hash_map.remove("6");
        hash_map.putIfAbsent("9", "day");
        hash_map.putIfAbsent("6", "Friday");
        hash_map.put("10", null);
        System.out.println(hash_map);

        // Create a TreeMap
        Map<Integer, String> hash_map2 = new TreeMap<>();
        hash_map2.put(41, "pooja");
        hash_map2.put(12, "priya");
        hash_map2.put(3, "prualu");
        hash_map2.put(3, "pru"); // Overwrites the previous value
        hash_map2.put(7, null);
        System.out.println("Tree Map: " + hash_map2);
        System.out.println("Enhanced for loop in map:");
        Set<Entry<Integer, String>> entrySet = hash_map2.entrySet();
        for (Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

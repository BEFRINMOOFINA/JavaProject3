package CollectionFrameworks;
import java.util.HashSet;
import java.util.Iterator;
public class HashsetEx {
	public static void main(String[] args) {
		HashSet cities =  new HashSet();
		// Below line of code will remove element from Hash
		cities.add("Aruppukottai");
		cities.add("Virudhunagar");
		cities.add("Chennai");
		cities.add("Coimbatore");
		cities.remove("Aruppukottai");
		//Below line of code will remove element from HashSet
		cities.remove("New Delhi");
		Iterator<String>iterator = cities.iterator();
		while (iterator.hasNext()) {
			String nameOfCity=(String) iterator.next();
		System.out.println(nameOfCity);
		}
	}
}
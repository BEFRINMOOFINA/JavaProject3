package Selection;
import java.util.*;
public class ArraySortString {
public static void main(String[] args) {
	Scanner scanner =  new Scanner(System.in);
	System.out.print("Enter the number of strings: ");
	int n = scanner.nextInt();
	scanner.nextLine();
	String[] strings = new String[n];
	System.out.println("Enter the strings:");
	for (int i=0; i < n; i++) {
		strings[i] = scanner.nextLine();
	}
    Arrays.sort(strings);
    System.out.println("Sorted Array:");
    for (String str: strings) {
    		System.out.println(str);
       }	
    }
}

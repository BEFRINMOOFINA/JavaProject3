package Selection;
import java.util.*;
public class ArraySorted{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n =  scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i<n; i++) {
        	numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted Array:"); 
        for(int num: numbers)
        System.out.print(num + " ");
	  }
   } 

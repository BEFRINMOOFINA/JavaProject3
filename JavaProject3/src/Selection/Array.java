package Selection;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size =  sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter" + size +"integers:");
        for (int i=0; i < arr.length; i++) {
        	System.out.print("Enter element"+ (i+1)+":");
        	arr[i] = sc.nextInt();  			
        }
	    System.out.println("The elements in the array are:");
	    for (int i=0; i < arr.length; i++) {
	    	System.out.println("Element at index"+i+":"+ arr[1]);
	    }
	}
}
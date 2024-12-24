package Selection;
import java.util.Arrays;
import java.util.Scanner;
public class StringSort {
	public static void main(String[] args) {
		String s[]=new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Names");
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextLine();
		}
		Arrays.sort(s);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+" ");
		}

     }

}
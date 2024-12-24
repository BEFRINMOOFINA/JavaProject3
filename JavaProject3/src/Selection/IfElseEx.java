package Selection;
import java.util.Scanner;
public class IfElseEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage:");
             int per= sc.nextInt();
        if (per <= 100 && per > 90)
        {
        	System.out.println("A grade");
        }
        else if (per <= 90 && per > 70) {
        	System.out.println("A+ grade");
        }else
        
        {
        	System.out.println("Pass");
        }
	}
}
     
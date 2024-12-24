package Selection;

import java.util.Scanner;

public class Functions {
    static int distance(int u, int t, int a) {
        return (u * t) + (int)((a * t * t) / 2.0); // Preserve precision with double division
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u = 36; 
        u = (36 * 1000) / 3600; // Convert speed from km/h to m/s
        int a = 5;

        System.out.println("Enter two time values (in seconds): ");
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();

        // Call static method directly
        int Distance1 = Functions.distance(u, t1, a);
        int Distance2 = Functions.distance(u, t2, a);

        System.out.println("Distance1: " + Distance1);
        System.out.println("Distance2: " + Distance2);

        sc.close(); // Close Scanner
    }
}

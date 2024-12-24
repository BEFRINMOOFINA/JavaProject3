package CollectionFrameworks;

import java.util.Enumeration;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        System.out.println("My stack:");
        Stack<Integer> s = new Stack<>();
        
        System.out.println("Is empty or not: " + s.isEmpty());
        s.push(10);
        s.push(12);
        s.push(14);
        System.out.println("My elements: " + s);
        s.pop();
        System.out.println("After pop, my elements: " + s);
        System.out.println("Top of the element: " + s.peek());
        System.out.println("Is empty or not: " + s.isEmpty());
        System.out.println("Traversal using Enumeration:");
        Enumeration<Integer> e = s.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement() + " ");
        }
    }
}

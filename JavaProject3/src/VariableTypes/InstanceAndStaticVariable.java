package VariableTypes;
import java.util.Scanner;
class StaticVariableExample {
    static int rollNo;
    static String rName = "befiii";

    static void displayStaticMessage() {
        System.out.println("This is a static message");
    }

    String name; // instance variable
    void displayInstanceMessage() {
        System.out.println("This is an instance variable message");
    }
}
public class InstanceAndStaticVariable {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        StaticVariableExample.displayStaticMessage();
        StaticVariableExample.rollNo = 22; // static variable
        System.out.println("RollNo: " + StaticVariableExample.rollNo);
        System.out.println("rName: " + StaticVariableExample.rName);
        StaticVariableExample s = new StaticVariableExample();
        s.displayInstanceMessage();
        System.out.print("Enter name: ");
        s.name = s1.nextLine(); // Read multi-word names
        System.out.println("Name: " + s.name);
        s1.close();
    }
}

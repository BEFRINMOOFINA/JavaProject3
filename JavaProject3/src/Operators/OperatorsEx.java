package Operators;

public class OperatorsEx {
		public static void main(String[] args) {
		int num1 = 50, num2;
		num2=++num1;//post increment
		System.out.println("num2:"+num2);
		num2=--num1;//post decrement
		System.out.println("num2:"+num2);
		num2=num1++;//pre increment
		System.out.println("num2:"+num1);
		num2=num1--;//pre decrement
		System.out.println("num2:"+num1);
		int a=1011;
		int a1=~a;//invertion 2's compliment
		System.out.println("Invertion: "+a1);
		int b=10;
		int c=20;
		int add=b+c;
		System.out.println("Addition: "+add);
		int b11=35;
		System.out.println("shift operator----");
		System.out.println("Right shift"+(b11>>1));//It will half the no System.out.println("Left shift"+(b11<<1));//double the number
		System.out.println("Relational operator");
		int num3 =1;
		int num4 = 2;
		System.out.println("num1 > num2 is " + (num3 > num4));
		System.out.println("num1 < num2 is " + (num3 < num4));
		System.out.println("num1 >= num2 is " + (num3 >= num4));
		System.out.println("num1 <= num2 is " + (num3 <= num4));
		System.out.println("num1 == num2 is " + (num3 == num4));
		System.out.println("num1 != num2 is " + (num3 != num4));
		}
}
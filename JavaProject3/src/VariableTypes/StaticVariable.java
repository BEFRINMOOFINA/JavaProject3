package VariableTypes;
class StaticVar{
	static int dob;
	String name;//Instance variable
	static String course="Java";
	static void msg() {
		System.out.println("Hello Code");
	}
	void msg3() {
		System.out.println("C++");
	}
}
	public class StaticVariable {
		public static void main(String[] args) {
			StaticVar s=new StaticVar();
			s.name="Befiii";
			StaticVar.dob=2002;
			StaticVar.course="python";
			System.out.println("dob: "+StaticVar.dob);
			System.out.println("Nmae:"+s.name);
			System.out.println("course: "+StaticVar.course);
			StaticVar.msg();
			s.msg3();
		}
		
	}
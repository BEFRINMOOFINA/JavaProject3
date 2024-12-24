package VariableTypes;

public class LocalVariable {
	
	void MyAge() {
		int age = 6;
		age = age+10;
		System.out.println("MyAge: "+age);
	}

	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable();
		lv.MyAge();

	}

}

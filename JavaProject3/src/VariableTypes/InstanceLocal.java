package VariableTypes;
public class InstanceLocal {
	//ctrl-space
	//my own method
	void display() {
		System.out.println("Display");
	}
	void displayMsg() {
		System.out.println("******Display Msg*****");
	}
	public static void main(String[] args) {
		String s="Hello";
		System.out.println("Length:"+s.length());
		System.out.println("Char at:" +s.charAt(0));
		//classname objectname new classname();
		InstanceLocal i=new InstanceLocal();
		i.display();
		i.displayMsg();
	}
}
package VariableTypes;

class VariableDemo  {
	int count=0;//static variable
    int cnt=0;//instance variable
    public void increment() {
    	count++;
    }
    public void incre() {
    		cnt++;
    }
}

public class VariableTypes {
	public static void main(String[] args) {
		VariableDemo obj1= new VariableDemo();
		VariableDemo obj2= new VariableDemo();
		VariableDemo ohi3= new VariableDemo();
		VariableDemo obj4= new VariableDemo();
		obj1.incre();
		obj2.incre();
		//System.out.println("Obj1 Static: count is obj.cnt);
		//System.out.println("0b2 Static: count is obj2.cnt);
		System.out.println("Obj1 Instance: count is="+ obj2.cnt);
		System.out.println("Obj2 Instance: count is="+ obj2.cnt);
	}
}

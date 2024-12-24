package CollectionFrameworks;
import java.util.ArrayList;
public class ArrayListEx {
	public static void main(String[] args) {
		// Generic
		ArrayList alist3=new ArrayList<>();
		alist3.add("Befii");
		alist3.add(33);
		alist3.add(34.87);
		alist3.add('b');
		System.out.println("Elements :"+ alist3);
		
		ArrayList<Integer> alist1=new ArrayList<>();
		System.out.println("is Empty?: "+alist1.isEmpty());
		alist1.add(null);
		alist1.add(10);
		alist1.add (2);
		alist1.add(10);
		alist1.add(null);
		System.out.println("is Empty?: "+alist1.isEmpty());
		System.out.println("get Elementt: "+alist1.get(2));
		System.out.println("index of Elementt: "+alist1.indexOf(10));
		System.out.println("last index of Elementt: "+alist1.lastIndexOf(10));
		System.out.println("Elements: "+alist1);
		System.out.println("size Elements: "+alist1.size());
		alist1.set(0, 20);//Update
		System.out.println("Elements: "+alist1);
		alist1.remove(3);
		System.out.println("after remove Elements: "+alist1);
		ArrayList<Integer> blist=new ArrayList<>();
		blist.add (89);
		blist.add(45);
		blist.addAll(2,alist1);
		System.out.println("Elements in blist : "+blist);
	}
}
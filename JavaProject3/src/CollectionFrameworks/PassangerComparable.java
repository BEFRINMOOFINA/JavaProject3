package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;

class Passenger1 implements Comparable<Passenger1> {
	String pname;
	int ticketno;
	int price;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getTicketno() {
		return ticketno;
	}
	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Passenger1(String pname, int ticketno, int price) {
		super();
		this.pname = pname;
		this.ticketno = ticketno;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Passenger1 [pname=" + pname + ", ticketno=" + ticketno + ", price=" + price + "]";
	}
	//@Override
	//public int compareTo(Passenger1 o) {
		// TODO Auto-generated method stub
	//	return this.pname.compareTo(o.pname);
	//}
	@Override
	public int compareTo(Passenger1 o) {
		if(this.getTicketno()>o.getTicketno()) {
			return 1;
		}
		else if(this.getTicketno()<o.getTicketno()) {
			return -1;
		}
		else {
			return 0;
		}
	}	
}
public class PassangerComparable {
	public static void main(String[] args) {
		ArrayList<Passenger1> plist=new ArrayList<>();
		Passenger1 e=new Passenger1 ("viha",23,200);
		plist.add(e);
		plist.add(new Passenger1("abi",30,250));
		plist.add(new Passenger1("sabii",25,280));
		plist.add(new Passenger1("backia",28,260));
		plist.add(new Passenger1("remii",27,200));
		for(Passenger1 a:plist) {
			System.out.println(a);
		}
		System.out.println("Sort By Passenger Name: ");
		Collections.sort(plist);
		for(Passenger1 a:plist) {
			System.out.println(a);
		}
	}
}

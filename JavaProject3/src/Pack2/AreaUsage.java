package Pack2;
import Pack1.Area;
public class AreaUsage {
	public static void main(String[] args) {
		Pack1.Area a=new Pack1.Area (7.8);
	    a.disShape();
	    double area=a.calArea();
	    System.out.println("Area of circle: "+area);
	}
}
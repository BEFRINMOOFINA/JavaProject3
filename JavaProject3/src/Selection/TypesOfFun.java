package Selection;
class Area{
	static int areaTriangle (int l, int b) {
		return 1*b;
     }
}
public class TypesOfFun {
	// return-type functionname (parameter/arguments) {
    //block of code-logic
	//   }
    //no return-2 parameter int
       void add(int a, int b) {
    	   System.out.println("Addition: "+(a+b));
       }
        //no return type-no parameter
       
         void dis() {
        	 System.out.println("display");
         }
          //return type int-parameter int
          int mul(int a, int b) {
        	  return a*b;
          }
          String disMsg (String nm) {
        	  return "Welcome "+nm;
          }
          static double area(int r) {
        	  return 3.14*r*r;
          }
        	  public static void main(String[] args) {
        		  TypesOfFun t=new TypesOfFun();
        			 t .add(2,2);
        			 t.dis();
        			 int m=t.mul(10,49);
        			 System.out.println("Multiplication: "+m);
        		     System.out.println("Multiplivation:"+t.mul(3,4));
        		     String s=t.disMsg("to EduBridge");
        		     System.out.println(s);
        		     double ar =area(7);
        		     System.out.println("Area of Circle:"+ar);
        		     int are = Area.areaTriangle(3, 8);
        		     System.out.println("Area of Triangle:"+are);        
        		     }
          }

package Pack1;
class Shape {
	public void disShape() 
	{
		System.out.println("Circle shape");
	}
}
	public class Area extends Shape {
		public double radius;
		public Area (double radius) 
		{
			this.radius=radius;
		}
		public double calArea() 
		{
			return 3.14*radius*radius;
		}
		public static void main(String[] args) {
			
		}
	}
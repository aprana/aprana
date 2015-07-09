package Inetrface;

public class Triangle  implements Figure{
	int base;
	int height;
   double area;
	public void calcArea(){
		area=0.5*base*height;
		
		
	}
	 public Triangle(int base, int height) {
		//super();
		this.base = base;
		this.height = height;
	}
		
	public void display() {
		System.out.println("Area of triangle" + area);
	}

}

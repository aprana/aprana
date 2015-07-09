package Inetrface;

public class Pentagoan implements Figure {
	
	
	
	int side;
	int a_length;
	
	public Pentagoan(int side, int a_length) {
		super();
		this.side = side;
		this.a_length = a_length;
	}
	double area;
	
	public void calcArea(){
		area=2.5*side*a_length;
	}
	public void display() {
		System.out.println("Area of pentagon " + area);
	}

}

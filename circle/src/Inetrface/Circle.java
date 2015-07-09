package Inetrface;

public class Circle implements Figure {
	 int radius;
	 double area;
		
		public void calcArea() {
			 this.area=3.14*radius*radius;
			
		}

		
		public Circle(int radius) {
			super();
			this.radius = radius;
		}


		public void display() {
			System.out.println("Area of circle " + area);
		}

		
	}


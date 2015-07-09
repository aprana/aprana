package abstract_figure;

public class Figure_main {

	public static void main(String[] args) {
		circle c = new circle(5);
		Rectangle r = new Rectangle(5,7);
		triangle t=new triangle(4,2);
		
		
		 System.out.println("Area of rectangle : " + r.area());
         System.out.println("Area of circle : " + c.area());
         System.out.println("Area of triangle : " + t.area());
		
		
				
	}

}

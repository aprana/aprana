package Inetrface;


public class main {
	
public static void main(String[] args) {
		
		Circle circle=new Circle(5);
		Pentagoan pentagon=new Pentagoan(5,2);
		Triangle triangle=new  Triangle(5,2);
	      
	      circle.calcArea();
	      circle.display();	      
	      
	     pentagon.calcArea();
	     pentagon.display();
	     
	     triangle.calcArea();
	     triangle.display();
	     

		
	}

}

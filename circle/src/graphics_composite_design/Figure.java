package graphics_composite_design;

public class Figure implements Shape {
	
	Shape thisFigure;
	Shape otherFigure;
	
	public  Figure(Shape s){
		 thisFigure=s;
			 
	}
	
	public void  add(Shape s){
		 this.otherFigure=s;
			 
	}
	
	public void  draw(){
		thisFigure.draw();
		otherFigure.draw();
	}

}

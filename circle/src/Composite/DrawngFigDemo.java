package Composite;

public class DrawngFigDemo {

	public static void main(String[] args) {
		Figure figmain=new Figure(new Rectangle());
		Figure fig1=new Figure(new Circle());
		Figure fig2=new Figure(new Triangle());
		Circle circle=new Circle();
		
		fig2.add(circle);
		fig1.add(fig2);
		figmain.add(fig1);
	    figmain.draw();
        
	}

}

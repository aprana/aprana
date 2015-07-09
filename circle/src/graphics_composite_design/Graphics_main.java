package graphics_composite_design;

public class Graphics_main {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		
		Figure FR=new Figure(new Circle());
		Figure FC=new Figure(new Rectangle());
		Figure FT=new Figure(new Triangle());
		
		FR.add(c);
		FT.add(FR);
		FC.add(FT);
		FC.draw();
		
		
		
	

	}

}

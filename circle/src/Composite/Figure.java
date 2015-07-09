package Composite;

public class Figure implements Shape{
	
	Shape thisFig;
	Shape othFig;
	
	public Figure(Shape thisFig) {
		super();
		this.thisFig = thisFig;
	}
	
	@Override
	public void draw() {
		thisFig.draw();
		othFig.draw();
	}

	public void add(Shape s)
	{
		othFig=s;
	}
}

package abstract_figure;

public class circle extends Figure {
	double radius;
	 
	public circle(double radius) {
		super();
		this.radius = radius;
	}

	

	

	
	
	
public void cal_area(double r){
	radius=r;
}

double area()
{
      return Figure.getPi()*radius*radius;
}


}

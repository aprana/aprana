package abstract_figure;

public class triangle extends Figure{
	
	
	public triangle(double l,double b){
		height=l;
		width=b;
	}
	
	double area(){
		return 0.5*height*width;
		
	}

}

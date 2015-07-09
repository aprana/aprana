package abstract_figure;

abstract class Figure {
		private static double pi=3.14;
	    private double num;
	    protected double height;
	    protected double width;
	    
	
	
	
	public double getNum() {
			return num;
		}

		public void setNum(double num) {
			this.num = num;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

					public void display(){
					System.out.println("area of figure is:");
		
						}
							
	
					public void draw(){
					System.out.println("draw of firure");
						}
					
					
					abstract double area();
						

					public static double getPi() {
						return pi;
					}

					public void setPi(double pi) {
						this.pi = pi;
					}
}
	
	

	


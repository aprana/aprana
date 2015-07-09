package Complex;

public class Complex {
	
		double r,i;
		public Complex(double re, double im)
		{
			r=re;
			i=im;
		}
		public Complex()
		{
			r=0;
			i=0;
		}
		void display()
		{
			System.out.println("\n\tThe number is "+r+" i"+i);
		}
		Complex add( Complex a)
		{
			Complex n= new Complex();
			n.r=this.r+a.r;
			n.i=this.i+a.i;
			return n;
		}
		Complex sub( Complex a)
		{
			Complex n= new Complex();
			n.r=this.r-a.r;
			n.i=this.i-a.i;
			return n;
		}
		
		Complex mult( Complex a)
		{
			Complex n= new Complex();
			n.r=this.r*a.r-i*a.i;
			n.i=this.r*a.i+i*a.r;
			return n;
		}
		
	}
	
	


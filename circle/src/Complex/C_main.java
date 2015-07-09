package Complex;

public class C_main {


		public static void main(String args[])
		{
			Complex c1= new Complex(10,15);
			Complex c2= new Complex(20,25);
			Complex res=new Complex();
			System.out.println("\n\tAddition of two number is");
			res= c1.add(c2);
			res.display();
			
			System.out.println("\n\tSubstraction")
			System.out.println("\n\tMultiplication ");
			res=c1.mult(c2);
			res.display();
			
		}
	

	}



package exceptionDemo;

public class ThrowsDemo {
	
	public static void meth() throws ArithmeticException {
		System.out.println("Inside meth() method");
		System.out.println("This method throws Arithmetic Exception...");
		throw new ArithmeticException();
		//System.out.println("AFTER THROWING"); //Unreachable code
	}
	
	public static void main(String args[]) {
		try
		{
			 System.out.println("Inside main method");
			 System.out.println("Calling meth() method...");
			 System.out.println("Now Main has to guard against the Arithmetic Exception by enclosing the call to meth() inside try");
			 meth();
		}
		catch(ArithmeticException e)
		{
		     System.out.println("Inside catch block");
		     System.out.println("Handling the Arithmetic Exception thrown by the meth() method");
		}
	}
}

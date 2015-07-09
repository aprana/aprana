package exceptionDemo;

public class WithoutThrowsDemo {
	public static void meth()
	{
		System.out.println("Inside meth() method");
		System.out.println("This method throws ArithmeticException..");
		throw new ArithmeticException();
	}
	public static void main(String args[])
	{
		System.out.println("Inside main method");
		System.out.println("Calling meth() method..");
		meth();

	}
}

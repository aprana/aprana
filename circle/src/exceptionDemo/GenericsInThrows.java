package exceptionDemo;

public class GenericsInThrows {
	
	public static <T extends Throwable> void throwMeConditional(boolean conditional, T exception) throws T
	{
	    if(conditional) {
	        throw exception;
	    }
	}
	
	public static void main(String[] args)
	{
		try
		{
			//throwMeConditional(true, new ArithmeticException());
			//throwMeConditional(true, new ArrayIndexOutOfBoundsException());
			throwMeConditional(true, new NullPointerException());
		}
		catch(Exception e)
		{
			System.out.println("Exception of " + e.getClass() + " handled");
		}
	}
}

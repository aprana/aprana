package userDefinedExceptionDemo;

public class UserDefinedException extends Exception
{
	String customMessage;
	
	public UserDefinedException(int i)
	{
		
		System.out.println("The program asked you to enter a postive number");
		if (i==0)
		{
			customMessage = "Encountered Zero";
			System.out.println("However you have entered zero.");
		}
		else if(i<0)
		{
			customMessage = "Encountered Negative Number";
			System.out.println("However you have entered a negative number.");
		}
		System.out.println("So throwing an Exception...");
	}
	
	@Override
	public String getMessage()
	{
		return customMessage;
	}
}

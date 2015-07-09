package exceptionDemo;

public class NestedTwiceWithThrowNotCaughtDemo {
	public static void main(String args[])
	{
		try
		{
		   System.out.println("try main");
	
		   try
		   {
			   System.out.println("try 1");
			   try
			   {
				   System.out.println("try 2");
				   throw new ArithmeticException("Arithmetic Exception !!!");
			   }
			   /*catch(Exception e2)
			   {
				   System.out.println("catch 2 " + e2.getMessage());
			   }*/
			   finally
			   {
				   System.out.println("finally 2");
			   }
		   }
		   /*catch(Exception e1)
		   {
			   System.out.println("catch 1 " + e1.getMessage());
		   }*/
		   finally
		   {
			   System.out.println("finally 1");
		   }
		}
		catch(Exception e3)
		{
			System.out.println("catch main " + e3.getMessage());
		}
	}
}

package exceptionDemo;

public class NestedWithThrowNotCaughtDemo {
	public static void main(String[] args) {
		//Main try block
		try
		{
		   System.out.println("try main");
		   String str=null;
		   //str.charAt(0);
		   
		   //try-catch block inside another try block
		   try
		   {
			   System.out.println("try 1");
			   throw new ArithmeticException("Arithmetic Exception !!!");
		   }
		   catch(Exception e1)
		   {
		       //Exception Message
			   System.out.println("catch 1 " + e1.getMessage());
		   }
		   
		   //Only throws, does not catch, hence the exception is passed on to the parent
		   try
		   {
			   System.out.println("try 2");
			   throw new IndexOutOfBoundsException("Index out of bounds exception !!!");
		   }
		   finally
		   {
		       //Exception Message
			   System.out.println("finally");
		   }
		}
		catch(Exception e3) //Catch of Main(parent) try block
		//finally
		{
		      //Exception Message
			//System.out.println("catch main " + e3.getMessage());
			System.out.println("main");
		}

	}
}

package exceptionDemo;

public class TryCatchDemo {
	public static void main(String[] args) 
	{
		int a[]=new int[10];

		try 
		{
			a[-1]=1;
     		System.out.print(a[0]+" ~~~~ "); //Skipped
		}
		catch(ArrayIndexOutOfBoundsException e)
	 	{
			System.out.println("Array Index is out of bounds !");
	 	}
		
		System.out.println("=============================");
		
		
		for(int i=-1;i<10;i++)
		{
			try 
			{
				a[i]=i;
	     		System.out.print(a[i]+" "); //Skipped when exception occured
			}
			catch(ArrayIndexOutOfBoundsException e)
		 	{
				System.out.println("Array Index is out of bounds !!");
		 	}
		}
		
		
		System.out.println("\n=============================");
		
		
		try 
		{
			for(int i=-1;i<10;i++)
			{
				a[i]=i;
	     		System.out.print(a[i]+" "); //Skipped when exception occured
			} //for look also skipped as it is within the try block
			//(all the statements in the block that are there after the statement where exception occurred are skipped)
		}
		catch(ArrayIndexOutOfBoundsException e)
	 	{
			System.out.println("Array Index is out of bounds !!!");
	 	}
		
		System.out.println("=============================");
		
		/*try
		{
			int test = a[0]/0; //Arithmetic Exception is thrown
		}
		catch(ArrayIndexOutOfBoundsException e) //But no catch block that catches Arithmetic Exception
		{
			System.out.println("Exception !!!!");
		}*/
		
		System.out.println("=============================");
		
		try
		{
			int test = a[0]/0; //Arithmetic Exception is thrown
		}
		catch(ArithmeticException e) //Specify Arithmetic Exception if you know that the code may throw ArithmeticException
		{
			System.out.println("Arithmetic Exception !!!!!");
		}
		
		
		System.out.println("=============================");
		
		try
		{
			int test = a[0]/0; //Arithmetic Exception is thrown
		}
		catch(Exception e) //Specify the class Exception if the type of exception that could be thrown is not known
		{
			System.out.println("General Exception");
		}
		
		System.out.println("=============================");
		
		System.out.println("Multiple Catch");
		
		try
		{
			String t = null;
			t.indexOf(0);
			int test = a[0]/0; //Arithmetic Exception is thrown
			test = a[-1] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e) //To handle the remaining types of exception
		//If this catch is commented, the code will throw NullPointerException exception at runtime. 
		{
			System.out.println("Any type of Exception");
		}
		
		/*
		try
		{
			int test = a[0]/0; //Arithmetic Exception is thrown
			test = a[-1] = 10;
		}
		catch(Exception e)
		{
			System.out.println("An Exception has occurred");
		}
		catch(ArrayIndexOutOfBoundsException e) //Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch(ArithmeticException e) //Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
		{
			System.out.println("Arithmetic Exception");
		}*/
		
		
		System.out.print("\nHi");
	}

}

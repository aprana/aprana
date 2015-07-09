package exceptionDemo;

import java.io.*;
public class FinallyDemo
{
	public static void meth(int i) throws ArrayIndexOutOfBoundsException
	{
		try
		{
			if (i==1)
			{
				System.out.println("Currently in try block");
				System.out.println("Returning ...");
				return;
			}
			if (i==2)
			{
				System.out.println("Inside meth()method");
				System.out.println("This method throws ArrayIndexOutOfBounds Exception");
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("In the catch block ");
			System.out.println("ArrayIndexOutOfBounds Exception is being handled");
		}*/
		finally
		{
			System.out.println("Executing statements in finally block.");
		}
	}
	
	public static void main(String[] args)
	{
		int i;
		String s=new String();
		System.out.println("Enter any integer");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			s=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		i=Integer.parseInt(s);
		try
		{
			meth(i);
			System.out.println("... Returned to main");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("IN MAIN In the catch block ");
			System.out.println("ArrayIndexOutOfBounds Exception is being handled");
		}
		
	}
}


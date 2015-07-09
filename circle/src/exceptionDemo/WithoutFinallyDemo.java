package exceptionDemo;

import java.io.*;

public class WithoutFinallyDemo
{
	public static void meth(int i)throws ArithmeticException, ArrayIndexOutOfBoundsException, ArrayStoreException
	{
		if (i==1)
		{
			System.out.println("Inside meth() method");
			System.out.println("This method throws ArithmeticException");
			throw new ArithmeticException();
		}
		if (i==2)
		{
			 System.out.println("Inside meth() method");
			 System.out.println("This method throws ArrayIndexOutOfBoundsException");
			 throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("These statements must be compulsorily printed ");
		System.out.println("Hi there ");
		System.out.println("Hello there ");
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
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException is being handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is being handled");
		}
	}
}

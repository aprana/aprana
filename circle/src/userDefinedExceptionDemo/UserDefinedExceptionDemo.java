package userDefinedExceptionDemo;

import java.io.*;

public class UserDefinedExceptionDemo
{
	public static void main(String args[])
	{
		int i;
		String s=null;
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
			if (!(i>0))
				throw new UserDefinedException(i);
		}
		catch(UserDefinedException e)
		{
			System.out.println("The thrown Exception has been caught. The error was \"" + e.getMessage() + "\"");
		}
	}
}

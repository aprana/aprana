package exceptionDemo;

public class NestedDemo {

	public static void main(String[] args) {
		//Main try block
		try
		{
		   System.out.println("try main");
		   String str=null;
		   str.charAt(0);
		   
		   //try-catch block inside another try block
		   try
		   {
			   System.out.println("try 1");
			   int test = 10/0;
		   }
		   catch(Exception e1)
		   {
		       //Exception Message
			   System.out.println("catch 1");
		   }
		   //try-catch block inside another try block
		   try
		   {
			   System.out.println("try 2");
			   int[] arr = {1,2,3};
			   int test = arr[3];
		   }
		   catch(Exception e2)
		   {
		       //Exception Message
			   System.out.println("catch 2");
		   }
		}
		catch(Exception e3) //Catch of Main(parent) try block
		{
		      //Exception Message
			System.out.println("catch main");
		}

	}

}

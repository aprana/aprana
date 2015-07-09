package exceptionDemo;

public class ArrayIndexException {
	public static void main(String[] args) 
		{
			int a[]=new int[10];
			for(int i=-1;i<10;i++)
			{
				a[i]=i;
				System.out.print(a[i]+"");
			}
		}
}

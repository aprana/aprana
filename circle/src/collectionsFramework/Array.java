package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.Arrays;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		
		//Arrays are not a part of the Collections Framework

		//More Reference : http://www.tutorialspoint.com/java/util/arrays_binarysearch_object_index.htm

		Integer[] ints = new Integer[20];;
		Integer[] is = new Integer[20];;

		for(int i=0;i<ints.length;i++)
		{
			ints[i]=ints.length - i;
			is[i]=ints.length - i;
		}
		for(int i=0;i<ints.length;i++)
		{
			System.out.print(ints[i] + " ");
		}
		
		//sort()
		Arrays.sort(ints);

		System.out.println("\nAfter sorting");
		for(int i=0;i<ints.length;i++)
		{
			System.out.print(ints[i] + " ");
		}

		//binarySearch()
		
		//Returns -1 if the value is present but the array is not sorted
		//Returns -(arraylength + 1) if value is not present
		//Returns index if the value is found
		int index = Arrays.binarySearch(ints, 4);

		System.out.println("\nIndex " + index);
		
		//equals()

		System.out.println("Equals = " + Arrays.equals(ints, is)); //Comment the statement that sorts ints and check

		
		
		//fill()
		
		Character[] chArray = {'C', 'K', 'S', 'R', 'H', 'P'};
		for(int i=0;i<chArray.length;i++)
		{
			System.out.print(chArray[i] + " ");
		}
		Arrays.fill(chArray, 'A');
		System.out.println();
		for(int i=0;i<chArray.length;i++)
		{
			System.out.print(chArray[i] + " ");
		}
		
		System.out.println();
		
		//More Reference : http://www.tutorialspoint.com/java/util/arrays_fill_int.htm
		
		
		
		
		//asList()
		String strs[] = {"C", "C++", "Java", "C#.NET"}; //Array of Strings
		System.out.println(strs);
		
		List<String> strList = Arrays.asList(strs); //List of Strings
		System.out.println(strList);
		
		//More Reference : http://www.tutorialspoint.com/java/util/arrays_aslist.htm


		
		
		//Returning an array from a method
		
		//More Reference : http://www.tutorialspoint.com/java/java_arrays.htm
		
		int[] iArray = new int[20];
		for(int i=0;i<iArray.length;i++)
		{
			iArray[i] = i+51;
			System.out.print(iArray[i] + " ");
		}

		int[] testArray = addOne(iArray);

		System.out.println("\nAfter adding one");
		for(int i=0;i<ints.length;i++)
		{
			System.out.print(testArray[i] + " ");
		}
	}
	
	
	
	//Returning an array from a method
	
	public static int[] addOne(int[] list) {
		  int[] result = new int[list.length];

		  for (int i = 0; i < list.length; i++)
		  {
		    result[i] = list[i] + 1;
		  }
		  return result;
		}
	
	
}

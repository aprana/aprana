package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class TreeSetDemo {
	public static void main(String args[]) {
		
		//More Reference : http://www.tutorialspoint.com/java/java_set_interface.htm

		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(3);
		System.out.println(t1);
		
		t1.add(1);
		System.out.println(t1);
		
		t1.add(8);
		System.out.println(t1);
		
		t1.add(6);
		System.out.println(t1); //Sorted every time
		
		Set<String> s1 = new HashSet<String>();
		s1.add("One");
		s1.add("Two");
		s1.add("two");
		s1.add("Three");
		s1.add("three");
		s1.add("one");
		System.out.println(s1); //Not sorted
		
		Set<String> t2 = new TreeSet<String>(s1); //Sorted
		System.out.println(t2); //Three comes before Two as T=T and h comes before w, also Capital letters come before the small letters
		
		System.out.println("========================");

		HashSet<Integer> s2 = new HashSet<Integer>();
		s2.add(1);
		s2.add(16);
		s2.add(4);
		s2.add(8);
		s2.add(16); //Duplicate not added, returns false.
		System.out.println("HashSet Elements");
		System.out.println(s2); //Unsorted
		
		Set<Integer> t3 = new TreeSet<Integer>(s2); //Gets sorted in the TreeSet.
		System.out.println("TreeSet Elements");
		System.out.println(t3);
		t3.add(16); //Duplicate not added, returns false.
		System.out.println(t3);
		
		System.out.println("========================");

		List<Integer> a1 = new ArrayList<Integer>();
	    a1.add(1);
	    a1.add(16);
	    a1.add(4);
	    a1.add(8);
	    a1.add(16);
	    System.out.println("ArrayList Elements");
	    System.out.println(a1);
	    
	    Set<Integer> t4 = new TreeSet<Integer>(a1);
	    System.out.println("TreeSet Elements");
	    System.out.println(t4); //Duplicates not added while Converting from arrayList to TreeSet, duplicates removed/skipped


	    
	    String[] array = {"MCA", "BSc", "BCA", "MBA", "MCM", "PhD", "MBA", "BBA", "MCom", "MA", "BA", "BBA", "MCM", "MSc", "BCom"};
	    Set<String> h1 = new HashSet<String>();
	    for (int i = 0; i < array.length; i++)
	    {
		    if (!h1.add(array[i])) //add(array[i]) will return false when trying to insert duplicate String
		    {
		    	System.out.println("Duplicate detected: " + array[i]);
		    }
	    }
	    System.out.println(h1.size() + " distinct words detected: " + Arrays.asList(array));
	}
}

package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args)
	{
		//More Reference : http://www.tutorialspoint.com/java/java_collections.htm

		List<String> a1 = new ArrayList<String>(); //Warning : Generic - should be parameterized
	    a1.add("Tom");
	    a1.add("Jerry");
	    a1.add("Mickey Mouse");
	    a1.add("Donald Duck");
	    System.out.println(" ArrayList Elements");
	    System.out.print("\t" + a1);

	    List<String> l1 = new LinkedList<String>();
	    l1.add("Tom");
	    l1.add("Jerry");
	    l1.add("Mickey Mouse");
	    l1.add("Donald Duck");
	    l1.add("Jerry");
	    System.out.println();
	    System.out.println(" LinkedList Elements");
	    System.out.print("\t" + l1);

	    Set<String> s1 = new HashSet<String>();
	    s1.add("Tom");
	    s1.add("Jerry");
	    s1.add("Mickey Mouse");
	    s1.add("Donald Duck");
	    s1.add("Jerry"); //Duplicate
	    System.out.println();
	    System.out.println(" Set Elements");
	    System.out.print("\t" + s1);

	    Map<String, String> m1 = new HashMap<String, String>();
	    m1.put("Tom", "10");
	    m1.put("Jerry", "15");
	    m1.put("Mickey Mouse", "25");
	    m1.put("Donald Duck", "20");
	    System.out.println();
	    System.out.println(" Map Elements");
	    System.out.print("\t" + m1);
	    
	}
}

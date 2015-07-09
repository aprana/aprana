package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		//More Reference : http://www.tutorialspoint.com/java/java_set_interface.htm

		Set<String> s1 = new HashSet<String>();
	    s1.add("Tom");
	    s1.add("Jerry");
	    s1.add("Mickey Mouse");
	    s1.add("Donald Duck");
	    s1.add("Jerry"); //Duplicate
	    
	    System.out.println("\nSet s1 Elements");
	    System.out.print("\t" + s1);
	    
	    Boolean isAdded = s1.add("Jerry");
	    System.out.println("\n" + isAdded);
	    isAdded = s1.add("Scooby");
	    System.out.println(isAdded);
	    
	    
	    Set<String> s2 = new HashSet<String>();
	    s2.add("Dexter");
	    s2.add("Bluto");
	    s2.add("Scooby");
	    s2.add("Pokemon");
	    
	    
	    System.out.println("\nSet s2 Elements");
	    System.out.print("\t" + s2);
	    
	    //addAll()

	    System.out.print("\n\n================\n\nOriginal");
	    System.out.print("\n" + s1);
	    System.out.print("\n" + s2);

	    Boolean isSuccess = s1.addAll(s2);
	    
	    System.out.print("\n\ns1.addAll(s2) : Union : " + isSuccess);
	    System.out.print("\n" + s1);
	    System.out.print("\n" + s2);
	    
	    
	    
	    s2.add("Chip");
	    s2.add("Dale");
	    System.out.print("\n\n================\n\nOriginal");
	    System.out.print("\n" + s1);
	    System.out.print("\n" + s2);
	    
	    isSuccess = s1.retainAll(s2);
	    
	    System.out.print("\n\ns1.retainAll(s2) : Intersaction : " + isSuccess);
	    System.out.print("\n" + s1);
	    System.out.print("\n" + s2);

	    s1.add("Popeye");
	    System.out.print("\n\n================\n\nOriginal");
	    System.out.print("\n" + s1);
	    System.out.print("\n" + s2);
	    
	    isSuccess = s2.removeAll(s1);
	    
	    System.out.print("\n\ns2.removeAll(s1) : Minus : " + isSuccess);
	    System.out.print("\n" + s1);
	    System.out.print("\n" + s2);
	    
	    
	    
	    
	    
	    
	    
	    Set<String> s3 = new HashSet<String>();
	    s3.add("Tom");
	    s3.add("Jerry");
	    s3.add("Mickey Mouse");
	    s3.add("Donald Duck");
	    
	    Set<String> s4 = new HashSet<String>();
	    s4.add("Mickey Mouse");
	    s4.add("Jerry");
	    s4.add("Tom");
	    s4.add("Donald Duck");
	    
	    System.out.println("\n\nEquals\n");
	    System.out.println("s3 : " + s3);
	    System.out.println("s4 : " + s4);

	    Boolean isEqual;
	    isEqual = s3.equals(s4);
	    System.out.println("\n" + isEqual); //Order does not matter, but is case sensitive

	}

}

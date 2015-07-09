package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.HashSet;

public class IteratorDemo {
	public static void main(String[] args) {
		//More Reference : http://www.java-samples.com/showtutorial.php?tutorialid=235
		ArrayList<String> al = new ArrayList<String>();
		al.add("Tiger");
		al.add("Lion");
		al.add("Cat");
		al.add("Dog");
		al.add("Animal");

		//Iterator
		Iterator<String> itr = al.iterator(); //Obtain the iterator
		while(itr.hasNext())
		{
			Object element = itr.next();
			System.out.println("1 " + element);
			if(element.equals(new String("Animal")))
			{
				itr.remove();
				//itr.set("Something"); //.set() not there, editing the element not allowed with simple Iterators
				System.out.println(" removed");
			}
		}
		//Iterator now points to the end of the ArrayList


		//ListIterator
		System.out.println();
		ListIterator<String> litr = al.listIterator();
		litr = al.listIterator();
		while(litr.hasNext())
		{
			Object element = litr.next();
			System.out.println("2 " + element);
			litr.set(element.toString() + " !!!"); //.set() is there, element can be modified with ListIterator
		}
		
		//ListIterator now points to the end of the ArrayList
		//Printing in reverse order

		System.out.println();
		while(litr.hasPrevious())
		{
			Object element = litr.previous();
			System.out.println("3 " + element);
		}

		//Iterator with Set
		System.out.println("\nIterator with Set");
		Set<String> pcSet = new HashSet<String>();

		pcSet.add("Monitor");
		pcSet.add("CPU");
		pcSet.add("Wire");
		pcSet.add("Mouse");

		System.out.println(pcSet);

		Iterator<String> pcIter = pcSet.iterator();
		
		while(pcIter.hasNext())
		{
			Object o = pcIter.next();
			System.out.println(o);
			if(o.equals(new String("Wire")))
			{
				pcIter.remove();
				System.out.println(o + " removed");
			}
		}
		
		while(pcIter.hasNext())
		{
			System.out.println("This will not be printed as the pcIter has reached at the end -> hasNext() wll not return true");
			System.out.println(pcIter.next());
		}
		
		//Reset the iterator
		System.out.println();
		pcIter = pcSet.iterator();
		while(pcIter.hasNext())
		{
			System.out.println("Printing again = " + pcIter.next());
		}
		
		//Print backwards - not possible as this is not ListIterator
	}

}

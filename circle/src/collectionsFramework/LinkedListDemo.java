package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		//More Reference : http://www.tutorialspoint.com/java/java_list_interface.htm

		LinkedList<Integer> list = new LinkedList<Integer>();

		System.out.println(list);
		
		list.addFirst(10);
		System.out.println(list);
		
		list.addFirst(30);
		System.out.println(list);
		
		list.addFirst(20);
		System.out.println(list);
		
		list.addLast(50);
		System.out.println(list);
		
		list.add(2, 80);
		System.out.println(list);
		
		System.out.println(list.removeFirst());
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list);
	}
}

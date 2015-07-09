package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.LinkedList;

public class MyLinkedStack
{
	//More Reference : http://www.tutorialspoint.com/java/java_list_interface.htm

	//Using LinkedList to implement custom Stack
	private LinkedList<Object> list = new LinkedList<Object>();
	public void push(Object o)
	{
		list.addFirst(o);
	}
	public Object top()
	{
		return list.getFirst();
	}
	public Object pop()
	{
		return list.removeFirst();
	}
	public void print()
	{
		System.out.println(list);
	}
	
	public static void main(String args[])
	{
		String myCar;
		MyLinkedStack s = new MyLinkedStack();
		s.push(new String("One"));
		s.push(new String("Two"));
		s.push(new String("Three"));
		
		s.print();
		myCar = (String)s.pop();
		System.out.println(myCar);
		s.print();
	}
}
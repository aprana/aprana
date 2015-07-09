package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String args[]) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 15; i++)
		{
			l.add(i);
		}
		Collections.shuffle(l);
		System.out.println(l);
	}
}

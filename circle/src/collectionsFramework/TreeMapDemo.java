package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//Example 2 : Using map to store Strings and the number of occurrences.
		String[] strs = {"Panaji", "Miramar", "Dona Paul", "Bambolim", "Mapusa", "Ponda", "Margao"};
		
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		
		for (int i=0; i < strs.length; i++)
		{
			hMap.put(strs[i], i); //will update with highest i for a particular key
		}

		System.out.println("HashMap (Unsorted) " + hMap);
		
		Map<String, Integer> tMap = new TreeMap<String, Integer>();
		
		for (int i=0; i < strs.length; i++)
		{
			tMap.put(strs[i], i); //will update with highest i for a particular key
		}
		
		System.out.println("TreeMap (Sorted on key) " + tMap);

	}

}

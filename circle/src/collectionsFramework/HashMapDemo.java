package collectionsFramework;

//Import ONLY what is REQUIRED
import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {

	//private static final Integer ONE = new Integer(1);

	public static void main(String[] s) {

			//Map can be used to store any key value pair
			//More Reference : http://www.tutorialspoint.com/java/java_map_interface.htm

			//Example : to store Country Capital pair
			Map<String, String> countryCapital = new HashMap<String, String>();
			
			countryCapital.put("Goa", "Panjim");
			countryCapital.put("Maharashtra", "Mumbai");
			countryCapital.put("Karnataka", "Bangalore");
			
			System.out.println(countryCapital);
			
			//map.get(key) returns the 'value' associated with the 'key'
			System.out.println("get(\"Goa\") returns " + countryCapital.get("Goa")); //Returns Panaji
			System.out.println("get(\"Panjim\") returns " +countryCapital.get("Panjim")); //Does not find Panaji in the key field
			
			String oldValue = countryCapital.put("Goa", "Panaji"); //Updates Goa with Panaji and teturns old value Panjim
			System.out.println("Old value = " + oldValue);
			String currentValue = countryCapital.get("Goa"); //Returns Panaji
			System.out.println("New value = " + currentValue);
			
			System.out.println(countryCapital);
			
			System.out.println("===============================");
		
			
			
			//Example 2 : Using map to store Strings and the number of occurrences.
			String[] args = {"AAA", "BBB", "CCC", "AAA", "AAA", "BBB", "AAA"};
			Map<String, Integer> m = new HashMap<String, Integer>();
			
			//Initialize frequency table from args
			for (int i=0; i < args.length; i++)
			{
				//map.get(key) returns the 'value' associated with the 'key'
				Integer freq = (Integer) m.get(args[i]); //Since the second parameter(value) is of type Integer, it will return Integer

				System.out.println("\nm.get(" + args[i] + ") returned " + freq);


				//map.put(key, value)
				//searches for 'given key' in the 'key' field of the map and then
				//if 'key' is found, updates 'value' of 'existing key' to the 'given value' and returns the 'old value',
				//if 'key' is not found inserts a new entry with 'value' and 'key'.

				m.put(args[i], (freq==null ? 1 : freq + 1));
				//m.put(args[i], (freq==null ? ONE : new Integer(freq.intValue() + 1)));
				
				
				System.out.print("Inserting " + args[i] + ", ");
				System.out.println(freq==null? 0 : freq + 1);
			}
			System.out.println("\n" + m.size()+ " distinct words detected:");
			System.out.println(m);
			
			Integer value = m.put("AAA", -1);
			System.out.println("\nAAA's old value " + value);
			System.out.println(m);
			
			value = m.put("ZZZ", -999);
			System.out.println("ZZZ's old value " + value);
			System.out.println(m);
			
	}

}

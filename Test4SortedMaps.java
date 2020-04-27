import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test4SortedMaps {

	public static void main(String[] args) {
		
		/*HashMap --- sorts in numeric order
		LinkedHashMap -- sorts in order we put it
		TreeMap - sorts in natural order..i.e numeric in 1,2,3,4 order, String in alphabetical..args.
		*/
	//	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	//	LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
	//	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		//above can be written as below also both are correct
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();


		// HashMap print --it sorts the list in numerical ordedr
		/*Output will be
		 *  0: Rat
			1: Dog
			4: Bear
			6: Swan
			8: Cat
			9: Fox
			15: Tiger
		 */
		System.out.println("Using HashMap print");
		testMap(hashMap);

		// linkedMap print - It maintains the order in which we put it..no sortingg
		/*Output will be
		 *  9: Fox
			4: Bear
			8: Cat
			1: Dog
			0: Rat
			15: Tiger
			6: Swan
		 */
		System.out.println("\nUsing LinkedMap print");
		testMap(linkedMap);

		// treeMap print...it sorts the list
		/*Output will be
		 *  0: Rat
			1: Dog
			4: Bear
			6: Swan
			8: Cat
			9: Fox
			15: Tiger
		 */
		System.out.println("\nUsing treeMap print");
		testMap(treeMap);

	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(4, "Bear");
		map.put(8, "Cat");
		map.put(1, "Dog");
		map.put(0, "Rat");
		map.put(15, "Tiger");
		map.put(6, "Swan");

		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}

	}


}

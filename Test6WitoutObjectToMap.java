import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test6WitoutObjectToMap {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<String, Integer>();

		map1.put("one", 1);
		map1.put("two", 2);
		map1.put("three", 3);
		map1.put("one", 1);

		for (String key : map1.keySet()) {
			System.out.println(key + ": " + map1.get(key)); // will not print "One" again
															// as keys in Map are unique
		}

		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("cat");
		set1.add("dog");
		set1.add("tiger");
		set1.add("dog");

		System.out.println(set1); // will not print "dog" again
									// as keys in Set are unique

	}

}

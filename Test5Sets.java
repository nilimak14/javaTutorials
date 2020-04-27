import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test5Sets {

	public static void main(String[] args) {
		// Sets is a collection which stores unique data
		// HashSet does not retain order

		// Set<String> set1 = new HashSet<String>();
		// LinkedHashSet remembers the order you added items in

		// Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet sorts in natural order

		Set<String> set1 = new TreeSet<String>();
		// To check if set is empty////

		if (set1.isEmpty()) {
			System.out.println("Set is empty at start");
		}

		System.out.println();

		set1.add("Cat");
		set1.add("Dog");
		set1.add("Tiger");
		set1.add("Camel");

		if (set1.isEmpty()) {
			System.out.println("Set is empty after adding items");
		}
		// Adding duplicates does nothing
		set1.add("Tiger");
		System.out.println(set1);

		System.out.println();

		///// Iteration/////
		for (String elements : set1) {
			System.out.println(elements);
		}

		System.out.println();

		// Does set contains given item////////
		if (set1.contains("Bear")) {
			System.out.println("Contains Bear");
		}

		if (set1.contains("Tiger")) {
			System.out.println("Contains Tiger");
		}
		System.out.println();

		//Set2 contains some common elements from set1 and some new elements
		Set<String> set2 = new TreeSet<String>();
		// To check if set is empty////

		set2.add("Cat");
		set2.add("Dog");
		set2.add("Giraffe");
		set2.add("Snake");
	
	////// Intersection////////
		
		//making copy of set1
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		System.out.println("\nAfter using retainall\n");
		System.out.println(intersection);
		
		////Difference between 2 sets/////
		//creating copy of set1
		Set<String> difference = new HashSet<String>(set1);
		
		// print elements from Set1, which are not in Set2
		difference.removeAll(set2);
		System.out.println(difference);
		
		// print elements from Set2, which are not in Set1
		Set<String> difference1 = new HashSet<String>(set2);
		difference1.removeAll(set1);
		System.out.println(difference1);

	}


}

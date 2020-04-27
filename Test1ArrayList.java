import java.util.ArrayList;

public class Test1ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Adding values to ArrayList
		numbers.add(10);
		numbers.add(30);
		numbers.add(60);

		// Retrieving values from ArrayList
		System.out.println(numbers.get(0));

		System.out.println("\nIteration #1");

		// Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println("\nIteration #2");

		for (Integer value : numbers) {
			System.out.println(value);
		}

		System.out.println("\nIteration #3");
		// Removing items from ArrayList

		// Removing items from last
		numbers.remove(numbers.size() - 1);

		// Removing items from first
		numbers.remove(0);
		
		for (Integer value : numbers) {
			System.out.println(value);
		}
	
	}


}

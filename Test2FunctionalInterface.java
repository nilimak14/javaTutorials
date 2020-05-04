import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test2FunctionalInterface {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9);

		// Predicate<Integer> predicate = n->true
		// n is passed as a parameter to test method of Predicate Interface
		// test method will always return true no matter what value n has

		System.out.println("Print all numbers");

		// pass n as parameter

		eval(list1, n -> true);
		
		System.out.println();

		// Predicate<Integer> predicate = n-> n%2 == 0
		// n is passed as a parameter to test method of Predicate Interface
		// test method will return true if n%2 comes to be zero

		System.out.println("Print even numbers");

		eval(list1, n -> n % 2 == 0);
		
		System.out.println();

		// Predicate<Integer> predicate = n-> n > 3
		// n is passed as a parameter to test method of Predicate Interface
		// test method will return true if n is greater than 3

		System.out.println("Print numbers greater than 3");

		eval(list1, n -> n > 3 );

	}
	
	public static void eval(List<Integer> list1, Predicate<Integer> predicate1) {
		for(Integer n: list1) {
			if(predicate1.test(n)) {
				System.out.println(n + " ");
				
			}
		}
	}

}

/* Output
Print all numbers
1 
2 
3 
4 
6 
7 
8 
9 

Print even numbers
2 
4 
6 
8 

Print numbers greater than 3
4 
6 
7 
8 
9 

*/

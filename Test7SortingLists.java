import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;
	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}

}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}

}

// to sort by reverse alphabetical order
class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}

}

public class Test7SortingLists {

	public static void main(String[] args) {

		//////// Sorting Strings////////////////////
		List<String> animals = new ArrayList<String>();

		animals.add("dog");
		animals.add("tiger");
		animals.add("girafee");
		animals.add("monkey");
		animals.add("donkey");
		animals.add("snake");
		animals.add("cat");

		// to sort list in alphabetical order
		// Collections.sort(animals);

		// to sort list by length of string
		// Collections.sort(animals, new StringLengthComparator());

		// to sort list by Alphabetical order
		// Collections.sort(animals, new AlphabeticalComparator());

		// to sort list by reverse Alphabetical order
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		System.out.println("\nSorting Strings");

		for (String animal1 : animals) {
			System.out.println(animal1);
		}

		//////// Sorting Numbers////////////////////

		System.out.println("\nSorting Integers");
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(1);
		numbers.add(9);
		numbers.add(3);
		numbers.add(6);

		// Collections.sort(numbers);

		// sorting numbers in reverse order
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});

		// If we want to sort strings by length of each string

		for (Integer num1 : numbers) {
			System.out.println(num1);
		}

		//////// Sorting Arbitrary Objects////////////////////

		System.out.println("\nSorting Arbitrary Objects");

		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Myra"));
		people.add(new Person(2, "Neha"));
		people.add(new Person(3, "Gita"));
		people.add(new Person(4, "Nita"));

		// Sort in order of id
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}

		});
		
		System.out.println("\nSorting in order of id");
		for (Person person1 : people) {
			System.out.println(person1);
		}


		// Sort in order of name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());

			}

		});
		
		System.out.println("\nSorting in order of name");

		for (Person person1 : people) {
			System.out.println(person1);
		}

	}

}

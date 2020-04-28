import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*
	 * @Override public int compareTo(Person person1) { return
	 * name.compareTo(person1.name); // return -name.compareTo(person1.name); // -
	 * sign means in reverse order }
	 */
	@Override
	public int compareTo(Person person1) {
		int len1 = name.length();
		int len2 = person1.name.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
		//	return 0;  // at this stage if lengths are equal, it will print only first name of
			           //same length and will skipped all others
			           // in order to print all names of same length do following 
			return name.compareTo(person1.name);
		}
	}

}

public class Test8NaturalOrderObject {

	public static void main(String[] args) {

		List<Person> list1 = new ArrayList<Person>();
		SortedSet<Person> set1 = new TreeSet<Person>();

		addElements(list1);
		addElements(set1);

		Collections.sort(list1);

		System.out.println("Showing List\n");
		showElements(list1);

		/*
		 * Output is Showing List
		 * 
		 * Paru
		 * Myra
		 * Kiara
		 * Amita
		 * Papri
		 */

		System.out.println("\nShowing Set\n");
		showElements(set1);
		/*
		 * Output is Showing Set
		 * Paru
		 * Kiara
		 */
//This is because Myra is same length ass of "Paru" , so it is skipped
// Amita and Papri are same length as of "Kiara", so they both are skipped
		// in order to not skip any names of same length we will return as follows:
		// return name.compareTo(person1.name) ...instead of return 0;
	}

	private static void addElements(Collection<Person> col) {

		col.add(new Person("Kiara"));
		col.add(new Person("Amita"));
		col.add(new Person("Paru"));
		col.add(new Person("Papri"));
		col.add(new Person("Myra"));

	}

	private static void showElements(Collection<Person> col) {
		for (Person element : col) {

			System.out.println(element);

		}
	}

}

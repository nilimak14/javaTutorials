import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test8NaturalOrder {

	
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		SortedSet<String> set1 = new TreeSet<String>();

		addElements(list1);
		addElements(set1);

		Collections.sort(list1);

		System.out.println("Showing List\n");
		showElements(list1);

		System.out.println("\nShowing Set\n");
		showElements(set1);

	}

	private static void addElements(Collection<String> col) {

		col.add("Myra");
		col.add("Kiara");
		col.add("Paru");
		col.add("Amita");
		col.add("Papri");

	}

	private static void showElements(Collection<String> col) {
		for (String element : col) {

			System.out.println(element);

		}
	}

}

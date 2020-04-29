import java.util.Iterator;
import java.util.LinkedList;

public class Test10Iterators {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("Fox");
		animals.add("Tiger");
		animals.add("Snake");
		animals.add("Monkey");

		Iterator<String> it1 = animals.iterator();

		while (it1.hasNext()) { // until list has next item
			String animal1 = it1.next(); // animal1 has "Fox" i.e. first item in list
			System.out.println(animal1);
			if(animal1.equals("Snake")) {
				it1.remove(); // it removes item from the list
			}
		}
		System.out.println();

		for (String animal2 : animals) {
			System.out.println(animal2);
		}

	}

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2LinkedList {

	public static void main(String[] args) {
		// ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// Both of the above can be also written as

		// ArrayList manage Arrays internally
		// [0][1][2][3]...
		//
		// If we want to move items from start or lasts of the list, use ArrayList

		List<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * LinkList consists of elements where each element has a reference to the
		 * previous and next element [0]->[1]->[2]... [0]<-[1]<-[2]...
		 */
		// If we want to move items from middle of the list, use LinkedList

		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);

	}

	private static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();

		// Add items at the end of the list
		// for (int i = 0; i < 1E5; i++) {
		// list.add(i);
		// }

		// Add items elsewhere in the list
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();

		System.out.println("Time Taken: " + (end - start) + " ms for " + type);

	}


}

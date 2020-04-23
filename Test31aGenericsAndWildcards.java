//program uses Generics and Wildcard ?

import java.util.ArrayList;

class Machine1 {

	@Override
	public String toString() {
		return "I am a Machine.";
	}

}

class Camera1 extends Machine1 {
	
	@Override
	public String toString() {
		return "I am a Camera.";
	}
}

public class Test31aGenericsAndWildcards {

	public static void main(String[] args) {
		ArrayList<Machine1> list1 = new ArrayList<Machine1>();
		list1.add(new Machine1());
		
		ArrayList<Camera1> list2 = new ArrayList<Camera1>();
		list2.add(new Camera1());


		showList(list1);
		
	//	showList(list2); // This won't work. Though Camera1 extends Machine1, ArrayList of Machine
		                 // is not a subclass  of ArrayList of Camera1
		
		showList(list2); // now will print "I am a Camera"

	}

	// In order  to achive showList(list2), we need to pass  wildcard (?) in ArrayList
			// as shown here which means ArrayList of unknown type
	       // so now we can pass ArrayList of any type  ass a parameter to showList() method
	public static void showList(ArrayList<?> list) {
		for (Object value : list) {  // We cannot use Machine1 here instead we can use "Object"
			                           // as Object type as "Object" is parent of all classes
			                           // in Java
			System.out.println(value);
		}
	}

}

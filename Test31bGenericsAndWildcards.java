//program uses Generics and Wildcard ?

import java.util.ArrayList;

class Machine2 {

	@Override
	public String toString() {
		return "I am a Machine2.";
	}

	public void start() {
		System.out.println("Machine2 is started");
	}

}

class Camera2 extends Machine2 {

	@Override
	public String toString() {
		return "I am a Camera2.";
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class Test31bGenericsAndWildcards {

	public static void main(String[] args) {
		ArrayList<Machine2> list1 = new ArrayList<Machine2>();
		list1.add(new Machine2());

		ArrayList<Camera2> list2 = new ArrayList<Camera2>();
		list2.add(new Camera2());

		showList(list1);
		showList(list2);
		
	//	showList1(list1);
		showList1(list2);
		
		showList2(list2);
		showList2(list1);

	}

	// In order to call methods of Machine2, we can extend Machine2 in ArrayList ?
	// type
	public static void showList(ArrayList<? extends Machine2> list) {
		for (Machine2 value : list) {
			System.out.println(value);
			value.start();
		
			//value.snap(); // won't  work because we can call only Machine2 methods here
		}

	}
	
	public static void showList1(ArrayList<? extends Camera2> list) {
		for (Camera2 value : list) {
			System.out.println(value);
			value.start();
			value.snap(); 
		}

	}

	public static void showList2(ArrayList<? super Camera2> list) {
		for (Object value : list) {
			System.out.println(value);
		//	value.start();
		//	value.snap(); 
		}

	}
}

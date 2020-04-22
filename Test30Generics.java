//A generic class is a class that works with other object and specify
//what type of object work wwth when we instantiate a class i.e. creating object of a class

import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}


public class Test30Generics {

	public static void main(String[] args) {
		///Before JAva 5///
		ArrayList list1 = new ArrayList();
		list1.add("apple");
		list1.add("banana");
		list1.add("orange");
		
		String fruit = (String)list1.get(1);
		System.out.println(fruit);
		
		///Modern style --after Java5
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("fox");
		strings.add("dog");
		
		String animal = strings.get(2);
		System.out.println(animal);
		
		////There can be more than one type of parameters
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/////Java 7 style /////
		
		ArrayList<Animal> anim = new ArrayList<>();
		

	}

}

import java.util.HashMap;
import java.util.Map;

public class Test3HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(3,"Three");
		map1.put(8,"Eight");
		map1.put(6,"Six");
		
		map1.put(8,"Hello");  // If we duplicate key number, it will overwrite last value
		
		String text = map1.get(8);  
		String text1 = map1.get(2); 
		System.out.println(text); //it will print text associated with number 8
		System.out.println(text1);// It will print null, as swe have not map anything  with 
                                  // number 2 here

		//to print all values from map
		
		for(Map.Entry<Integer, String>entry:map1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
	}

}


/*Output
 * Hello
null
3: Three
6: Six
8: Hello
*/

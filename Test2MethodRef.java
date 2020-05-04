import java.util.ArrayList;
import java.util.List;

public class Test2MethodRef {

	public static void main(String[] args) {

//		List names = new ArrayList(); //works but with warnings
    	List<String> names = new ArrayList<String>();
		

		names.add("Neha");
		names.add("Myra");
		names.add("Kyra");
		names.add("Krish");
		names.add("Yash");
		
		names.forEach(System.out::println);
 	}

}

/* Output
Neha
Myra
Kyra
Krish
Yash
*/
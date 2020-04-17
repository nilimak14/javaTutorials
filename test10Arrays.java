
public class test10Arrays {

	public static void main(String[] args) {
		
		int[] values;
		values = new int[3];
	//	System.out.println(values);
		System.out.println(values[0]);
		
		//Initializing  array
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for ( int i =0; i<values.length; i++) {
			System.out.println(values[i]);
		}
			
		//define and initialize array sametime
		int[] numbers = {5,7,8};
		
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}

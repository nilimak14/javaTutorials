import java.util.Optional;

public class Test3OptionalClass {

	public static void main(String[] args) {
		Test3OptionalClass optClass = new Test3OptionalClass();
		Integer value1 = null;
		Integer value2 = new Integer(10);

		// Optional.ofNullable - allows passed parameter to be null
		Optional<Integer> a = Optional.ofNullable(value1);

		// Optional.of - throws  nullPointerException if passed parameter null
		Optional<Integer> b = Optional.of(value2);
		System.out.println(optClass.sum(a,b));
		
	}
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		
		//Optional.isPresent() checks if value is present or not
		
		System.out.println("First Parameter is present: " + a.isPresent());
		System.out.println("Second Parameter is present: " + b.isPresent());
		
		//Optional.orElse - returns the value if present otherwise returns 
		//the  default value passed
		
		Integer value1 = a.orElse(new Integer(0));
		
		//Optional.get- gets the value, value should be present
		
		Integer value2 = b.get();
		return value1+value2;
				
	}

}


/*Output
First Parameter is present: false
Second Parameter is present: true
10
*/


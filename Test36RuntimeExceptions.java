
public class Test36RuntimeExceptions {

	public static void main(String[] args) {

   /*
		int value = 7;
    value = value/0; // this is runtime exception
    */
    // it is not mandatory to handle runtime exceptions
		// But we can handle it if we want
	/*    try {
		String[] texts = {"one", "two", "three"};
		System.out.println(texts[3]);  // will give runtime exception as texts[3] does not have any value
	    
	    }
	   catch( Exception e){
		   System.out.println(e.toString());
	   }
	    */
	  //Instead of Excception, we can use RunTimeException or any specific exception that we know  
	    try {
			String[] texts = {"one", "two", "three"};
			System.out.println(texts[3]);  // will give runtime exception as texts[3] does not have any value
		    
		    }
		//   catch( RuntimeException e){
		// or
			  catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println(e.toString());
		   }
	}

}

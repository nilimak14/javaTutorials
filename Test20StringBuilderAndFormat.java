
public class Test20StringBuilderAndFormat {

	public static void main(String[] args) {
		// Doing this is inefficient way
		String info = "";
		info += "My name is Myra.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		// same result can be obtained using StrinBuilder in more efficient way
		
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Kiara.");
		sb.append(" ");
		sb.append("I am a String Builder.");
		
		System.out.println(sb.toString());
		
		// another way to do using StringBuilder
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Rita.")
		 .append(" ")
		 .append("I am a skydiver");
		
		System.out.println(s.toString());
		
		///////Formating  Strings //////
		
	//	System.out.println("Here is some text. \tThat is tab. \nThat is new line"); //Cursor is on new line
		System.out.print("Here is some text. \tThat is tab. \nThat is new line"); //Cursor is on same line
		
		System.out.println(); // just printing new line
	   // using Format characters
		System.out.printf("Total cost is %d and quantity is %d", 5, 100);
		
		//puting spaces before or  after
		System.out.printf("\nTotal cost is %10d", 5);// spaces before
		System.out.printf("\nTotal cost is %-10d and thats it", 5);//spaces after
		
		System.out.println(); // just printing new line
		
		//using for loop for more formatting
		
		// Formatting Integers
		for (int i=0; i<20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		//using %s formatting Strings
		
		for (int i=0; i<5; i++) {
			System.out.printf("%s", "My name is Lara\n");// \n is used for new line
		}
		
		//Formatting Floating  point values using  %f
		
		System.out.printf("Total Value is %f\n", 5.6);
		
		// if want to print 2 decimal point
		System.out.printf("Total Value is %.2f\n", 5.6);
		
		System.out.printf("Total Value is %.2f\n", 5.634567); // will print  only 5.63
		
		// if want to print 4 decimal point
		System.out.printf("Total Value is %.4f\n", 5.6);
		
		// if want to print 4 decimal point
		System.out.printf("Total Value is %.4f\n", 5.634); //will print 5.6340
		
		
		System.out.printf("Total Value is %5.2f\n", 245.634); //will print 245.6 total 5 including decimal point
		
		System.out.printf("Total Value is %7.2f\n", 245.634); //will print " 245.63" total 7 including decimal point
		                                                      // puts space before
		System.out.printf("Total Value is %7.1f\n", 245.634);// will print "  245.6" with one decimal point and 2 spaces before 
		                                                     // so total is 7
		
		System.out.printf("Total Value is %-7.1f\n", 245.634);// will print "245.6  " with one decimal point and 2 spaces after 
                                                              // so total is 7

	}

}

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test35MultipleExceptions {

	public static void main(String[] args) {
		Test35aMultiExceptions test1 = new Test35aMultiExceptions();
// try ...catch
	/*	try {
			test1.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not parse cocmmand line");
		} */
// try ..multi catch can handle multiple exceptions in one catch
		
	/*	try {
			test1.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		// Calling Exception which is parent to all Exceptions
		// IOException / ParseException and all other exceptions are subclasses of Exception class
		try {
			test1.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		// in below code , FileNotFoundException has to be first.
		// if IOException is first then, it will handle FileNotFoundException, as it is subclass of 
		// IOException.
		try {
			test1.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}

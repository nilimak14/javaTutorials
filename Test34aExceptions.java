//Using  try ...catch

package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test34aExceptions {

	public static void main(String[] args) {
		File file = new File("test1.txt"); 
		try {
			FileReader fr = new FileReader(file);
			//This code will not execute if an exception is thrown
			System.out.println("Continuing...");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		}
		
		// it will start executing code after this in both the case if an exception is thrown or not
		System.out.println("Finished");

	}

}
